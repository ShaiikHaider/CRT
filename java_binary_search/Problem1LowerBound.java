/**
 * Problem 1 - Easy
 * Given a sorted array, count how many elements are strictly less than X
 * using lower_bound binary search.
 *
 * lower_bound returns the index of the first element >= X.
 * That index is exactly the count of elements < X.
 */
public class Problem1LowerBound {

    // Returns index of first element >= x  (lower bound)
    public static int lowerBound(int[] arr, int x) {
        int lo = 0, hi = arr.length;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] < x) lo = mid + 1;
            else              hi = mid;
        }
        return lo; // also equals count of elements strictly < x
    }

    public static int countLessThan(int[] arr, int x) {
        return lowerBound(arr, x);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        System.out.println(countLessThan(arr, 6));  // 3  (1,3,5)
        System.out.println(countLessThan(arr, 1));  // 0
        System.out.println(countLessThan(arr, 12)); // 6  (all)
        System.out.println(countLessThan(arr, 5));  // 2  (1,3)
    }
}
