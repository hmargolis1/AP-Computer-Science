import java.util.ArrayList;
import java.util.Scanner;

public class DecksAndChecks {

    // ----------------------------
    // CHECKERS (students implement)
    // ----------------------------

    // Rule: no single card may have more than 1 ability
    public static boolean checkOneAbilityPerCard(ArrayList<Card> deck) {
        for (Card card : deck) {
            if (card.abilityCount() > 1) {
                return false;
            }
        }
        return true;
    }

    // Rule: no more than 3 total ability cards in the deck
    public static boolean checkNoMoreThanThreeAbilityCards(ArrayList<Card> deck) {
        int count = 0;
        for (Card card : deck) {
            if (card.hasBastion() == true || card.hasCleave() == true || card.hasRipple() == true) {
                count++;
            }
        }
        if (count > 3) {
            return false;
        }
        return true;
    }

    // Rule: no duplicate abilities in the deck (max one BASTION, one RIPPLE, one
    // CLEAVE)
    public static boolean checkNoDuplicateAbilities(ArrayList<Card> deck) {
        int bCount = 0;
        int cCount = 0;
        int rCount = 0;
        for (Card card : deck) {
            if (card.hasBastion() == true) {
                bCount++;
            }
            if (card.hasCleave() == true) {
                cCount++;
            }
            if (card.hasRipple() == true) {
                rCount++;
            }
        }
        if (bCount > 1 || cCount > 1 || rCount > 1) {
            return false;
        }
        return true;
    }

    // Rule: strength and toughness must be 1..5, and strength+toughness <= 6
    public static boolean checkStatsInRange(ArrayList<Card> deck) {
        for (Card card : deck) {
            if ((card.getStrength() < 1 || card.getStrength() > 5)) {
                return false;
            }
            if (card.getToughness() < 1 || card.getToughness() > 5) {
                return false;
            }
            if (card.getStrength() + card.getToughness() > 6) {
                return false;
            }
            if (card.getStrength() + card.getToughness() <= 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValidDeck(ArrayList<Card> deck) {
        // TODO: return true only if:
        // - deck has size 5
        // - AND all checks return true
        if (deck.size() == 5 && checkNoDuplicateAbilities(deck) == true
                && checkNoMoreThanThreeAbilityCards(deck) == true && checkOneAbilityPerCard(deck) == true
                && checkStatsInRange(deck) == true) {
            return true;
        }
        return false;
    }

    // ----------------------------
    // DECK BUILDERS (students implement)
    // ----------------------------

    // Must create 5 cards, all 3/3, no abilities
    // If the user doesn't want to input a custom deck, this method should return
    // deck
    // of your choice for them to play with.
    public static ArrayList<Card> buildDefaultDeck() {
        ArrayList<Card> deck = new ArrayList<>(5);
        Card card1 = new NamedCard("Jim", (CardType.GRANITE), 3, 3, false, false, false);
        Card card2 = new NamedCard("Tim", (CardType.BLADE), 3, 3, false, false, false);
        Card card3 = new NamedCard("Bim", (CardType.PARCHMENT), 3, 3, false, false, false);
        Card card4 = new NamedCard("Pim", (CardType.GRANITE), 3, 3, false, false, false);
        Card card5 = new NamedCard("Zim", (CardType.BLADE), 3, 3, false, false, false);
        deck.add(card1);
        deck.add(card2);
        deck.add(card3);
        deck.add(card4);
        deck.add(card5);
        return deck;
    }

    // Prompts the user 5 times using Scanner and validates inputs.
    // Required prompt order per card:
    // name, type, strength, toughness, bastion(y/n), ripple(y/n), cleave(y/n)
    public static ArrayList<Card> buildUserDeck(Scanner sc) {
        ArrayList<Card> deck = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            System.out.print("Name of Card: ");
            String name = sc.next();
            System.out.print("Card Type [Granite, Blade, Parchment]: ");
            String typeInput = sc.next();
            CardType cardType = CardType.fromText(typeInput);
            if (cardType == null) {
                System.out.println("Invalid type, defaulting to Granite.");
                cardType = CardType.GRANITE;
            }
            System.out.print("Strength Level 1-5: ");
            int strength = sc.nextInt();
            System.out.print("Toughness Level 1-5: ");
            int toughness = sc.nextInt();
            System.out.print("Bastion Ability (y/n): ");
            boolean bastionYes = isYes(sc.next());
            System.out.print("Cleave Ability (y/n): ");
            boolean cleaveYes = isYes(sc.next());
            System.out.print("Ripple Ability (y/n): ");
            boolean rippleYes = isYes(sc.next());
            Card newCard = new NamedCard(name, cardType, strength, toughness, bastionYes, rippleYes, cleaveYes);
            deck.add(newCard);
        }
        return deck;
    }

    // ----------------------------
    // Optional helpers you may use
    // ----------------------------

    public static boolean isYes(String s) {
        if (s == null)
            return false;
        s = s.trim().toLowerCase();
        return s.equals("y") || s.equals("yes");
    }
}
