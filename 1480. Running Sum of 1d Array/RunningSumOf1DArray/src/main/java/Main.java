import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().runningSum(new int[]{1,2,3,4})));
        System.out.println();
        System.out.println(Arrays.toString(new Solution().runningSum(new int[]{1,1,1,1,1})));
        System.out.println();
        System.out.println(Arrays.toString(new Solution().runningSum(new int[]{3,1,2,10,1})));
    }
}

class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
}