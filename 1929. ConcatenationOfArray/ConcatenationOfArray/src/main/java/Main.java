import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
               Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

                Specifically, ans is the concatenation of two nums arrays.

                Return the array ans.

                Example 1:

                Input: nums = [1,2,1]
                Output: [1,2,1,1,2,1]
                Explanation: The array ans is formed as follows:
                - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
                - ans = [1,2,1,1,2,1]
                Example 2:

                Input: nums = [1,3,2,1]
                Output: [1,3,2,1,1,3,2,1]
                Explanation: The array ans is formed as follows:
                - ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
                - ans = [1,3,2,1,1,3,2,1]


                Constraints:

                n == nums.length
                1 <= n <= 1000
                1 <= nums[i] <= 1000
         */

        System.out.println(Arrays.toString(new Solution().getConcatenation(new int[]{1, 3, 2, 1})));
        System.out.println();
        System.out.println(Arrays.toString(new Solution().getConcatenation(new int[]{1, 2, 1})));
    }
}

class Solution {
    public int[] getConcatenation(int[] nums) {
        // [1,3,2,1]
        int[] array = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            array[i] = nums[i];
            array[i + nums.length] = nums[i];
        }
        return array;
    }

//    public int[] getConcatenation(int[] nums) {
//        int arr[] = new int[nums.length*2];
//        System.arraycopy(nums,0,arr,0,nums.length);
//        System.arraycopy(nums,0,arr,nums.length,nums.length);
//        return arr;
//    }
}