package Midium.ArrayAndString;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {

//        List<List<String>> lists = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s: strs) {
            char[] t = s.toCharArray();
            Arrays.sort(t);
            String sortedStr = String.valueOf(t);
            if (!map.containsKey(sortedStr))
                map.put(sortedStr, new ArrayList<>());
            map.get(sortedStr).add(s);
        }
//        lists.addAll(map.values());
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        System.out.println(groupAnagrams.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }
}
