public class CatTester {
    public static void main(String[] args) {
        Cat meow1 = new Cat();
        Cat meow2 = new Cat("Thomas", "Johnson", 9, "8888");
        Cat meow3 = new Cat("Timmy", "Waldo", 6, "4444");
        Cat meow4 = new Cat("Timmy", "Waldo", 6, "4444");
        meow4.setCatChar('A');
        meow4.setCatId("3333");
        meow4.setHungry(false);
        meow4.setMoodLevel(3);
        meow4.setName("Walter");
        meow4.setOwnerName("Petunia");
        System.out.println("----- Setter Getter ----- \n");
        System.out.println(meow4.getCatChar());
        System.out.println(meow4.getCatId());
        System.out.println(meow4.getMoodLevel());
        System.out.println(meow4.getName());
        System.out.println(meow4.getOwnerName());
        System.out.println("----- EqualsOther ----- \n"); 
        System.out.println(meow1.equals(meow2));
        System.out.println("----- BootUp ----- \n");
        PurrfectUtils.bootUp(meow1);
        System.out.println("----- Pet ----- \n");
        PurrfectUtils.pet(meow1);
        System.out.println("----- TrimClaws ----- \n");
        for (int x = 0; x < 4; x++) {
        PurrfectUtils.trimClaws(meow3);
        }
        System.out.println("----- cleanLitterBox ----- \n");
        PurrfectUtils.cleanLitterBox(meow1);
        System.out.println("----- feed ----- \n");
        PurrfectUtils.feed(meow1);
    }
}