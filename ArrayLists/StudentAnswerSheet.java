import java.util.ArrayList;

public class StudentAnswerSheet {
    private String name;
    private double testScore;
    private ArrayList<String> answers;

    public StudentAnswerSheet(String name, ArrayList<String> answers) {
        this.name = name;
        this.testScore = 0.0;
        this.answers = answers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTestScore() {
        return testScore;
    }

    public void setTestScore(double testScore) {
        this.testScore = testScore;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    public double getGrade(ArrayList<String> key) {
        if (key == null) {
            throw new IllegalArgumentException("Key is null");
        }
        if (key.size() <= 1) {
            throw new IllegalArgumentException("Key is empty");
        }
        if (key.size() != answers.size()) {
            throw new IllegalArgumentException("Not the Same size");
        }
        int correct = 0, incorrect = 0;
        for (int i = 0; i < key.size(); i++) {
            if (answers.get(i) == "?") {
            } else if (answers.get(i) == key.get(i)) {
                correct++;
            } else {
                incorrect++;
            }
        }
        return ((double) correct) - ((double) incorrect * 0.25);
    }
}
