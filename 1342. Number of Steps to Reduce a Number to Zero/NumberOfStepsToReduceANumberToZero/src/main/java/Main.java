public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().numberOfSteps(123));
    }
}

class Solution {
    // Submitted Solution
    public int numberOfSteps(int num) {
        // Time complexity = 0(log n)
        // Space complexity = 0(1)
        int steps = 0;
        while (num > 0) {
            /*if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }*/

            // Same code as above but using bitwise shifting and bitmasks
            if ((num & 1) == 0) { // num: xxxxxxx0 & bitmask: 00000001 (bitwise AND)
                num >>= 1; // shift bits to the left (same as dividing by 2)
            } else {
                num--;
            }


            steps++;
        }




        return steps;
    }
}