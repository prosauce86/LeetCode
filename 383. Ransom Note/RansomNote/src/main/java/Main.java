import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().canConstruct("aacc", "aabc"));
    }
}

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // Initialize a map of characters present (K) in magazine and the count of each (V)
        Map<Character, Integer> availableLettersInMagazine = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            availableLettersInMagazine.put(c, availableLettersInMagazine.getOrDefault(c, 0) + 1);
        }

        // Loop through and check if the characters needed for "ransom note" can be taken from available letters in magazine
        for (char c : ransomNote.toCharArray()) {
            if (!availableLettersInMagazine.containsKey(c) || availableLettersInMagazine.get(c) == 0) {
                return false;
            }
            availableLettersInMagazine.put(c, availableLettersInMagazine.get(c) - 1);
        }
        return true;
    }
}