/**
 * Problem 1 - Easy
 * Recursive function to check if a given string is a palindrome.
 *
 * Base case: empty string or single character is always a palindrome.
 * Recursive case: first and last characters must match, and the inner substring must also be a palindrome.
 */
public class Problem1PalindromeCheck {

    public static boolean isPalindrome(String s, int lo, int hi) {
        if (lo >= hi) return true;                          // base case
        if (s.charAt(lo) != s.charAt(hi)) return false;    // mismatch
        return isPalindrome(s, lo + 1, hi - 1);            // check inner substring
    }

    public static boolean isPalindrome(String s) {
        return isPalindrome(s, 0, s.length() - 1);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar")); // true
        System.out.println(isPalindrome("hello"));   // false
        System.out.println(isPalindrome("madam"));   // true
        System.out.println(isPalindrome("a"));       // true
        System.out.println(isPalindrome(""));        // true
    }
}
