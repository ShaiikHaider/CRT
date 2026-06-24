/**
 * Problem 2 - Easy
 * Recursive GCD of two numbers using the Euclidean Algorithm.
 *
 * Base case: gcd(a, 0) = a
 * Recursive case: gcd(a, b) = gcd(b, a % b)
 */
public class Problem2GCD {

    public static int gcd(int a, int b) {
        if (b == 0) return a;       // base case
        return gcd(b, a % b);       // Euclidean step
    }

    public static void main(String[] args) {
        System.out.println(gcd(48, 18));  // 6
        System.out.println(gcd(100, 75)); // 25
        System.out.println(gcd(7, 5));    // 1
        System.out.println(gcd(0, 5));    // 5
        System.out.println(gcd(12, 12));  // 12
    }
}
