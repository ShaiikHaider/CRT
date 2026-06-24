/**
 * Problem 4 - Medium
 * Kth Missing Positive Number in a sorted array using binary search.
 *
 * At index i, arr[i] - (i+1) = count of positive integers missing up to arr[i].
 * Binary search for the smallest index where this count >= k.
 */
public class Problem4KthMissingPositive {

    public static int findKthMissing(int[] arr, int k) {
        int lo = 0, hi = arr.length;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            // missing count before arr[mid] = arr[mid] - (mid + 1)
            if (arr[mid] - (mid + 1) < k) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }

        // lo = first index where missing count >= k
        // k-th missing = lo + k  (lo numbers filled by array, k more needed)
        return lo + k;
    }

    public static void main(String[] args) {
        System.out.println(findKthMissing(new int[]{2, 3, 4, 7, 11}, 5)); // 9
        System.out.println(findKthMissing(new int[]{1, 2, 3, 4}, 2));     // 6
        System.out.println(findKthMissing(new int[]{2}, 1));              // 1
    }
}
