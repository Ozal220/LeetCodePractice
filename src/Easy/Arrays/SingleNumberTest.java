package Easy.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SingleNumberTest {

    // 用额外空间方法
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num))
                set.remove(num);
            else
                set.add(num);
        }

        if (set.iterator().hasNext()) {
            return (int)set.iterator().next();
        }
        return -1;
    }

    // 不用额外空间方法
    public int singleNumber2(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        for (int i = 0; i < len-1;) {
            if(nums[i] != nums[i+1]){
                return nums[i];
            }else {
                i += 2;
            }
        }
        return nums[len-1];
    }
}
