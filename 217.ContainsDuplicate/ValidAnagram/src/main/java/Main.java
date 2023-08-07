import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isAnagramOptimal("resorts", "retorts")); // Should return false
        System.out.println(s.isAnagramOptimal("anagram", "nagaram")); // Should return true
    }
}

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() == t.length()) {
            int[] letterCount = new int[26]; // 26 possible letters in alphabet

            for (char c : s.toCharArray()) {
                letterCount[c - 'a']++; // increment count of occurrences of each letter in string in entire alphabet
                System.out.print((int) c + " ");
            }

            for (char c : t.toCharArray()) { // if previous counts were incremented, this will decrement occurrences
                letterCount[c - 'a']--;
            }

            // if each letter in alphabet is 0, we know it was an anagram.
            // If other letters remain with positive value, it is not an anagram
            for (int i : letterCount) {

                if (i != 0) return false;
            }
            return true;
        }
        return false;
    }

    public boolean isAnagramOptimal(String s, String t) {
        if (s.length() == t.length()) {
            Map<Character, Integer> charMap = new HashMap<>();
            for (char c : s.toCharArray()) {
                charMap.put(c, charMap.getOrDefault(c, 0) + 1);
            }

            int charCount;

            for (char c : t.toCharArray()) {
                charCount = charMap.getOrDefault(c, 0);
                if (charCount == 0) {
                    return false;
                }

                charMap.put(c, charCount - 1);
            }
            return true;
        }
        return false;
    }
}