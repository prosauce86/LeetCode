public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().maximumWealth(new int[][]{{1, 5, 1}, {7, 3, 5}, {3, 5, 1}}));
    }
}

class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] account : accounts) {
            int custWealth = 0;
            for (int i : account) {
                custWealth += i;
            }
            if (custWealth > maxWealth) {
                maxWealth = custWealth;
            }
        }
        return maxWealth;
    }
}