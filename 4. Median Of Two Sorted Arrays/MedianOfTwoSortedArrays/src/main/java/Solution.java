
import java.util.Arrays;

public class Solution{
    // My 1st solution
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] combinedArray = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, combinedArray, 0, nums1.length); // copy param array1 to new array
        System.arraycopy(nums2, 0, combinedArray, nums1.length, nums2.length); // copy param array2 to new array
        Arrays.sort(combinedArray);
        int length = combinedArray.length;
        if (length % 2 == 0) {
            return (double) (combinedArray[(length / 2) - 1] + combinedArray[length / 2]) / 2;
        }
        return combinedArray[length / 2];
    }

    // Solution via "Coding with John" - https://www.youtube.com/watch?v=AVt1kWHpg2A
    public double findMedianSortedArraysV2(int[] nums1, int[] nums2) {
        int[] mergedNums = merge(nums1, nums2);

        if (mergedNums.length % 2 == 1) { // odd length
            return mergedNums[mergedNums.length / 2];
        }

        return 0.0;
    }

    public int[] merge(int[] nums1, int[] nums2) {
        int[] mergedNums = new int[nums1.length + nums2.length];

        // initialize pointers
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                mergedNums[k] = nums1[i];
                i++;
            } else {
                mergedNums[k] = nums2[j];
                j++;
            }
            k++;
        }

        // To ensure all elements in both arrays are added in case there are leftovers in either
        while (i < nums1.length) {
            mergedNums[k] = nums1[i];
            i++;
            k++;
        }
        while (j < nums2.length) {
            mergedNums[k] = nums1[j];
            j++;
            k++;
        }
        return mergedNums;
    }
}