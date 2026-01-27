public class MatrixFunTester {
    public static void main(String[] args) {
        testTostring();
        System.out.println("\n" + "----- " + "\n");
        testIsEquals();
        System.out.println("\n" + "----- " + "\n");
        testMatrixEquals();
        System.out.println("\n" + "----- " + "\n");
        testReplaceAll();
        System.out.println("\n" + "----- " + "\n");
        testSwapRow();
    }

    public static void testTostring() {
        MatrixFun a = new MatrixFun(4, 3);
        try {
            System.out.println(a.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            a = new MatrixFun(null);
            System.out.println(a.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            a = new MatrixFun(-1, 2);
            System.out.println(a.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            a = new MatrixFun();
            System.out.println(a.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            a = new MatrixFun(0, 0);
            System.out.println(a.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void testIsEquals() {
        int[][] arrayOne = { { 1, 2, 3 }, { 1, 3, 4 } };
        int[][] arrayTwo = { { 1, 2, 3 }, { 1, 3, 4 } };
        int[][] arrayThree = { { 0, 2, 3 }, { 1, 3, 4 } };
        MatrixFun arrayOneArray = new MatrixFun(arrayOne);
        MatrixFun arrayTwoArray = new MatrixFun(arrayTwo);
        MatrixFun arrayThreeArray = new MatrixFun(arrayThree);
        System.out.println(arrayTwoArray.equals(arrayOneArray));
        System.out.println(arrayThreeArray.equals(arrayTwoArray));
    }

    public static void testMatrixEquals() {
        int[][] arrayOne = { { 1, 2, 3 }, { 1, 3, 4 } };
        int[][] arrayTwo = { { 1, 2, 3 }, { 1, 3, 4 } };
        int[][] arrayThree = { { 0, 2, 3 }, { 1, 3, 4 } };
        MatrixFun arrayOneArray = new MatrixFun(arrayOne);
        System.out.println(arrayOneArray.equals(arrayTwo));
        System.out.println(arrayOneArray.equals(arrayThree));
    }

    public static void testReplaceAll() {
        int[][] array = { { 1, 2, 3 }, { 1, 3, 4 } };
        MatrixFun arrayArray = new MatrixFun(array);
        arrayArray.replaceAll(3, 5);
        System.out.println(arrayArray.toString());
    }

    public static void testSwapRow() {
        int[][] array = { { 1, 2, 3 }, { 1, 3, 4 } };
        MatrixFun arrayArray = new MatrixFun(array);
        arrayArray.swapRow(0, 1);
        System.out.println(arrayArray.toString());
    }

}