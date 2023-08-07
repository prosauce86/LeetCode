public class Main {
    public static void main(String[] args) {
        /*
        Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

        Example 1:

        Input: nums = [1,2,3,1]
        Output: true
        Example 2:

        Input: nums = [1,2,3,4]
        Output: false
        Example 3:

        Input: nums = [1,1,1,3,3,4,3,2,4,2]
        Output: true

        Constraints:

        1 <= nums.length <= 10^5
        -10^9 <= nums[i] <= 10^9
        */

        Solution solution = new Solution();
        System.out.println(solution.containsDuplicate(new int[]{10, 44, 78, 33, 23, 45, 100, 22, 2, 3, 15})); // False
        System.out.println(solution.containsDuplicate(new int[]{11, 34, 56, 11, 69, 42, 17, 8, 6})); // True
    }
}