package Easy.Arrays;

import java.util.HashSet;
import java.util.Set;

public class IsValidSudokuTest {
    public boolean isValidSudoku(char[][] board) {
        int i;
        int j;
        int len = board.length;
        Set<Character> set = new HashSet<>();
        for (i = 0; i < len; i++) {
            // 判断行
            set.clear();
            for (j = 0; j < len; j++)
                if (board[i][j] != '.')
                    if (!set.add(board[i][j]))
                        return false;
        }

        for (j = 0; j < len; j++) {
            // 判断列
            set.clear();
            for (i = 0; i < len; i++)
                if (board[i][j] != '.')
                    if (!set.add(board[i][j]))
                        return false;
        }

        for (int a = 0; a < 9;  a+=3){
            for (int b = 0; b < 9; b+=3){
                //判断3*3格子
                set.clear();
                for (i = a; i < a+3; i++) {
                    for (j = b; j < b+3; j++)
                        if (board[i][j] != '.')
                            if (!set.add(board[i][j]))
                                return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsValidSudokuTest isValidSudokuTest = new IsValidSudokuTest();
        char board[][] = new char[][]{
                {'.', '.', '.', '.', '5', '.', '.', '1', '.'},
                {'.', '4', '.', '3', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '3', '.', '.', '1'},
                {'8', '.', '.', '.', '.', '.', '.', '2', '.'},
                {'.', '.', '2', '.', '7', '.', '.', '.', '.'},
                {'.', '1', '5', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '2', '.', '.', '.'},
                {'.', '2', '.', '9', '.', '.', '.', '.', '.'},
                {'.', '.', '4', '.', '.', '.', '.', '.', '.'}
        };
        System.out.println(isValidSudokuTest.isValidSudoku(board));
    }
}
