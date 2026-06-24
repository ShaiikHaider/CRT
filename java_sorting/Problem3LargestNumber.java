import java.util.Arrays;

/**
 * Problem 3 - Medium
 * Find the largest number formed by rearranging digits of an array of non-negative integers.
 *
 * Key insight: compare two numbers a, b by which concatenation is larger — "ab" vs "ba".
 * Sort descending by this comparator, then join.
 */
public class Problem3LargestNumber {

    public static String largestNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) strs[i] = String.valueOf(nums[i]);

        // Custom comparator: prefer a+b over b+a
        Arrays.sort(strs, (a, b) -> (b + a).compareTo(a + b));

        // Edge case: all zeros
        if (strs[0].equals("0")) return "0";

        return String.join("", strs);
    }

    public static void main(String[] args) {
        System.out.println(largestNumber(new int[]{3, 30, 34, 5, 9}));  // "9534330"
        System.out.println(largestNumber(new int[]{10, 2}));             // "210"
        System.out.println(largestNumber(new int[]{0, 0}));              // "0"
        System.out.println(largestNumber(new int[]{1}));                 // "1"
    }
}
