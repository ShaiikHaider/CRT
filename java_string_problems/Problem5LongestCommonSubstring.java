/**
 * Problem 5 - Hard
 * Find the longest common substring (not subsequence) of two strings.
 * Uses dynamic programming: dp[i][j] = length of common substring ending at s1[i-1] and s2[j-1].
 */
public class Problem5LongestCommonSubstring {

    public static String longestCommonSubstring(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        int[][] dp = new int[m + 1][n + 1];
        int maxLen = 0, endIdx = 0; // endIdx in s1

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (dp[i][j] > maxLen) {
                        maxLen = dp[i][j];
                        endIdx = i; // ending position in s1 (1-based)
                    }
                }
                // else dp[i][j] stays 0 — substring must be contiguous
            }
        }

        return s1.substring(endIdx - maxLen, endIdx);
    }

    public static void main(String[] args) {
        System.out.println(longestCommonSubstring("abcdef", "zcdemf"));    // "cde"
        System.out.println(longestCommonSubstring("GeeksforGeeks", "GeeksQuiz")); // "Geeks"
        System.out.println(longestCommonSubstring("abcd", "efgh"));        // ""
        System.out.println(longestCommonSubstring("longest", "stone"));    // "on" or "st"
    }
}
