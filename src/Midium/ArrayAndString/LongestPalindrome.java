package Midium.ArrayAndString;

public class LongestPalindrome {
    public String longestPalindrome(String s) {
        if(s == null || s.length() <= 1) {
            return s;
        }
        String res = "";
        int left = 0; // 窗口的左边界
        int right = 0; // 窗口的右边界
        int len = s.length();

        for (left = 0; left < len; left++) {

            for (right = left;  right < len+1 ; right++) {
                String subStr = s.substring(left, right);
                if (isPalindrome(subStr) && subStr.length() > res.length())
                    res = subStr;
            }
        }

        return res;
    }

    public boolean isPalindrome(String s){
        StringBuilder sb = new StringBuilder(s);
        String rsb = sb.reverse().toString();
        return s.equals(rsb);
    }

    public static void main(String[] args) {
        LongestPalindrome shit = new LongestPalindrome();
        System.out.println(shit.longestPalindrome("bb"));
    }
}
