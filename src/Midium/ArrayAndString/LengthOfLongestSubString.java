package Midium.ArrayAndString;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LengthOfLongestSubString {
    // 我的答案，时间复杂度为O(n^2) 相当慢
    public int lengthOfLongestSubstring(String s) {
        if (s.equals("")) return 0;
        int maxLength = 1;
        List<Character> list = new ArrayList<>();

        int len = s.length();
        for (int i = 0; i < len-1; i++) {
            list.add(s.charAt(i));
            for (int j = i+1; j < len; j++) {
                if (list.contains(s.charAt(j)))
                    break;
                list.add(s.charAt(j));
            }
            maxLength = Math.max(maxLength, list.size());
            list.clear();
        }
        return maxLength;
    }

    // 改进后的答案，思路为：如果遇到一个已包含的字符，则记录maxLength，找到str中的字符的位置i，从i+1位置开始计算。(窗口的左边界改为i+1)
    public int lengthOfLongestSubstring2(String s) {

        if(s == null || s.length() < 1) {
            return 0;
        }
        HashSet<Character> set = new HashSet<Character>();
        int maxLength = Integer.MIN_VALUE; // 最长字串长度
        int left = 0; // 窗口的左边界
        int right = 0; // 窗口的右边界
        int len = s.length();

        while (right < len) {
            if (set.contains(s.charAt(right))) // 找到与right位置相等的那个字符，left指向该字符的下一个位置，重新开始窗口
            {
                maxLength = Math.max(maxLength, right - left);
                while (s.charAt(left) != s.charAt(right))  //直到找到与当前字符相等的那个字符，然后才可以重新开始新一轮的窗口计数
                {
                    set.remove(s.charAt(left));
                    left++;
                }
                left++;
            } else {
                set.add(s.charAt(right));
            }
            right++;
        }
        maxLength = Math.max(maxLength, right - left); // right一直向后，直到超出s的长度，此时也要计算窗口的大小
        return maxLength;
    }


    public static void main(String[] args) {
        LengthOfLongestSubString shit = new LengthOfLongestSubString();
        System.out.println(
                shit.lengthOfLongestSubstring("abcabcbb"));
    }
}
