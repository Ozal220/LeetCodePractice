package Easy.Arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateClass {
    // https://github.com/Ozal220/LeetCodePractice.git
    // 用Set的特性来解决问题。 Set里不会存重复值，当Set不能插入时会返回false
    public boolean containsDuplicate(int [] nums){
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num))
                return true;
        }
        return false;
    }
}
