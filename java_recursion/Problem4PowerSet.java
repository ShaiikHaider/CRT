import java.util.*;

/**
 * Problem 4 - Medium
 * Find the power set (all subsets) of a given set of integers using recursion.
 *
 * At each step, decide to either include or exclude the current element.
 * Base case: when index reaches end of array, record the current subset.
 */
public class Problem4PowerSet {

    public static void powerSet(int[] nums, int index, List<Integer> current,
                                 List<List<Integer>> result) {
        if (index == nums.length) {             // base case: subset complete
            result.add(new ArrayList<>(current));
            return;
        }

        // Exclude nums[index]
        powerSet(nums, index + 1, current, result);

        // Include nums[index]
        current.add(nums[index]);
        powerSet(nums, index + 1, current, result);
        current.remove(current.size() - 1);     // backtrack
    }

    public static List<List<Integer>> getPowerSet(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        powerSet(nums, 0, new ArrayList<>(), result);
        return result;
    }

    public static void main(String[] args) {
        List<List<Integer>> subsets = getPowerSet(new int[]{1, 2, 3});
        System.out.println("Total subsets: " + subsets.size()); // 8 = 2^3
        for (List<Integer> s : subsets) System.out.println(s);

        System.out.println("\nEmpty set:");
        System.out.println(getPowerSet(new int[]{})); // [[]]
    }
}
