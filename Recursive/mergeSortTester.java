public class mergeSortTester {
    public static void main(String[] args) {
        int[] a = { 0, 4, 8, 9, 11, 12 };
        int[] b = { 3, 5, 6, 10, 11, 13, 15 };

        mergeSort.printArray(mergeSort.combineSortedArrays(a, b));
    }
}
