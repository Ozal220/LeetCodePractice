package Easy.String;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqCharTest {
    // 我的方法
    public int firstUniqChar(String s) {
        if (s == null || s.length() == 0)
            return -1;

        if (s.length() == 1)
            return 0;

        int len = s.length();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }

        for (int i = 0; i < len; i++) {
            if (map.get(s.charAt(i)) == 1)
                return i;

        }

        return -1;
    }

    // 网上最优(最快)解, 思路是根据字母表逐一判断第一次出现和最后一次出现的位置，最后取两个位置相等且最小的。
    public int firstUniqChar2(String s) {
        int result = -1;
        for(char c = 'a'; c<='z'; c++){
            int index = s.indexOf(c);
            if(index != -1 && index == s.lastIndexOf(c)){
                result = (result != -1)? Math.min(result, index): index;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "aafadaad";
        FirstUniqCharTest firstUniqCharTest = new FirstUniqCharTest();
        System.out.println(firstUniqCharTest.firstUniqChar(s));
    }
}
