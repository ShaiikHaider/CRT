/**
 * Problem 5 - Hard
 * Find the K-th smallest element in a sorted matrix using binary search on value range.
 *
 * Matrix: each row and column is sorted in ascending order.
 * Binary search on value in [matrix[0][0], matrix[n-1][n-1]].
 * For a mid value, count how many elements <= mid using a staircase traversal (O(n)).
 * Find the smallest value where count >= k.
 */
public class Problem5KthSmallestMatrix {

    // Count of elements <= target using top-right staircase walk
    private static int countLessOrEqual(int[][] matrix, int target) {
        int n = matrix.length;
        int count = 0;
        int row = 0, col = n - 1;

        while (row < n && col >= 0) {
            if (matrix[row][col] <= target) {
                count += col + 1; // all elements in this row up to col
                row++;
            } else {
                col--;
            }
        }
        return count;
    }

    public static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int lo = matrix[0][0], hi = matrix[n - 1][n - 1];

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (countLessOrEqual(matrix, mid) < k) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }

        return lo; // lo is guaranteed to be an actual matrix value
    }

    public static void main(String[] args) {
        int[][] matrix1 = {
            {1,  5,  9},
            {10, 11, 13},
            {12, 13, 15}
        };
        System.out.println(kthSmallest(matrix1, 8)); // 13

        int[][] matrix2 = {{-5}};
        System.out.println(kthSmallest(matrix2, 1)); // -5

        int[][] matrix3 = {
            {1, 2},
            {3, 4}
        };
        System.out.println(kthSmallest(matrix3, 2)); // 2
    }
}
