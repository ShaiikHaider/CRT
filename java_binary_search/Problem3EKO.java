/**
 * Problem 3 - Medium
 * EKO — Lumberjacks must cut at least M metres of wood.
 * Find the maximum saw height H using binary search on answer.
 *
 * For a given height H, wood collected = sum of max(0, tree[i] - H).
 * Binary search H in [0, max(trees)].
 */
public class Problem3EKO {

    private static long woodCollected(int[] trees, long H) {
        long total = 0;
        for (int t : trees) {
            if (t > H) total += t - H;
        }
        return total;
    }

    public static long maxSawHeight(int[] trees, long M) {
        long lo = 0, hi = 0;
        for (int t : trees) hi = Math.max(hi, t);

        long best = 0;
        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
            if (woodCollected(trees, mid) >= M) {
                best = mid;   // mid works; try to go higher
                lo = mid + 1;
            } else {
                hi = mid - 1; // too little wood; lower the height
            }
        }

        return best;
    }

    public static void main(String[] args) {
        // SPOJ sample: trees=[20,15,10,17], M=7 → answer=15
        System.out.println(maxSawHeight(new int[]{20, 15, 10, 17}, 7));  // 15

        System.out.println(maxSawHeight(new int[]{4, 42, 40, 26, 46}, 20)); // 36
    }
}
