import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // /src/main/description.txt
        System.out.println(new Solution().calPoints(new String[]{"5","2","C","D","+"}));
    }
}

class Solution {
    public int calPoints(String[] operations) {
        if (operations.length < 1) return -1;

        Stack<Integer> record = new Stack<>();
        for (String s : operations) {
            switch (s) {
                case "+" -> {
                    // record new score that is sum of 2 previous scores
                    int lastScore = record.pop();
                    int prevScore = record.peek();
                    int newScore = lastScore + prevScore;
                    record.push(lastScore);
                    record.push(newScore);
                }
                case "D" -> record.push(record.peek() * 2); // record new score that is double the previous
                case "C" -> record.pop(); // invalidate the previous score and remove from record
                default -> record.push(Integer.parseInt(s));
            }
            System.out.println(record);
        }
        int sum = 0;
        for (int i : record) sum += i;
        return sum;
    }
}