/**
 * Problem 3 - Medium
 * Generate all binary strings of length N using recursion.
 *
 * At each position, try placing '0' or '1', then recurse for the next position.
 * Base case: when the current string reaches length N, print it.
 */
public class Problem3BinaryStrings {

    public static void generateBinary(int n, String current) {
        if (current.length() == n) {    // base case
            System.out.println(current);
            return;
        }
        generateBinary(n, current + "0"); // place 0
        generateBinary(n, current + "1"); // place 1
    }

    public static void generate(int n) {
        generateBinary(n, "");
    }

    public static void main(String[] args) {
        System.out.println("N = 2:");
        generate(2);  // 00 01 10 11

        System.out.println("\nN = 3:");
        generate(3);  // 000 001 010 011 100 101 110 111
    }
}
