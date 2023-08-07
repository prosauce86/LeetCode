import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
        System.out.println();
        System.out.println(new Solution().removeElement(new int[]{3,2,2,3}, 3));
    }
}

class Solution {
    public int removeElement(int[] nums, int val) {
        // Input: nums = [0,1,2,2,3,0,4,2], val = 2
        //  Output: 5, nums = [0,1,4,0,3,_,_,_]
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return i;
    }
}