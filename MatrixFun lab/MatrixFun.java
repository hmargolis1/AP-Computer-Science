public class MatrixFun {
    private int[][] matrix;

    public int generateRandomNumber() {
        return (int) (Math.random() * 10);
    }

    public MatrixFun(int numberOfRows, int numberOfCols) {
        if (numberOfRows <= 0 || numberOfCols <= 0) {
            throw new IllegalArgumentException("NumberOfCols and NumberOfRows is Negative or Zero");
        }
        this.matrix = new int[numberOfRows][numberOfCols];
        for (int r = 0; r < numberOfRows; r++) {
            for (int c = 0; c < numberOfCols; c++) {
                matrix[r][c] = generateRandomNumber();
            }
        }
    }

    public MatrixFun(int[][] starterMatrix) {
        if (starterMatrix == null) {
            throw new IllegalArgumentException("Null starterMatrix");
        }
        this.matrix = starterMatrix;
    }

    public MatrixFun() {
        this.matrix = new int[3][3];
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                matrix[r][c] = generateRandomNumber();
            }
        }

    }

    public String toString() {
        if (matrix == null) {
            throw new IllegalArgumentException("Null Matrix");
        }
        if (matrix.length == 0) {
            throw new IllegalArgumentException("Empty Matrix");
        }
        int rowLength = 0;
        for (int c = 0; c < matrix[0].length; c++) {
            rowLength += String.valueOf(matrix[0][c]).length();
            if (c < matrix[0].length - 1) {
                rowLength += 1;
            }
        }
        String topBottom = "=".repeat(rowLength);
        String result = "";
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                result += matrix[r][c] + " ";
            }
            result += "\n";
        }
        return topBottom + "\n" + result + topBottom;
    }

    public boolean equals(MatrixFun other) {
        if (other == null || matrix == null) {
            throw new IllegalArgumentException("Really, thats null");
        }
        if ((this.matrix.length != other.matrix.length)
                || (this.matrix[0].length != other.matrix[0].length)) {
            return false;
        }
        for (int r = 0; r < matrix.length; r++) {
            if (this.matrix[r].length != other.matrix[r].length) {
                return false;
            }
            for (int c = 0; c < matrix[r].length; c++) {
                if (this.matrix[r][c] != other.matrix[r][c]) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean equals(int[][] parameter) {
        if (parameter == null || matrix == null) {
            throw new IllegalArgumentException("Null Parameter)");
        }
        if (parameter.length != matrix.length || parameter[0].length != matrix[0].length) {
            return false;
        }
        for (int r = 0; r < matrix.length; r++) {
            if (this.matrix[r].length != parameter[r].length) {
                return false;
            }
            for (int c = 0; c < matrix[r].length; c++) {
                if (this.matrix[r][c] != parameter[r][c]) {
                    return false;
                }
            }
        }
        return true;
    }

    public void replaceAll(int oldValue, int newValue) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                if (matrix[r][c] == oldValue) {
                    matrix[r][c] = newValue;
                }
            }
        }
    }

    public void swapRow(int rowA, int rowB) {
        if (rowA < 0 || rowB < 0 || rowA >= matrix.length
                || rowB >= matrix.length) {
            throw new IllegalArgumentException();
        }
        int[] arrayRowA = matrix[rowA];
        int[] arrayRowB = matrix[rowB];
        matrix[rowA] = arrayRowB;
        matrix[rowB] = arrayRowA;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }
}