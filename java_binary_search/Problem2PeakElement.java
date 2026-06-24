/**
 * Problem 2 - Medium
 * Find the peak element in an array (greater than both neighbours) using binary search.
 *
 * Key insight: if arr[mid] < arr[mid+1], a peak must exist to the right.
 *              Otherwise a peak exists to the left (or mid itself is the peak).
 * Guarantees: arr[-1] = arr[n] = -infinity (boundary condition).
 */
public class Problem2PeakElement {

    public static int findPeakElement(int[] arr) {
        int lo = 0, hi = arr.length - 1;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] < arr[mid + 1]) {
                lo = mid + 1; // peak is in the right half
            } else {
                hi = mid;     // peak is mid or in the left half
            }
        }

        return lo; // index of a peak element
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 1};
        System.out.println(findPeakElement(arr1));          // 2  (value 3)

        int[] arr2 = {1, 2, 1, 3, 5, 6, 4};
        int idx = findPeakElement(arr2);
        System.out.println(idx + " -> " + arr2[idx]);       // 5 -> 6

        int[] arr3 = {1};
        System.out.println(findPeakElement(arr3));          // 0
    }
}
