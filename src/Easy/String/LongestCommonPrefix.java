package Easy.String;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) return strs[0];
        String minStr = new String();
        String resultStr = "";

        if (strs.length > 1)
            minStr = strs[0];

        boolean flag = true;   // 标记

        for (String s : strs) {
           if (s.length() < minStr.length())
               minStr = s;
        }

        for (int i = 0; i < minStr.length(); i++) {

            for (String s : strs) {
                if (s.charAt(i) != minStr.charAt(i)) {
                    flag = false;
                    break;
                }
            }
            if (flag){
                resultStr += minStr.charAt(i);
            }
            else break;
        }
        return resultStr;
    }

    public static void main(String[] args) {
        String[] strings = {"abc", "abd", "abtt"};
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String result = longestCommonPrefix.longestCommonPrefix(strings);
        System.out.println(result);
    }
}
