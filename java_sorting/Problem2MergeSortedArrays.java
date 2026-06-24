import java.util.Arrays;

/**
 * Problem 2 - Easy
 * Merge two sorted arrays of sizes m and n in O(m+n) using merge-sort's merge step.
 */
public class Problem2MergeSortedArrays {

    public static int[] mergeSorted(int[] a, int[] b) {
        int m = a.length, n = b.length;
        int[] result = new int[m + n];
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (a[i] <= b[j]) result[k++] = a[i++];
            else               result[k++] = b[j++];
        }

        while (i < m) result[k++] = a[i++];
        while (j < n) result[k++] = b[j++];

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            mergeSorted(new int[]{1, 3, 5, 7}, new int[]{2, 4, 6, 8})
        )); // [1, 2, 3, 4, 5, 6, 7, 8]

        System.out.println(Arrays.toString(
            mergeSorted(new int[]{1, 2, 3}, new int[]{4, 5, 6})
        )); // [1, 2, 3, 4, 5, 6]

        System.out.println(Arrays.toString(
            mergeSorted(new int[]{}, new int[]{1, 2})
        )); // [1, 2]
    }
}
