public class StudentRecord {

    // Instance variables
    private String name;
    private int[] scores;

    // Constructors
    public StudentRecord(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        String finalString = "";
        String end = "" + scores[scores.length - 1];

        for (int x = 0; x < scores.length - 1; x++) {
            finalString += scores[x] + ", ";
        }
        if (name == null) {
            name = "Nullname";
        }
        return name + "'s scores: " + "[" + finalString + end + "]";
    }

    public boolean equals(StudentRecord other) {
        boolean scoreCheck = true;

        for (int x = 0; x < scores.length; x++) {
            if (scores[x] != other.getScores()[x]) {
                scoreCheck = false;
            }
        }

        return this.name.equals(other.getName()) && scoreCheck;
    }

    /**
     * Returns the average (arithmetic mean) of values in scores.
     * Precondition: 0 <= first < last < scores.length.
     *
     * @param first the first index of the scores array
     * @param last  the last index of the scores array
     * @return the average of the values in the given range
     */
    public double getAverage(int first, int last) {
        double total = 0.0;
        int count = 0;

        for (int x = first; x < last; x++) {
            total += scores[x];
            count++;
        }

        return total / (double) count;
    }

    /**
     * Determines if each value in scores is greater than or equal
     * to the previous value.
     *
     * @return true if the student has improved, false otherwise
     */
    public boolean hasImproved() {
        for (int x = 1; x < scores.length; x++) {
            if (scores[x] < scores[x - 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * If the student has improved, returns the average of the top half
     * of the scores array. Otherwise, returns the average of all scores.
     *
     * @return the final average score
     */
    public double getFinalAverage() {
        double total = 0.0;
        int count = 0;

        if (hasImproved()) {
            for (int x = 0; x < scores.length; x++) {
                if (x >= scores.length / 2) {
                    total += scores[x];
                    count++;
                }
            }
        } else {
            return getAverage(0, scores.length - 1);
        }

        return total / (double) count;
    }

    public int getTestScore(int testNumber) {
        if (testNumber < scores.length && testNumber >= 0) {
            if (scores[testNumber] >= 0 || scores[testNumber] <= 0) {
                return scores[testNumber];
            }
        }
        System.out.println("No Value, Given: ");
        return -1;
    }
}
