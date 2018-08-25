package Easy.Arrays;

import java.util.Arrays;

public class MoveZeroesTest {
    public  void moveZeroes(int[] nums) {
        if (nums.length < 2) return;
        int step = 0;
        int i;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                nums[step++] = nums[i];
            }
        }

        for (; step < nums.length; step++)
            nums[step] = 0;
    }

    public static void main(String[] args) {
        int[] num = {0,1,0,3,12};
        MoveZeroesTest moveZeroesTest = new MoveZeroesTest();
        moveZeroesTest.moveZeroes(num);
        System.out.println(Arrays.toString(num));
    }
}

