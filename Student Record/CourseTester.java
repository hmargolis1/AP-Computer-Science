public class CourseTester {
    public static void main(String[] args) {
        int[] score1 = new int[] {84, 93, 23, 45};
        int[] score2 = new int[] {78, 80, 88, 95};
        int[] score3 = new int[] {84, 93, 23, 45};
        StudentRecord s1 = new StudentRecord("Johnson", score1);
        StudentRecord s2 = new StudentRecord("Shaniqua", score2);
        StudentRecord s3 = new StudentRecord("Johnson", score3);
        StudentRecord[] students = new StudentRecord[] {s1, s2, s3};
        Course student = new Course("Computer Science", students);
        System.out.println("Testing toString: " + s1.toString());
        System.out.println(s1.toString().equals("Johnson's scores: [84, 93, 23, 45]"));
        System.out.println("-----");
        System.out.println("Testing getAverage: " + s1.getAverage(0, 4));
        System.out.println(s1.getAverage(0, 4) == 61.25);
        System.out.println("-----");
        System.out.println("Testing getTestScore: ");
        System.out.println(s1.getTestScore(1) == 93);
        System.out.println("-----");
        System.out.println("Testing getFinalAverage: ");
        System.out.println(s1.getFinalAverage());
        System.out.println("-----");
        System.out.println("Testing hasImproved: ");
        System.out.println(s1.hasImproved());
        System.out.println(s2.hasImproved());
        System.out.println("-----");
        System.out.println("Testing equalsOther: ");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println("-----");
        System.out.println("Testing toString: ");
        System.out.println(student.toString());
        System.out.println("-----");
        System.out.println("Testing findBestStudent: ");
        System.out.println(student.findBestStudent());
        System.out.println("-----");
        System.out.println("Testing calculateTestAverage: ");
        System.out.println(student.calculateTestAverage(1));
    }
}
