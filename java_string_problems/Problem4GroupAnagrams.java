import java.util.*;

/**
 * Problem 4 - Medium
 * Group anagrams together from a list of strings.
 */
public class Problem4GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] words) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars); // sorted word as key

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> groups = groupAnagrams(input);
        for (List<String> g : groups) System.out.println(g);
        // [eat, tea, ate]  [tan, nat]  [bat]

        System.out.println("---");
        String[] input2 = {"", ""};
        System.out.println(groupAnagrams(input2)); // [["", ""]]
    }
}
