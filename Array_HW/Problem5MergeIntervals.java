import java.util.*;

/**
 * Problem 5 - Medium
 * Merge overlapping intervals from a list of [start, end] pairs.
 */
public class Problem5MergeIntervals {

    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][0];

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> merged = new ArrayList<>();
        merged.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            int[] last = merged.get(merged.size() - 1);
            if (intervals[i][0] <= last[1]) {
                last[1] = Math.max(last[1], intervals[i][1]);
            } else {
                merged.add(intervals[i]);
            }
        }

        return merged.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        int[][] result = merge(new int[][]{{1,3},{2,6},{8,10},{15,18}});
        for (int[] r : result) System.out.println(Arrays.toString(r));
        // [1,6] [8,10] [15,18]

        System.out.println("---");
        int[][] result2 = merge(new int[][]{{1,4},{4,5}});
        for (int[] r : result2) System.out.println(Arrays.toString(r));
        // [1,5]
    }
}
