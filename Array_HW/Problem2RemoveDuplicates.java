/**
 * Problem 2 - Easy
 * Remove duplicates from a sorted array in-place and return the new length.
 */
public class Problem2RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int write = 1;

        for (int read = 1; read < nums.length; read++) {
            if (nums[read] != nums[read - 1]) {
                nums[write] = nums[read];
                write++;
            }
        }

        return write;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4};
        int n = removeDuplicates(arr);
        System.out.print(n + " -> ");
        for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
        System.out.println(); // 4 -> 1 2 3 4

        int[] arr2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int n2 = removeDuplicates(arr2);
        System.out.print(n2 + " -> ");
        for (int i = 0; i < n2; i++) System.out.print(arr2[i] + " ");
        System.out.println(); // 5 -> 0 1 2 3 4
    }
}
