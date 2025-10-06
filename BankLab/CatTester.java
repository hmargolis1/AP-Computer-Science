public class CatTester {
    public static void main(String[] args) {
        Cat myCat = new Cat("Betsy", "Tabby"); //1. added new statement
        Cat otherCat = new Cat("Tiger Beast", "Tabby");
        System.out.println(myCat.toString());
        System.out.println("My Cat's Name: " + myCat.getName()); //2. added Sysout

        System.out.println("Are the cat's equal? " + myCat.equals(otherCat)); //3. changed return to Sysout + added space

        System.out.println("Is my cat hungry? " + myCat.getIsHungry()); //4. added Sysout

        String firstName = "Tiger";
        String lastName = "Beast";//5. changed from lastName == "Beast"
        String name = firstName + " " + lastName;

        System.out.println("Changing the cat's name...");
        myCat.setName(name);
        System.out.println("The two cat's are the same now: " + myCat.equals(otherCat));

    }

}