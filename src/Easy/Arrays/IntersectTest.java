package Easy.Arrays;

import java.util.*;

public class IntersectTest {

    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length == 0 || nums2.length == 0)return new int[0];
        Map<Integer, Integer> map1 = new HashMap<>();
        for (int num : nums1) {
            map1.put(num, map1.getOrDefault(num, 0 )+1);
        }
        System.out.printf("map1: " + map1.toString());
        List<Integer> result = new ArrayList<>();
        for (int num : nums2){
            if (map1.containsKey(num) && map1.get(num) != 0){
                result.add(num);
                map1.put(num, map1.get(num)-1);
            }
        }

        int[] resultArray = new int[result.size()];
        int index = 0;
        for (int item : result) {
            resultArray[index++] = item;
        }
        return resultArray;
    }
}
