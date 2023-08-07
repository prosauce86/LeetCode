import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.topKFrequent(new int[]{1, 1, 1, 2, 2, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5}, 3)));
    }
}

class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // Create a queue that sorts by highest to lowest frequency value
        PriorityQueue<Map.Entry<Integer, Integer>> priorityQueue =
                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        priorityQueue.addAll(map.entrySet());
        int[] output = new int[k];
        for (int i = 0; i < k; i++) {
            output[i] = priorityQueue.poll().getKey();
        }
        return output;
    }
}