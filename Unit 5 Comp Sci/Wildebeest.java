public class Wildebeest extends Animal {
    private String name;
    private String habitat;
    private String[] diet;
    private int age;
    private String movementType;
    private boolean isFighting;
    private double weight;
    private double height;
    private boolean isHungry;
    private String type;

    public Wildebeest(String name, String habitat, String[] diet, int age, String movementType,
            boolean isFighting, double weight, double height, boolean isHungry, String type) {
        super(age, weight, height, isHungry, type);
        this.name = name;
        this.habitat = habitat;
        this.diet = diet;
        this.movementType = movementType;
        this.isFighting = isFighting;
    }

    public Wildebeest() {
        super(12, 270, 10, true, "Wildebeest");
        String[] newDiet = { "Tall Grass", "Short Grass" };
        this.name = "Jimmy";
        this.habitat = "South Africa";
        this.diet = newDiet;
        this.movementType = "Running";
        this.isFighting = true;
    }

    public void makeNoise() {
        System.out.println("Wowrowor");
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean isHungry) {
        this.isHungry = isHungry;
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

    public boolean isFighting() {
        return isFighting;
    }

    public void setFighting(boolean isFighting) {
        this.isFighting = isFighting;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeightKg(double weight) {
        this.weight = weight;
    }

    public String toString() {
        String result = "----- Wildebeest ----- \n Diet: [";
        String end = diet[diet.length];
        for (int i = 0; i < diet.length - 1; i++) {
            result += diet[i] + ", ";
        }
        result = end + "]\n";
        result += "Name: " + name + " Habitat: " + habitat
                + ", Age: " + age + ", MovementType: " + movementType + ", isFighting: "
                + isFighting + ", Weight: " + weight + ", Species: " + type;
        return result;
    }

    public void eat() {
        weight += 100;
        System.out.println("The Widldebeest's new weight is: " + weight + "kg");
    }

    public void skewer() {
        if (isFighting == true && weight > 210) {
            System.out.println("The Wildebeest brutally skewered its foe.");
        } else {
            System.out.println("The Wildebeest is puny and did not skewer foe.");
        }
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
