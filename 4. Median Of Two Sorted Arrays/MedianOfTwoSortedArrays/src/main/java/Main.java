public class Main {
    public static void main(String[] args) {
        /*
        Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

        The overall run time complexity should be O(log (m+n)).

        Example 1:

        Input: nums1 = [1,3], nums2 = [2]
        Output: 2.00000
        Explanation: merged array = [1,2,3] and median is 2.
        */
        Solution s = new Solution();
        System.out.println(s.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
    }

}