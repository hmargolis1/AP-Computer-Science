public class Meerkat extends Animal {
    private String name;
    private String habitat;
    private String[] diet;
    private int age;
    private String movementType;
    private boolean standingUp;
    private double weight;
    private double height;
    private boolean isHungry;
    private String type;

    public Meerkat(String name, String habitat, String[] diet, int age, String movementType,
            boolean standingUp, double weight, double height, boolean isHungry, String type) {
        super(age, weight, height, isHungry, type);
        this.name = name;
        this.habitat = habitat;
        this.diet = diet;
        this.age = age;
        this.movementType = movementType;
        this.standingUp = standingUp;
        this.weight = weight;
    }

    public Meerkat() {
        super(12, 850, 5, true, "Meerkat");
        String[] newDiet = { "beetles", "termites", "spiders", "reptile" };
        this.name = "Jimmy";
        this.habitat = "South Africa";
        this.diet = newDiet;
        this.movementType = "Running";
        this.standingUp = true;
    }

    public void makeNoise() {
        System.out.println("eek");
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean isHungry) {
        this.isHungry = isHungry;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String[] getDiet() {
        return diet;
    }

    public void setDiet(String[] diet) {
        this.diet = diet;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        this.movementType = movementType;
    }

    public boolean isStandingUp() {
        return standingUp;
    }

    public void setStandingUp(boolean standingUp) {
        this.standingUp = standingUp;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String toString() {
        String result = "----- Meerkat ----- \n Diet: [";
        String end = diet[diet.length];
        for (int i = 0; i < diet.length - 1; i++) {
            result += diet[i] + ", ";
        }
        result = end + "]\n";
        result += "Name: " + name + " Habitat: " + habitat
                + ", age: " + age + ", MovementType: " + movementType + ", StandingUp "
                + standingUp + ", WeightGrams: " + weight + ", Height: " + height + ", isHungry: " + isHungry
                + ", Species: " + type;
        return result;
    }

    public void eat() {
        weight += 400;
        System.out.println("The Meerkat's new weight is: " + weight + "g");
    }

    public void eatPoisonSpider() {
        if (age > 5) {
            age -= 5;
            System.out.println("Age: " + age);
        } else
            age = 0;
        if (age == 0) {
            System.out.println(name + " has died.");
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}