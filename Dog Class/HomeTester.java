public class HomeTester {
    public static void main(String[] args) {
        Home person1 = new Home();
        Home person4 = new Home();
        Home person2 = new Home("12454", "Tim Johnson", 5);
        Home person3 = new Home("12454", "     Tim     Johnson    ", 5);
        System.out.println(person1.toString());
        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person4));
        person3.setCleanlinessLevel(2);
        System.out.println(CleanUtils.fixName("   The   Person   "));
        System.out.println(CleanUtils.generateUsername("Theon Johnson"));

    }

}
