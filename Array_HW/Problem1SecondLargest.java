/**
 * Problem 1 - Easy
 * Find the second largest element in an array without sorting.
 */
public class Problem1SecondLargest {

    public static int secondLargest(int[] arr) {
        if (arr.length < 2) return Integer.MIN_VALUE;

        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        return second;
    }

    public static void main(String[] args) {
        System.out.println(secondLargest(new int[]{3, 1, 4, 1, 5, 9, 2, 6})); // 6
        System.out.println(secondLargest(new int[]{10, 10, 10}));              // MIN_VALUE (all same)
        System.out.println(secondLargest(new int[]{5, 3}));                    // 3
    }
}
