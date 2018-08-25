package Easy.Others;

import java.util.ArrayList;
import java.util.List;

//帕斯卡三角
public class Generate {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        if (numRows == 0){ return lists;}

        List<Integer> row = new ArrayList<>();
        row.add(1);
        lists.add(row);
        if (numRows == 1)
            return lists;

        row = new ArrayList<>();
        row.add(1); row.add(1);
        lists.add(row);
        if (numRows == 2)
            return lists;

        for (int i = 2; i < numRows; i++) {
            row = new ArrayList<>();
            row.add(1);
            int size = lists.get(i-1).size();
            for (int j = 1; j < size; j++) {
                row.add(lists.get(i-1).get(j-1) + lists.get(i-1).get(j));
            }
            row.add(1);
            lists.add(row);
        }
        return lists;
    }

    public static void main(String[] args) {
        Generate generate = new Generate();
        System.out.println(generate.generate(5));
    }
}
