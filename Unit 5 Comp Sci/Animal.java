public abstract class Animal {
    private int age;
    private double weight;
    private double height;
    private boolean isHungry;
    private String type;

    public Animal(int age, double weight, double height, boolean isHungry, String type) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.isHungry = isHungry;
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        return "Age: " + age + ", Weight: " + weight + ", Height: " + height + ", isHungry: " + isHungry
                + ", AnimalType: " + type;
    }

    public void eat() {
        if (isHungry == true) {
            weight += 100;
            height += 10;
        } else {
            System.out.println("Animal not Hungry");
        }
    }

    public abstract void makeNoise();
}
