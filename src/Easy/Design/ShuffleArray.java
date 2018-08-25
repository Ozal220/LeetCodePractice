package Easy.Design;

import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {
    // 最快嘿嘿嘿。
    private int[] origin;
    private Random random;

    public ShuffleArray(int[] nums) {
        origin = nums;
        random = new Random();
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return origin;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] output = Arrays.copyOf(origin, origin.length);
        int len = output.length;
        for (int i = 0; i < len; i++) {
            int idx = random.nextInt(len-i); // 生成 i ~ length-1的数作为坐标
            int temp = output[i];
            output[i] = output[idx + i];
            output[idx + i] = temp;
        }
        return output;
    }
}
