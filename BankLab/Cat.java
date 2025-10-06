public class Cat { //decapitlizied Public and removed s from Cats
	private String name;
	private String breed;
	private boolean isHungry;
	private int livesRemaining;
	
	//1. 2-Parameter Constructor + made it 2 parameters
	public Cat(String name, String breed) { //2. Capitilized C.
		this.name = name; //3. added this statements.
		this.breed = breed;
		this.isHungry = true; //4. made yes be true.
		this.livesRemaining = 9; //5. added this statement for consistency
	}

	public String getName() { //6. made method a String.
		return name;
	}

	public void setName(String newName) {
		this.name = newName ; //7. made it newName
	}

	public boolean getIsHungry() { //8. made method a boolean + added whitespace + capitlized Is.
		return isHungry;
	}
// 9. added setters/getters

    public void setIsHungry(boolean newHunger) {
        this.isHungry = newHunger;
    }
    public String getBreed() {
        return breed;
    }

    public void setBreed(String newBreed) {
        this.breed = newBreed;
    }

    public int getLivesRemaining() {
        return livesRemaining;
    }

    public void setLivesRemaining(int newLivesRemaining) {
        this.livesRemaining = newLivesRemaining;
    }

	public boolean feed() { //10. added return statement
		return this.isHungry = false;
	}

	public boolean equals(Cat other) {
		return this.name.equals(other.name) && this.breed.equals(other.breed) //11. made it .equals
			&& this.livesRemaining == other.livesRemaining && this.isHungry == other.isHungry; //12. made =, == and isHungry
	}

	public String toString() {
		return name + " is of breed " + breed + " and has " + livesRemaining + " lives remaining." + " They are hungry: " + isHungry; //13. added return statement/removed Sysout. And added isHungry.
	}
}