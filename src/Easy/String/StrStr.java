package Easy.String;

public class StrStr {
    // 自己的答案
    public int strStr(String haystack, String needle) {
        if (haystack.equals("") && needle.equals("")) return 0;
        if (haystack.equals("")) return -1;
        if (needle.equals("")) return 0;

        int result = -1;
        int len1 = haystack.length();
        int len2 = needle.length();
        for (int i = 0; i < len1; i++) {
            if (haystack.charAt(i) == needle.charAt(0)){
                // 如果第一个字符相等就比较两个字符串后面是否相等，否则跳过
                if (len1 - i < len2){
                    break;
                }
                int k = i;
                result = i;
                for (int j = 1; j < len2; j++) {
                    if (haystack.charAt(++k) != needle.charAt(j)){
                        result = -1;
                        break;
                    }
                }
                if (result != -1)
                    break;
            }
        }
        return result;
    }

    // 最快的答案...看到这个笑死我了。。。还有这种操作。
    public int strStr2(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        String s1 = "aaa";
        String s2 = "aaaa";
        StrStr strStr = new StrStr();
        System.out.println(strStr.strStr2(s1, s2));
    }
}
