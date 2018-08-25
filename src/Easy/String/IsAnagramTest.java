package Easy.String;

import java.util.Arrays;

public class IsAnagramTest {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] arrayS = s.toCharArray();
        char[] arrayT = t.toCharArray();
        Arrays.sort(arrayS);
        Arrays.sort(arrayT);
        return Arrays.equals(arrayS, arrayT);
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        IsAnagramTest isAnagramTest = new IsAnagramTest();
        System.out.println(isAnagramTest.isAnagram(s, t));
    }
}
