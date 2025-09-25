public class StudentTester {
    public static void main(String[] args) {
        Student s1 = new Student("Walter", 11);
        Student s2 = new Student("Johnson", 12);
        Student s3 = new Student("Timmy");
        Student s4 = new Student("Thompson");
        System.out.println("----- ToString -----");
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        System.out.println(s4.toString());
        s1.setGrade(12);
        s2.setGrade(13);
        s3.setGrade(11);
        s4.setGrade(11);
        System.out.println("----- Setters + Getters -----");
        System.out.println(s1.getGrade());
        System.out.println(s2.getGrade());
        System.out.println(s3.getGrade());
        System.out.println(s4.getGrade());
        System.out.println("----- EqualsOther -----");
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s4));
        s2.setLatestOpp(s4);
        s1.setLatestOpp(s3);
        s4.setLatestOpp(s3);
        System.out.println(s1.vibeCheck(s2));
        System.out.println(s1.vibeCheck(s4));
    }
    
}
