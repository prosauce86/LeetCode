import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void isAnagramReturnsTrue() {
        assertTrue(solution.isAnagram("anagram", "nagaram"));
    }

    @Test
    void isAnagramReturnsFalse() {
        assertFalse(solution.isAnagram("eat", "ant"));
    }

    @Test
    void isAnagramReturnsFalseWhenStringsAreDifferentLengths() {
        assertFalse(solution.isAnagram("eat", "cant"));
    }
}