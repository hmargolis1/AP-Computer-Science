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
            this.choice.equals(RPSGame.generateRandomChoice());
        } else this.choice.equals(newChoice);
    }

    public String toString() {
        return "Opponent chose " + choice + ".";
    }
}