import java.util.ArrayList;

public class TestResults {
    private ArrayList<String> answerKey;
    private ArrayList<StudentAnswerSheet> submissions;

    public TestResults(ArrayList<String> key, ArrayList<StudentAnswerSheet> submissions) {
        if (key == null || submissions == null) {
            throw new IllegalArgumentException();
        }
        this.answerKey = key;
        this.submissions = submissions;
    }

    public ArrayList<String> getAnswerKey() {
        return answerKey;
    }

    public void setAnswerKey(ArrayList<String> answerKey) {
        this.answerKey = answerKey;
    }

    public ArrayList<StudentAnswerSheet> getSubmissions() {
        return submissions;
    }

    public void setSubmissions(ArrayList<StudentAnswerSheet> submissions) {
        this.submissions = submissions;
    }

    public void submit(StudentAnswerSheet student) {
        submissions.add(student);
    }

    public void gradeTests() {
        for (int i = 0; i < submissions.size(); i++) {
            StudentAnswerSheet student = submissions.get(i);
            double grade = student.getGrade(answerKey);
            student.setTestScore(grade);
        }
    }

    public String highestScoringStudent() {
        if (submissions == null) {
            throw new IllegalArgumentException("null");
        }
        if (submissions.size() == 0) {
            return "";
        }
        if (answerKey == null) {
            throw new IllegalArgumentException("null");
        }
        StudentAnswerSheet largestStudent = submissions.get(submissions.size() - 1);
        double largestGrade = submissions.get(submissions.size() - 1).getTestScore();
        for (int i = 0; i < submissions.size() - 1; i++) {
            StudentAnswerSheet student = submissions.get(i);
            if (student.getTestScore() > largestGrade) {
                largestGrade = submissions.get(i).getTestScore();
                largestStudent = submissions.get(i);
            }
        }
        for (int j = 0; j < submissions.size(); j++) {
            if (submissions.get(j).getTestScore() == largestStudent.getTestScore()) {
                largestStudent = submissions.get(j);
                break;
            }
        }
        return largestStudent.getName();
    }
}
