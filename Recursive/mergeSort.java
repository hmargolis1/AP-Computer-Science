public class mergeSort {
    private int[] a;
    private int[] b;

    public mergeSort(int[] a, int[] b) {
        this.a = a;
        this.b = b;
    }

    public static int[] combineSortedArrays(int[] a, int[] b) {
        int idxA = 0, idxB = 0;
        int[] c = new int[a.length + b.length];

        for (int i = 0; i < c.length; i++) {
            if (idxA >= a.length) {
                c[i] = b[idxB++];
            } else if (idxB >= b.length) {
                c[i] = a[idxA++];
            } else if (a[idxA] <= b[idxB]) {
                c[i] = a[idxA++];
            } else {
                c[i] = b[idxB++];
            }
        }
        return c;
    }

    public static void printArray(int[] c) {
        String result = "{";
        for (int i = 0; i < c.length - 1; i++) {
            result += i + ", ";
        }
        System.out.println(result + c[c.length - 1] + "}");
    }
}
