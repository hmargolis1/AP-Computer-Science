public class NPC {
    String choice;

    public NPC () {
        this.choice = RPSGame.generateRandomChoice();
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String newChoice) {
        newChoice.toLowerCase();
        if (RPSGame.validateChoice(newChoice) == false) {
            this.choice = RPSGame.generateRandomChoice();
        } else this.choice = newChoice;
    }

    public String toString() {
        return "Opponent chose " + choice + ".";
    }
}