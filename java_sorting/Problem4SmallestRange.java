import java.util.*;

/**
 * Problem 4 - Hard
 * Find the smallest range that includes at least one element from each of K sorted lists.
 *
 * Approach: use a min-heap of size K (one element per list).
 * Track the current max across the heap.
 * At each step, range = [heap_min, current_max].
 * Pop the min, push the next element from the same list.
 * Stop when any list is exhausted.
 */
public class Problem4SmallestRange {

    public static int[] smallestRange(List<List<Integer>> lists) {
        // PriorityQueue stores [value, listIndex, elementIndex]
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        int curMax = Integer.MIN_VALUE;

        // Seed heap with first element of each list
        for (int i = 0; i < lists.size(); i++) {
            int val = lists.get(i).get(0);
            minHeap.offer(new int[]{val, i, 0});
            curMax = Math.max(curMax, val);
        }

        int rangeStart = 0, rangeEnd = Integer.MAX_VALUE;

        while (minHeap.size() == lists.size()) {
            int[] top = minHeap.poll();
            int curMin = top[0], listIdx = top[1], elemIdx = top[2];

            if (curMax - curMin < rangeEnd - rangeStart) {
                rangeStart = curMin;
                rangeEnd   = curMax;
            }

            // Advance to next element in the same list
            if (elemIdx + 1 < lists.get(listIdx).size()) {
                int next = lists.get(listIdx).get(elemIdx + 1);
                minHeap.offer(new int[]{next, listIdx, elemIdx + 1});
                curMax = Math.max(curMax, next);
            }
            // If list exhausted, heap shrinks below K and loop ends
        }

        return new int[]{rangeStart, rangeEnd};
    }

    public static void main(String[] args) {
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(Arrays.asList(4, 10, 15, 24, 26));
        lists.add(Arrays.asList(0, 9, 12, 20));
        lists.add(Arrays.asList(5, 18, 22, 30));
        System.out.println(Arrays.toString(smallestRange(lists))); // [20, 24]

        List<List<Integer>> lists2 = new ArrayList<>();
        lists2.add(Arrays.asList(1, 2, 3));
        lists2.add(Arrays.asList(1, 2, 3));
        lists2.add(Arrays.asList(1, 2, 3));
        System.out.println(Arrays.toString(smallestRange(lists2))); // [1, 1]
    }
}
