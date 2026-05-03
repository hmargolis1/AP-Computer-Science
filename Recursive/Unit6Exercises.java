public class Unit6Exercises {

    public int factorial(int n) {
        int result = 1;
        for (int i = n; i > 0; i--) {
            result *= i;
        }
        return result;
    }

    public int factorialRecursive(int n) {
        // Base case
        if (n == 0) {
            return 1;
        }
        // Recursive case
        else {
            return n * factorialRecursive(n - 1);
        }
    }

    public int fibonacci(int n) {
        if (n <= 1)
            return n;
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    public int fibonacciRecursive(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public int sumOfDigits(String n) {
        int sum = 0;
        int bigNum = Integer.parseInt(n);
        while (bigNum > 0) {
            sum += bigNum % 10;
            bigNum /= 10;
        }
        return sum;
    }

    public int sumOfDigitsRecursive(String n) {
        if (n.length() == 1) {
            return Integer.parseInt(n);
        }
        int firstDigit = Integer.parseInt(n.substring(0, 1));
        return firstDigit + sumOfDigitsRecursive(n.substring(1));
    }

    public int countX(String n) {
        int result = 0;
        for (int i = 0; i < n.length(); i++) {
            n.toLowerCase();
            if (n.charAt(i) == 'x') {
                result += 1;
            }
        }
        return result;
    }

    public int countXRecursive(String n) {
        int count = 0;
        if (n.charAt(n.length() - 1) == 'x') {
            count = 1;
        }
        return count + countXRecursive(n.substring(0, n.length() - 1));
    }

    public String reverseString(String n) {
        String result = "";
        for (int i = n.length() - 1; i >= 0; i--) {
            result += n.charAt(i);
        }
        return result;
    }

    public String reverseStringRecursive(String n) {
        if (n.length() == 1) {
            return n;
        }
        String result = String.valueOf(n.length());
        return result + reverseStringRecursive(n.substring(0, n.length() - 1));
    }

    public int power(int n, int power) {
        return (int) Math.pow(n, power);
    }

    public int powerRecursive(int n, int power) {
        if (power == 0) {
            return 1;
        }
        return n * powerRecursive(n, power - 1);
    }

    public boolean isPalindrome(String str) {
        return (str.equals(reverseString(str)));
    }

    public boolean isPalindromeRecursive(String str) {
        return (str.equals(reverseStringRecursive(str)));
    }

    public int gcd(int big, int small) {
        for (int i = Math.min(big, small); i > 0; i--) {
            if (big % i == 0 && small % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public int gcdRecursive(int big, int small) {
        if (small == 0) {
            return big;
        }
        return gcdRecursive(small, big % small);
    }

    public int bunnyEars(int n) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                result += 2;
            }
            if (i % 2 != 0) {
                result += 3;
            }
        }
        return result;
    }

    public int bunnyEarsRecursive(int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 2 == 1) {
            return 2 + bunnyEarsRecursive(n - 1);
        } else {
            return 3 + bunnyEarsRecursive(n - 1);
        }
    }

    public int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public int binarySearchRecursive(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int mid = arr.length / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (target < arr[mid]) {
            int[] left = new int[mid];
            for (int i = 0; i < mid; i++) {
                left[i] = arr[i];
            }
            return binarySearchRecursive(left, target);
        } else {
            int[] right = new int[arr.length - mid - 1];
            for (int i = mid + 1; i < arr.length; i++) {
                right[i - mid - 1] = arr[i];
            }

            int result = binarySearchRecursive(right, target);

            if (result == -1) {
                return -1;
            }
            return result + mid + 1;
        }
    }
}
