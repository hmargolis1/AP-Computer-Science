public class Player {
    String name;
    String choice;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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
        return name + " chose " + choice + ".";
    }
}