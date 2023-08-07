import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {


    Solution solution = new Solution();

    @Test
    public void merge() {
        //Solution solution = new Solution();
        int[] result = solution.merge(new int[]{1, 3}, new int[]{2});
        assertArrayEquals(new int[]{1, 2, 3}, result);
    }

//    @Test
//    public void findMedianSortedArrays() {
//        double d = solution.findMedianSortedArrays((new int[]{1, 3}), new int[]{2});
//        assertEquals(2.0, d);
//
//    }
}