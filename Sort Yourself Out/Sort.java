public class Sort {
    private int[] nums;

    public Sort() {
        nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 100);
        }

    }

    public void print() {
        String result = "{" + nums[0];
        for (int i = 1; i < nums.length; i++) {
            result += ", " + nums[i];
        }
        result += "}";
        System.out.println(result);
    }

    public void swap(int p1, int p2) {
        int temp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = temp;

    }

    public String sort() {
        String result = "";
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++)
                if (nums[j] > nums[j + 1]) {
                    swap(j, j + 1);
                }
        }
        return result;
    }

}
