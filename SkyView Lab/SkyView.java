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

        for (int r = 0; r < view.length; r++) {
            for (int c = 0; c < view[0].length; c++) {
                if (view[r][c] != other[r][c]) {
                    return false;
                }
            }
        }
        return true;
    }

    public double[][] getView() {
        return view;
    }

    public void setView(double[][] view) {
        this.view = view;
    }
}
