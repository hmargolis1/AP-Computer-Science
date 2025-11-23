public class Robot {
    // to-do: change file name, class, and constructor to Robot

    private int[] hallway;
    private int position; // the robot's current position
    private boolean isFacingRight; // true if the robot is facing right

    public Robot(int[] hallwayToClean, int startingPosition) {
        // to-do: implement constructor
        this.hallway = hallwayToClean;
        if(startingPosition < 0) {
            startingPosition = 0;
        }
        this.position = startingPosition;
        this.isFacingRight = true;
    }

    /*
     * Determines if the robot is blocked by a wall (the end of an array)
     * 
     * @return true if the robot is blocked by a wall, false otherwise
     */

    public int[] getHallway() {
        return hallway;
    }

    public void setHallway(int[] hallway) {
        this.hallway = hallway;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public boolean isFacingRight() {
        return isFacingRight;
    }

    public void setFacingRight(boolean isFacingRight) {
        this.isFacingRight = isFacingRight;
    }

    public boolean hallwayCheck() {
        if(hallway == null || position >= hallway.length || position < 0) {
            return false;
        }
        for(int x = 0; x < hallway.length; x++) {
            if(hallway[x] < 0 && x != position) {
                hallway[x] = 0;
            }
        }
        return true;
    }
    public boolean isRobotBlockedByWall() {
        if (isFacingRight && position + 1 >= hallway.length || !isFacingRight && position - 1 < 0) {
            return true;
        }
        return false;
    }

    /*
     * Commands the robot to pick up an item, move forward or turn around
     */
    public void move() {
        if(hallwayCheck() == false) {
            System.out.println("That is an invalid Hallway/Position.");
            return;
        }
        if(hallway[position] > 0) {
            hallway[position]--;
            if(isRobotBlockedByWall()) {
            isFacingRight = !isFacingRight;
            }
            return;
        }
        if(hallway[position] == 0 && isFacingRight && !isRobotBlockedByWall()) {
                position++;
                return;
            }
        if(hallway[position] == 0 && !isFacingRight && !isRobotBlockedByWall()) {
                position--;
                return;
            }
        if(isRobotBlockedByWall()) {
            isFacingRight = !isFacingRight;
            return;
        }
    }

    /**
     * This method displays the current state of the robot and the hallway. It then
     * calls the move() method and counts the number of moves it takes to clear the
     * hallway. The method should display the current state of the robot after each
     * move.
     * 
     * @return the number of moves made
     */

    public int clearHall() {
        if(hallwayCheck() == false) {
            return 0;
        }
        int count = 0;
        displayState();
        while(hallIsClear() == false) {
            move();
            count++;
            displayState();
        }
        return count;
    }

    /**
     * This method determines if the hallway contains any items.
     * 
     * @return a boolean value indicating if the hallway contains any items
     */
    public boolean hallIsClear() {
        if(hallwayCheck() == false) {
            return false;
        }
        int checker = 0;
        for(int x = 0; x < hallway.length; x++) {
            checker += hallway[x];
        }
        if(checker == 0) {
            return true;
        }
        return false;
    }

    /*
     * Displays the current state of the robot and the hallway.
     */
    public void displayState() {
        if(hallwayCheck() == false) {
            System.out.println("That is an invalid hallway/position");
            return;
        }
        String fullHallway = "";
        String robotSpot = "";
        String endHallway = "" + hallway[hallway.length - 1];
        for(int x = 0; x<hallway.length - 1; x++) {
            fullHallway += hallway[x] + " ";
        }
        for(int y = 0; y<position * 2; y++) {
            robotSpot += " ";
        }
        if(isFacingRight) {
            robotSpot = robotSpot + ">";
        } else {
            robotSpot = robotSpot + "<";
        }
        System.out.println(fullHallway + endHallway);
        System.out.println(robotSpot);
    }
}