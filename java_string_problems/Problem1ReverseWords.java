/**
 * Problem 1 - Easy
 * Reverse words in a sentence (not characters) without extra space.
 */
public class Problem1ReverseWords {

    // Helper: reverse characters in arr[] from i to j
    private static void reverse(char[] arr, int i, int j) {
        while (i < j) {
            char tmp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = tmp;
        }
    }

    public static String reverseWords(String s) {
        char[] arr = s.trim().toCharArray();
        int n = arr.length;

        // Step 1: reverse the entire array
        reverse(arr, 0, n - 1);

        // Step 2: reverse each word back
        int start = 0;
        for (int i = 0; i <= n; i++) {
            if (i == n || arr[i] == ' ') {
                reverse(arr, start, i - 1);
                start = i + 1;
            }
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));   // "blue is sky the"
        System.out.println(reverseWords("hello world"));       // "world hello"
        System.out.println(reverseWords("a good example"));    // "example good a"
    }
}
