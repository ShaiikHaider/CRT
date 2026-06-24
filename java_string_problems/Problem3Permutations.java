import java.util.*;

/**
 * Problem 3 - Medium
 * Find all unique permutations of a given string (handles duplicates).
 */
public class Problem3Permutations {

    public static Set<String> permutations(String s) {
        Set<String> result = new TreeSet<>();
        permute(s.toCharArray(), 0, result);
        return result;
    }

    private static void permute(char[] arr, int start, Set<String> result) {
        if (start == arr.length) {
            result.add(new String(arr));
            return;
        }
        Set<Character> seen = new HashSet<>();
        for (int i = start; i < arr.length; i++) {
            if (seen.contains(arr[i])) continue; // skip duplicate swaps
            seen.add(arr[i]);
            swap(arr, start, i);
            permute(arr, start + 1, result);
            swap(arr, start, i); // backtrack
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char tmp = arr[i]; arr[i] = arr[j]; arr[j] = tmp;
    }

    public static void main(String[] args) {
        System.out.println(permutations("abc"));  // [abc, acb, bac, bca, cab, cba]
        System.out.println(permutations("aab"));  // [aab, aba, baa]  — no duplicates
        System.out.println(permutations("a"));    // [a]
    }
}
