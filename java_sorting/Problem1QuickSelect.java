/**
 * Problem 1 - Medium
 * Find the median of an unsorted array in average O(n) using Quick Select.
 *
 * Quick Select finds the k-th smallest element without fully sorting.
 * For median: if odd length → middle element; if even → average of two middle elements.
 */
public class Problem1QuickSelect {

    // Returns the k-th smallest element (0-indexed k)
    public static int quickSelect(int[] arr, int lo, int hi, int k) {
        if (lo == hi) return arr[lo];

        int pivotIdx = partition(arr, lo, hi);

        if (k == pivotIdx)      return arr[pivotIdx];
        else if (k < pivotIdx)  return quickSelect(arr, lo, pivotIdx - 1, k);
        else                    return quickSelect(arr, pivotIdx + 1, hi, k);
    }

    private static int partition(int[] arr, int lo, int hi) {
        int pivot = arr[hi], i = lo;
        for (int j = lo; j < hi; j++) {
            if (arr[j] <= pivot) {
                int tmp = arr[i]; arr[i] = arr[j]; arr[j] = tmp;
                i++;
            }
        }
        int tmp = arr[i]; arr[i] = arr[hi]; arr[hi] = tmp;
        return i;
    }

    public static double findMedian(int[] arr) {
        int n = arr.length;
        int[] copy = arr.clone(); // preserve original

        if (n % 2 == 1) {
            return quickSelect(copy, 0, n - 1, n / 2);
        } else {
            int lo = quickSelect(copy, 0, n - 1, n / 2 - 1);
            int hi = quickSelect(copy, 0, n - 1, n / 2);
            return (lo + hi) / 2.0;
        }
    }

    public static void main(String[] args) {
        System.out.println(findMedian(new int[]{3, 1, 4, 1, 5}));        // 3.0
        System.out.println(findMedian(new int[]{7, 2, 10, 9, 1, 5, 3})); // 5.0
        System.out.println(findMedian(new int[]{4, 2, 7, 1}));            // 3.0  (avg 2+4)
    }
}
