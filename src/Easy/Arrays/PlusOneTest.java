package Easy.Arrays;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class PlusOneTest {
    // 我的答案
    public static int[] plusOne(@NotNull int[] digits) {
        int len = digits.length;
        int p = 1;
        int i;
        for (i = len - 1; i > 0; i--) {
            digits[i] = digits[i] + p;
            if (digits[i] < 10)
                return digits;
            else {
                digits[i] %= 10;
                p = 1;
            }
        }
        digits[i] = digits[i] + p;
        if (digits[i] < 10)
            return digits;
        else {
            int[] newDigits = new int[len+1];
            digits[i] = 0;
            i = 0;
            newDigits[0] = 1;
            for (int num: digits) {
                newDigits[++i] = num;
            }
            return newDigits;
        }
    }

    //网上的答案
    public int[] plusOne2(int[] digits) {
        boolean add = true;
        int len = digits.length;
        for (int i = len - 1; i > -1; i--) {
            if (digits[i] == 9 ) {
                digits[i] = 0;
            } else {
                digits[i] += 1;
                return digits;
            }
        }

        int[] newArray = new int[len + 1];
        newArray[0] = 1;
        return newArray;
    }

    public static void main(String[] args) {
        int[] nums = {5,5};
        System.out.println(Arrays.toString(plusOne(nums)));
    }
}
