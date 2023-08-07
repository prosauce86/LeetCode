import java.util.HashSet;
import java.util.Set;

public class Solution {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numsList = new HashSet<>();
        for (int i : nums) {
            if (numsList.contains(i)) return true;
            numsList.add(i);
        }
        return false;
    }
}