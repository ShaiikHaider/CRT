import java.util.HashMap;
import java.util.Map;

/**
 * Problem 5 - Medium
 * Count ways to climb N stairs taking 1, 2, or 3 steps using recursion + memoization.
 *
 * Recurrence: ways(n) = ways(n-1) + ways(n-2) + ways(n-3)
 * Base cases: ways(0) = 1 (one way to stay at ground), ways(negative) = 0
 * Memoization: cache results to avoid recomputing overlapping subproblems.
 */
public class Problem5ClimbStairs {

    private static Map<Integer, Long> memo = new HashMap<>();

    public static long countWays(int n) {
        if (n < 0) return 0;            // invalid step
        if (n == 0) return 1;           // reached the top exactly

        if (memo.containsKey(n)) return memo.get(n);

        long ways = countWays(n - 1) + countWays(n - 2) + countWays(n - 3);
        memo.put(n, ways);
        return ways;
    }

    public static void main(String[] args) {
        System.out.println(countWays(1));  // 1   (1)
        System.out.println(countWays(2));  // 2   (1+1, 2)
        System.out.println(countWays(3));  // 4   (1+1+1, 1+2, 2+1, 3)
        System.out.println(countWays(4));  // 7
        System.out.println(countWays(10)); // 274
        System.out.println(countWays(30)); // 53798080
    }
}
