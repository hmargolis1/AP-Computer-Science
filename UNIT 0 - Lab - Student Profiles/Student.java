public class Student {

    private String name;
    private String id;
    private int grade;
    private Student latestOpp;
    private Student recentFriend;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.id = generateId();
    }

    public Student(String name) {
        this.name = name;
        this.grade = 10;
        this.id = generateId();
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public String getId() {
        return id;
    }

    public Student getLatestOpp() {
        return latestOpp;
    }

    public Student getRecentFriend() {
        return recentFriend;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setLatestOpp(Student latestOpp) {
        this.latestOpp = latestOpp;
    }

    public void setRecentFriend(Student recentFriend) {
        this.recentFriend = recentFriend;
    }

    public String vibeCheck(Student other) {
        if (latestOpp == other.latestOpp) {
            recentFriend = other.recentFriend;
            return name + " and " + other.name + " are now friends!";
        }
        return "They still hate eachother...";
    }

    public String toString() {
        return "The Student's name is: " + name + ", the Student's grade level is: " 
            + grade + ", and the Student's id is: " + id;
    }

    public boolean equals(Student other) {
        return this.name.equals(other.name) 
            && this.grade == other.grade && this.id.equals(other.id);
    }

    public String generateId() {
        String newId = "";
        for (int x = 0; x < 3; x++) {
            newId += (int) (Math.random() * 7 + 1);
        }
        newId += "-";
        for (int y = 0; y < 4; y++) {
            newId += (int) (Math.random() * 10);
        }
        return newId;
    }
}
