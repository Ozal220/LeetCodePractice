package Midium.ArrayAndString;

import java.util.ArrayList;
import java.util.List;

public class SetZeroes {
    public void setZeroes(int[][] matrix) {
        List<Point> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0){
                    list.add(new Point(i, j));
                }
            }
        }

        for (Point point : list) {
            for (int i = 0; i < matrix.length; i++)
                matrix[i][point.y] = 0;

            for (int j = 0; j < matrix[point.x].length; j++)
                matrix[point.x][j] = 0;
        }

    }

    class Point{
        int x;
        int y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1},
                          {1, 0, 1},
                          {1, 1, 1}};
        SetZeroes setZeroes = new SetZeroes();
        setZeroes.setZeroes(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
