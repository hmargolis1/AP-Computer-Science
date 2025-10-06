public class DogTester {
    public static void main(String[] args) {
        Dog d1 = new Dog("Tim", "Jim", 7, 145);
        Dog d2 = new Dog("Wally", "Thomas", 4, 891);
        Dog d3 = new Dog();
        Dog dogEquals1 = new Dog("Alfred", "Pam", 9, 189);
        Dog dogEquals2 = new Dog("Alfred", "Pam", 9, 189);


        System.out.println("----- ToString -----");
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(d3.toString());
        System.out.println("");

        System.out.println("");
        System.out.println("----- Setters && Getters -----");
        d1.setAge(8);
        d1.setName("Wilson");
        System.out.println("Get dog1's age: " + d1.getAge());
        System.out.println("Get dog1's name: " + d1.getName());
        System.out.println("");

        System.out.println("");
        System.out.println("----- Generating DogChar() -----");
        System.out.println(Dog.generateDogChar(145));
        System.out.println(Dog.generateDogChar(891));
        System.out.println(Dog.generateDogChar(132));
        System.out.println("");

        System.out.println("");
        System.out.println("----- Generating DogTag() -----");
        System.out.println(d1.generateDogTag());
        System.out.println(d2.generateDogTag());
        System.out.println(d3.generateDogTag());
        System.out.println("");

        System.out.println("");
        System.out.println("----- Pickup -----");
        Dog d4 = new Dog("Thompson", "Maria", 8, 981);
        System.out.println(Dog.pickup(d4, "Maria"));
        System.out.println(Dog.pickup(d1, "John"));
        System.out.println("In Facility: " + d4.isStillInFacility());
        System.out.println("In Facility: " + d1.isStillInFacility());
        System.out.println("");

        System.out.println("");
        System.out.println("----- CheckIn() -----");
        Dog d5 = new Dog("Harold", "Mikee", 99, 548);
        d5.setStillInFacility(false);
        Dog.checkIn(d5, "NewOwner");
        System.out.println("In facility: " + d5.isStillInFacility());
        System.out.println("NewOwner: " + d5.getOwnerName());
        System.out.println("");

        System.out.println("");
        System.out.println("----- ToString -----");
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println("");

        System.out.println("");
        System.out.println("----- EqualsOther -----");
        System.out.println(d1.equals(d2));
        System.out.println(d2.equals(d3));
        System.out.println(dogEquals1.equals(dogEquals2));
        System.out.println("");
    }
}