public class DogTester {
    public static void main(String[] args) {
        Dog d1 = new Dog("Tim", "Jim", 7, 145);
        Dog d2 = new Dog("Wally", "Thomas", 4, 891);
        Dog d3 = new Dog();
        Dog d7 = new Dog("Yongo", "Thomas", 8, 8);
        Dog dogEquals1 = new Dog("Alfred", "Pam", 9, 189);
        Dog dogEquals2 = new Dog("Alfred", "Pam", 9, 189);


        System.out.println("----- ToString -----");
        System.out.println("");
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(d3.toString());
        System.out.println("");

        System.out.println("");
        System.out.println("----- Setters && Getters -----");
        System.out.println("");
        d1.setAge(8);
        d1.setName("Wilson");
        System.out.println("Get dog1's age: " + d1.getAge());
        System.out.println("Get dog1's name: " + d1.getName());
        System.out.println("");

        System.out.println("");
        System.out.println("----- Generating DogChar() -----");
        System.out.println("");
        System.out.println(PawesomeUtils.generateDogChar(145));
        System.out.println(PawesomeUtils.generateDogChar(891));
        System.out.println(PawesomeUtils.generateDogChar(132));
        System.out.println("");

        System.out.println("");
        System.out.println("----- Generating DogTag() -----");
        System.out.println("");
        System.out.println(PawesomeUtils.generateDogTag(d1.getDogId(), d1.getDogChar()));
        System.out.println(PawesomeUtils.generateDogTag(d2.getDogId(), d2.getDogChar()));
        System.out.println(PawesomeUtils.generateDogTag(d3.getDogId(), d3.getDogChar()));
        System.out.println("");

        System.out.println("");
        System.out.println("----- Pickup -----");
        System.out.println("");
        Dog d4 = new Dog("Thompson", "Maria", 8, 981);
        System.out.println(Dog.pickup(d4, "Maria"));
        System.out.println(Dog.pickup(d1, "John"));
        System.out.println("In Facility: " + d4.isStillInFacility());
        System.out.println("In Facility: " + d1.isStillInFacility());
        System.out.println("");

        System.out.println("");
        System.out.println("----- CheckIn() -----");
        System.out.println("");
        Dog d5 = new Dog("Harold", "Mikee", 99, 548);
        d5.setStillInFacility(false);
        PawesomeUtils.checkIn(d5, "NewOwner");
        System.out.println("In facility: " + d5.isStillInFacility());
        System.out.println("NewOwner: " + d5.getOwnerName());
        System.out.println("");

        System.out.println("");
        System.out.println("----- ToString -----");
        System.out.println("");
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println("");

        System.out.println("");
        System.out.println("----- EqualsOther -----");
        System.out.println("");
        System.out.println(d1.equals(d2));
        System.out.println(d2.equals(d3));
        System.out.println(dogEquals1.equals(dogEquals2));
        System.out.println("");

        System.out.println("----- ValidateDogId() -----");
        System.out.println("");
        System.out.println(PawesomeUtils.validateDogId(d1.getDogId()));
        System.out.println(PawesomeUtils.validateDogId(34));
        System.out.println(PawesomeUtils.validateDogId(10000));
        System.out.println("");

        System.out.println("----- ValidateDogTag() -----");
        System.out.println(""); 
        System.out.println("Validate d1: " + PawesomeUtils.validateDogTag(d1));
        System.out.println("Validate d2: " + PawesomeUtils.validateDogTag(d2));
        System.out.println("Validate d3: " + PawesomeUtils.validateDogTag(d3));
        System.out.println("Validate d7: " + PawesomeUtils.validateDogTag(d7));
        System.out.println("");

        System.out.println("----- Convert Age -----");
        System.out.println("");
        System.out.println("Dog age to Human age: " + PawesomeUtils.convertAgeToHumanAge(d3));
        System.out.println("Human age to Dog age: " + PawesomeUtils.converateAgetoDogYears(49));
        System.out.println("");
    }
}