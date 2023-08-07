public class Main {
    public static void main(String[] args) {

        System.out.println(new Solution().strStr("leetcode", "co"));
    }
}

class Solution {

    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}