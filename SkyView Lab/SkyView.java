public class SkyView {
    private double[][] view;

    public SkyView(int numberOfRows, int numberOfCols, double[] scanned) {
        if (scanned == null) {
            throw new IllegalArgumentException("Null Array");
        }
        if (scanned.length == 0) {
            throw new IllegalArgumentException("Empty Array");
        }
        if (numberOfRows < 0 || numberOfCols < 0) {
            throw new IllegalArgumentException("Negative Rows/Cols");
        }
        if (scanned.length < numberOfRows * numberOfCols) {
            throw new IllegalArgumentException("Array does not fit these dimensions, "
                    + "even though this was a precondition...");
        }
        view = new double[numberOfRows][numberOfCols];
        int count = 0;
        for (int r = 0; r < numberOfRows; r++) {
            if (r % 2 == 0) {
                for (int c = 0; c < numberOfCols; c++) {
                    this.view[r][c] = scanned[count];
                    count++;
                }
            } else {
                for (int c = numberOfCols - 1; c >= 0; c--) {
                    view[r][c] = scanned[count];
                    count++;
                }
            }
        }
    }

    public String toString() {
        if (view == null) {
            throw new IllegalArgumentException("Null Array");
        }
        if (view[0].length == 0) {
            throw new IllegalArgumentException("Empty Array");
        }
        String result = "";
        for (int r = 0; r < view.length; r++) {
            for (int c = 0; c < view[0].length; c++) {
                result += view[r][c] + " ";
            }
            result += "\n";
        }
        return result;
    }

    public boolean equals(SkyView other) {
        if (other == null) {
            throw new IllegalArgumentException("Object null");
        }
        if (view == null) {
            throw new IllegalArgumentException("View null");
        }
        for (int r = 0; r < view.length; r++) {
            for (int c = 0; c < view[0].length; c++) {
                if (view[r][c] != other.view[r][c]) {
                    return false;
                }
            }
        }
        return true;
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol) {
        if (startRow < 0 || endRow < 0 || startCol < 0 || endCol < 0) {
            throw new IllegalArgumentException("No negative row or column.");
        }
        if (endRow > view.length || endCol > view[0].length) {
            throw new IllegalArgumentException("Row and Column are out of bounds.");
        }
        double topRow = 0.0;
        int count = 0;
        for (int r = startRow; r <= endRow; r++) {
            for (int c = startCol; c <= endCol; c++) {
                topRow += view[r][c];
                count++;
            }
        }
        return topRow / (double) count;
    }

    public double[][] getView() {
        return view;
    }

    public void setView(double[][] view) {
        this.view = view;
    }
}
