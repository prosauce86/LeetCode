import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
        Given an array of strings strs, group the anagrams together. You can return the answer in any order.

        An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

        Example 1:

        Input: strs = ["eat","tea","tan","ate","nat","bat"]
        Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
        Example 2:

        Input: strs = [""]
        Output: [[""]]
        Example 3:

        Input: strs = ["a"]
        Output: [["a"]]
        */


        Solution s = new Solution();
        System.out.println(s.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
        System.out.println(s.order("Anti-disestablishmentarianism"));
    }
}

class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();
        for (String s : strs) {
            String sortedStr = order(s);
            if (!anagramMap.containsKey(sortedStr)) {
                anagramMap.put(sortedStr, new ArrayList<>());
            }
            anagramMap.get(sortedStr).add(s);
        }
        return new ArrayList<>(anagramMap.values());
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        return order(s).equals(order(t));
    }

    public String order(String word) {
        char[] letters = word.toLowerCase().toCharArray();
        Arrays.sort(letters);
        return new String(letters);
    }
}