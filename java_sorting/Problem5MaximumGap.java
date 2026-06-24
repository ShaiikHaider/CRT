import java.util.Arrays;

/**
 * Problem 5 - Hard
 * Find the maximum gap between successive elements when sorted — without fully sorting.
 *
 * Approach: Pigeonhole / Bucket Sort in O(n) time and space.
 * 1. Find min and max of the array.
 * 2. Distribute n elements into (n-1) buckets of uniform size.
 * 3. By the pigeonhole principle, the max gap must span across at least one empty bucket.
 *    → Only track each bucket's min and max.
 * 4. Scan buckets: max gap = max of (next non-empty bucket's min - prev bucket's max).
 */
public class Problem5MaximumGap {

    public static int maximumGap(int[] nums) {
        int n = nums.length;
        if (n < 2) return 0;

        int min = nums[0], max = nums[0];
        for (int x : nums) {
            min = Math.min(min, x);
            max = Math.max(max, x);
        }

        if (min == max) return 0;

        // Bucket size: ceil division ensures (n-1) buckets cover [min, max]
        int bucketSize = Math.max(1, (max - min) / (n - 1));
        int bucketCount = (max - min) / bucketSize + 1;

        int[] bucketMin = new int[bucketCount];
        int[] bucketMax = new int[bucketCount];
        Arrays.fill(bucketMin, Integer.MAX_VALUE);
        Arrays.fill(bucketMax, Integer.MIN_VALUE);

        for (int x : nums) {
            int idx = (x - min) / bucketSize;
            bucketMin[idx] = Math.min(bucketMin[idx], x);
            bucketMax[idx] = Math.max(bucketMax[idx], x);
        }

        int maxGap = 0, prevMax = min;
        for (int i = 0; i < bucketCount; i++) {
            if (bucketMin[i] == Integer.MAX_VALUE) continue; // empty bucket
            maxGap = Math.max(maxGap, bucketMin[i] - prevMax);
            prevMax = bucketMax[i];
        }

        return maxGap;
    }

    public static void main(String[] args) {
        System.out.println(maximumGap(new int[]{3, 6, 9, 1}));       // 3
        System.out.println(maximumGap(new int[]{10}));                // 0
        System.out.println(maximumGap(new int[]{1, 10000000}));       // 9999999
        System.out.println(maximumGap(new int[]{1, 3, 5, 9, 23}));   // 14
    }
}
