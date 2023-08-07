import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void containsDuplicateReturnsTrueWhenElementIsDuplicated() {
        Solution s = new Solution();
        assertTrue(s.containsDuplicate(new int[]{1, 2, 3, 3, 4}));
    }

    @Test
    void containsDuplicateReturnsFalseWhenElementAreDistinct() {
        Solution s = new Solution();
        assertFalse(s.containsDuplicate(new int[]{1, 2, 3, 4}));
    }
}