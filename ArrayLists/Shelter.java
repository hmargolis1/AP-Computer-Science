import java.util.ArrayList;

public class Shelter {
    // instance variables
    private Dog[][] kennels;

    // constructors
    public Shelter(int rows, int cols) {
        if (rows <= 0 || cols <= 0) {
            throw new IllegalArgumentException("Rows and Cols bad");
        }
        kennels = new Dog[rows][cols];
    }

    /* initializes kennels as a 3x3 2D array */
    public Shelter() {
        kennels = new Dog[3][3];
    }

    // getters and setters
    public Dog[][] getKennels() {
        return kennels;
    }

    public void setKennels(Dog[][] kennels) {
        this.kennels = kennels;
    }

    // methods

    /*
     * prints out the 2D array 'kennels', displaying the dog's info if the kennel is
     * occupied, or
     * 'empty' if the kennel is empty
     */
    public void displayStatus() {
        for (Dog[] row : kennels) {
            for (Dog animal : row) {
                if (animal != null) {
                    System.out.print(animal);
                } else {
                    System.out.print("[Empty]");
                }
            }
            System.out.println();
        }
    }

    public void add(Dog animal) {
        if (animal == null) {
            throw new IllegalArgumentException("Dog cannot be null");
        }
        for (int r = 0; r < kennels.length; r++) {
            for (int c = 0; c < kennels[0].length; c++) {
                if (kennels[r][c] != null) {
                    kennels[r][c] = animal;
                    return;
                }
            }
        }
        System.out.println("No empty kennels");
    }

    public void add(Dog animal, int row, int col) {
        if (animal == null) {
            throw new IllegalArgumentException("Animal cannot be null");
        }
        if (row >= kennels.length || col >= kennels[0].length) {
            throw new IllegalArgumentException("Bad row/col");
        }
        if (row < 0 || col < 0) {
            throw new IllegalArgumentException("Bad row/col");
        }

        if (kennels[row][col] == null) {
            kennels[row][col] = animal;
            return;
        } else {
            add(animal);
        }
        // if (kennels[row][col] != null) {
        // for (int r = 0; r < kennels.length; r++) {
        // for (int c = 0; c < kennels[0].length; c++) {
        // if (kennels[r][c] == null) {
        // kennels[r][c] = animal;
        // return;
        // }
        // }
        // }
        // }
        // System.out.println("No empty kennels.");
    }

    public void add(ArrayList<Dog> animals) {
        if (animals == null) {
            throw new IllegalArgumentException("Animals cannot be null");
        }
        for (int i = 0; i < kennels.length; i++) {
            for (int j = 0; j < kennels[0].length; j++) {
                if (kennels[i][j] != null) {
                    animals.add(kennels[i][j]);
                } else {
                    System.out.println("No empty kennels.");
                }
            }
        }
    }

    public Dog adopt(int row, int col) {
        if (row >= kennels.length || col >= kennels[0].length) {
            throw new IllegalArgumentException("Bad row/col");
        }
        if (row < 0 || col < 0) {
            throw new IllegalArgumentException("Bad row/col");
        }
        Dog returnDog = kennels[row][col];
        kennels[row][col] = null;
        return returnDog;

    }

    public ArrayList<Dog> search(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        ArrayList<Dog> newDogs = new ArrayList<>();
        for (int r = 0; r < kennels.length; r++) {
            for (int c = 0; c < kennels[r].length; c++) {
                if (kennels[r][c].getName().equals(name)) {
                    newDogs.add(kennels[r][c]);
                }
            }
        }
        return newDogs;
    }

    public ArrayList<Dog> search(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        ArrayList<Dog> newDogs = new ArrayList<>();
        for (int r = 0; r < kennels.length; r++) {
            for (int c = 0; c < kennels[r].length; c++) {
                if (kennels[r][c].getAge() == age) {
                    newDogs.add(kennels[r][c]);
                }
            }
        }
        return newDogs;
    }
}
