public class Course {

    // Instance variables
    private String courseName;
    private StudentRecord[] enrolledStudents;

    // Constructors
    public Course(String courseName, StudentRecord[] enrolledStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public StudentRecord[] getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(StudentRecord[] enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    @Override
    public String toString() {
        int count = 0;
        String result = "== " + courseName + " ==\n";

        for (int x = 0; x < enrolledStudents.length; x++) {
            count++;
            result += count + ".) " + enrolledStudents[x].toString() + "\n";
        }

        return result;
    }

    public String findBestStudent() {
        StudentRecord bestStudent = enrolledStudents[0];

        for (int x = 1; x < enrolledStudents.length; x++) {
            if (enrolledStudents[x].getFinalAverage() > bestStudent.getFinalAverage()) {
                bestStudent = enrolledStudents[x];
            }
        }

        return bestStudent.getName();
    }

    public double calculateTestAverage(int test) {
        double addedTests = 0.0;
        int count = 0;

        for (int x = 0; x < enrolledStudents.length; x++) {
            addedTests += enrolledStudents[x].getTestScore(test);
            count++;
        }

        return addedTests / (double) count;
    }
}
