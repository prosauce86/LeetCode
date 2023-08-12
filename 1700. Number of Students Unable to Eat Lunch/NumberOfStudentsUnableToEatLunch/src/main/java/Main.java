import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
                TODO: INCOMPLETE SOLUTION
                0 = circular sandwich
                1 = square

                Initially num sandwiches = num students

                sandwiches in stack
                students in queue

                while
                if student prefers sandwich at top of stack
                    pop the sandwich from stack
                    student leaves queue
                else
                    sandwich remains in stack
                    student goes to end of queue

                return count of students in queue when done (count++ while j.next != null)
         */
        System.out.println(new Solution().countStudents(new int[]{1,1,1,0,0,1}, new int[]{1,0,0,0,1,1}));

        // TODO: Complete below, code doesn't work as expected
    }
}

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int numStudents = students.length;
        Stack<Integer> stack = new Stack<>();
        for (int sandwich : sandwiches) {
            stack.push(sandwich);
        }

        for (int student : students) {
            System.out.println(stack);
            System.out.println();
            if (stack.isEmpty()) break;
            if (student == stack.peek()) {
                stack.pop();
                numStudents--;
            }
        }

//        for (int student : students) {
//            if (stack.isEmpty()) break;
//            if (student == stack.peek()) {
//                stack.pop();
//                numStudents--;
//            }
//        }

        // System.out.println(sandwichesAvailable);
        // System.out.println(studentQ);
        return numStudents;
    }
}