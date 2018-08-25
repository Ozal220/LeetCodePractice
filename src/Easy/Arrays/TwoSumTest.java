package Easy.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumTest {
    // 我的答案 -- 时间O(n^2), 空间O(1)
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int[] result = new int[2];
        if (len < 2) {
            result[0] = 0; result[1] = 1;
            return result;
        }

        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len; j++)
                if ((nums[i] + nums[j]) == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
        }
        return result;
    }

    // 达人的答案 时间O(n), 空间O(n)
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int component = target - nums[i];
            if(map.containsKey(component)){
                return new int[]{map.get(component),i};
            } else {
                map.put(nums[i],i);
            }
        }
        throw new IllegalArgumentException("error");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        TwoSumTest twoSumTest = new TwoSumTest();
        int[] index =  twoSumTest.twoSum(nums, 9);
        System.out.println(Arrays.toString(index));
    }
}
