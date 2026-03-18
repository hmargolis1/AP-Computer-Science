import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CardBattleGame {

    // TODO: Implement the full game.
    // Must print:
    // == CARD CLASH ==
    // Starting: Player/Bot
    // Winner: Player/Bot
    public static String playGame(ArrayList<Card> playerDeck, ArrayList<Card> botDeck, Random rng) {
        System.out.println("== CARD CLASH ==");

        PlayerState player = new PlayerState("Player", playerDeck);
        PlayerState bot = new PlayerState("Bot", botDeck);

        // Coin flip to decide who starts
        boolean playerTurn = rng.nextBoolean();
        System.out.println("Starting: " + (playerTurn ? "Player" : "Bot"));

        // Main game loop
        while (player.hasAnythingLeft() && bot.hasAnythingLeft()) {
            PlayerState attacker;
            PlayerState defender;

            if (playerTurn == true) {
                attacker = player;
                defender = bot;
            } else {
                attacker = bot;
                defender = player;
            }

            drawAndPlayIfNeeded(attacker, defender); // Draw card if needed
            attackOnce(attacker, defender); // Attack if possible

            // Remove defeated cards
            if (player.active != null && player.active.isDefeated()) {
                System.out.println(player.active.getName() + " is defeated!");
                player.active = null;
            }
            if (bot.active != null && bot.active.isDefeated()) {
                System.out.println(bot.active.getName() + " is defeated!");
                bot.active = null;
            }

            // Swap turns
            playerTurn = !playerTurn;
        }

        // Determine winner
        String winner;
        if (player.hasAnythingLeft()) {
            winner = "Player";
        } else {
            winner = "Bot";
        }

        System.out.println("Winner: " + winner);
        return winner;
    }

    // ----- helpers you may implement or use -----

    // Draw top card if no active, apply on-play effects
    public static void drawAndPlayIfNeeded(PlayerState self, PlayerState other) {
        if (self.active == null && !self.deck.isEmpty()) {
            Card newCard = self.deck.remove(0);
            self.active = newCard;

            System.out.println(self.name + " plays " + newCard.getName());

            Ability ability = newCard.resolvedAbility();
            newCard.applySelfOnPlay(ability);

            // Handle RIPPLE immediately
            if (ability == AbilityLibrary.RIPPLE) {
                if (other.active != null) {
                    System.out.println(self.name + "'s RIPPLE hits " + other.active.getName() + " for 1 damage");
                    other.active.takeDamage(1);
                } else {
                    System.out.println(self.name + "'s RIPPLE will hit next card");
                    other.pendingDamage += 1;
                }

                // Cycle: move this card to bottom of deck
                self.deck.add(newCard);
                self.active = null;

                // Draw next card if any
                if (!self.deck.isEmpty()) {
                    newCard = self.deck.remove(0);
                    self.active = newCard;
                    System.out.println(self.name + " draws " + newCard.getName());
                    newCard.applySelfOnPlay(newCard.resolvedAbility());
                }
            }
        }
    }

    // One attack (self active attacks other active if both exist)
    public static void attackOnce(PlayerState attacker, PlayerState defender) {
        if (attacker.active == null || defender.active == null)
            return;

        int damage = attacker.active.computeDamageAgainst(defender.active);
        System.out.println(
                attacker.active.getName() + " attacks " + defender.active.getName() + " for " + damage + " damage");
        defender.active.takeDamage(damage);

        // Apply pending RIPPLE damage if any
        if (attacker.pendingDamage > 0 && defender.active != null) {
            System.out.println(attacker.name + "'s pending RIPPLE hits " + defender.active.getName() + " for "
                    + attacker.pendingDamage + " damage");
            defender.active.takeDamage(attacker.pendingDamage);
            attacker.pendingDamage = 0;
        }
    }

    // Optional local run (not graded)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Card> player = DecksAndChecks.buildDefaultDeck();
        ArrayList<Card> bot = BotFactory.buildBotDeck();

        if (!DecksAndChecks.isValidDeck(player)) {
            System.out.println("Player deck invalid!");
            return;
        }

        playGame(player, bot, new Random());
    }
}
