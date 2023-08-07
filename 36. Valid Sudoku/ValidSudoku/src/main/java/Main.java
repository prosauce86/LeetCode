import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        char[][] array = new char[][]
                {
                        {'5','3','.','.','7','.','.','.','.'},
                        {'6','.','.','1','9','5','.','.','.'},
                        {'.','9','8','.','.','.','.','6','.'},
                        {'8','.','.','.','6','.','.','.','3'},
                        {'4','.','.','8','.','3','.','.','1'},
                        {'7','.','.','.','2','.','.','.','6'},
                        {'.','6','.','.','.','.','2','8','.'},
                        {'.','.','.','4','1','9','.','.','5'},
                        {'.','.','.','.','8','.','.','7','9'}
                };
        System.out.println(new Solution().isValidSudoku(array));
    }
}

class Solution {
    public boolean isValidSudoku(char[][] board) {

        Set<String> seen = new HashSet<>();
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                char value = board[row][col];
                if (value != '.') {
                    if (!seen.add("number: " + value + "(row " + row + ")") ||
                            !seen.add("number: " + value + "(column " + col + ")") ||
                            !seen.add("number: " + value + "(square " + row/3 + "-" + col/3 + ")")) {

                        return false;
                    }
                }
            }
        }
        return true;
    }
}