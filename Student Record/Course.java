public class Course {

    // Instance variables
    private String courseName;
    private StudentRecord[] enrolledStudents;

    // Constructors
    public Course(String courseName, StudentRecord[] enrolledStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
    }

    public Course(String courseName, int maxEnrollment) {
        this.courseName = courseName;
        this.enrolledStudents = new StudentRecord[maxEnrollment];
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
            if (enrolledStudents[x] != null) {
                result += count + ".) " + enrolledStudents[x].toString() + "\n";
            } else {
                result += count + ".)" + " Null" + "\n";
            }

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

    public boolean isFull() {
        int count = 0;
        for (int x = 0; x < enrolledStudents.length; x++) {
            if (enrolledStudents[x] != null) {
                count++;
            }
        }
        if (count == enrolledStudents.length) {
            return true;
        }
        return false;
    }

    public void enrollStudent(StudentRecord student) {
        for (int x = 0; x < enrolledStudents.length; x++) {
            if (enrolledStudents[x] == null) {
                enrolledStudents[x] = student;
                return;
            }
        }
        return;
    }

    public boolean dropStudent(StudentRecord student) {
        for (int x = 0; x < enrolledStudents.length; x++) {
            if (enrolledStudents[x] == student) {
                enrolledStudents[x] = null;
                return true;
            }
        }
        return false;
    }

    public int countEnrolledStudents() {
        int count = 0;
        for (int x = 0; x < enrolledStudents.length; x++) {
            if (enrolledStudents[x] != null) {
                count++;
            }
        }
        return count;
    }

    public void increaseClassSizeBy(int sizeIncrease) {
        StudentRecord[] newStudentEnroll = new StudentRecord[enrolledStudents.length
                + sizeIncrease];
        for (int x = 0; x < enrolledStudents.length; x++) {
            if (enrolledStudents[x] != null) {
                newStudentEnroll[x] = enrolledStudents[x];
            }
        }
        enrolledStudents = newStudentEnroll;
        return;
    }
}
