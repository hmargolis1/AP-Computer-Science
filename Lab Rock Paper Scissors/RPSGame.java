import java.util.Scanner;
public class RPSGame {
    private Player player;
    private NPC opponent;

    public RPSGame(Player player, NPC opponent) {
        this.player = player;
        this.opponent = opponent;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public NPC getOpponent() {
        return opponent;
    }

    public void setOpponent(NPC opponent) {
        this.opponent = opponent;
    }

    public static boolean validateChoice(String choice) {
        if(choice.equals("rock") || choice.equals("paper") || choice.equals("scissors")) {
            return true;
        } 
        return false;
    }

    public static String generateRandomChoice() {
        int betweenThree = (int) (Math.random() * 3) +1;
        if (betweenThree == 1) {
            return "rock";
        }
        if (betweenThree == 2) {
            return "paper";
        }
        return "scissors";
    }

    public void start() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?: ");
        String name = scan.next();
        System.out.println("What is your choice (Rock, Paper, Scissors)?: ");
        String choice = scan.next();
        scan.close();
        while()
    }

    public void setPlayerValues(String name, String choice) {
        player.setName(name);
        player.setChoice(choice);
    }
}