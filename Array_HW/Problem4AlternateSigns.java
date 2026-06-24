/**
 * Problem 4 - Medium
 * Rearrange an integer array so positives and negatives alternate without extra space.
 */
public class Problem4AlternateSigns {

    public static void rearrangeAlternate(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i += 2) {
            // Even index should have a negative
            if (arr[i] >= 0) {
                int j = i + 1;
                while (j < n && arr[j] >= 0) j++;
                if (j == n) break;

                // Right-rotate arr[i..j] by one
                int temp = arr[j];
                System.arraycopy(arr, i, arr, i + 1, j - i);
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {-1, 2, -3, 4, -5, 6};
        rearrangeAlternate(arr);
        for (int x : arr) System.out.print(x + " ");
        System.out.println();

        int[] arr2 = {1, 2, 3, -4, -5, -6};
        rearrangeAlternate(arr2);
        for (int x : arr2) System.out.print(x + " ");
        System.out.println();
    }
}
