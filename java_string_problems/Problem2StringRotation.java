/**
 * Problem 2 - Medium
 * Check if one string is a rotation of another (concatenation + substring check).
 */
public class Problem2StringRotation {

    public static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        String doubled = s1 + s1;
        return doubled.contains(s2);
    }

    public static void main(String[] args) {
        System.out.println(isRotation("abcde", "cdeab")); // true
        System.out.println(isRotation("abcde", "abced")); // false
        System.out.println(isRotation("hello", "llohe")); // true
        System.out.println(isRotation("abc", "ab"));      // false
    }
}
