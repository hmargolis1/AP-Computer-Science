public class Robot {
    // to-do: change file name, class, and constructor to Robot

    private int[] hallway;
    private int position; // the robot's current position
    private boolean isFacingRight; // true if the robot is facing right

    public Robot(int[] hallwayToClean, int startingPosition) {
        // to-do: implement constructor
        this.hallway = hallwayToClean;
        this.position = startingPosition;
    }

    /*
     * Determines if the robot is blocked by a wall (the end of an array)
     * 
     * @return true if the robot is blocked by a wall, false otherwise
     */
    public boolean isRobotBlockedByWall() {
        if (position + 1 > hallway.length || position - 1 < 0) {
            return true;
        }
        return false;
    }

    /*
     * Commands the robot to pick up an item, move forward or turn around
     */
    public void move() {
        if(hallway[position] > 0) {
            hallway[position]--;
            if(hallway[position] == 0) {
                return;
            } else {
                if (isRobotBlockedByWall() == true) {
                    isFacingRight = !isFacingRight;
                } else {
                    position++;
                }
            }
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
        int count = 0;
        System.out.println(.displayState());
        return count;
    }

    /**
     * This method determines if the hallway contains any items.
     * 
     * @return a boolean value indicating if the hallway contains any items
     */
    public boolean hallIsClear() {
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
        String fullHallway = "";
        String robotSpot = "";
        String endHallway = "" + hallway[hallway.length - 1];
        for(int x = 0; x<hallway.length - 1; x++) {
            fullHallway += hallway[x] + " ";
        }
        int y = 0;
        while(y < position + 1) {
            robotSpot += " ";
            y++;
        }
        System.out.println(fullHallway + endHallway);
        if(isFacingRight == true) {
            System.out.println(robotSpot + ">");
        } else {
            System.out.println(robotSpot + "<");
        }
    }
}
