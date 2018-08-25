package Easy.String;



public class IsPalindrome {
    public boolean isPalindrome(String s) {
        if (s == null)
            return false;
        if (s.equals(""))
            return true;

        s = s.replaceAll("[^A-Za-z0-9]","");
        StringBuilder sb = new StringBuilder(s);
        String rsb = sb.reverse().toString();
        return s.equalsIgnoreCase(rsb);
    }

    public static void main(String[] args) {
        String s = "\"Damosel, a poem? A carol? Or a cameo pale? (So mad!)\"";
        IsPalindrome isPalindrome = new IsPalindrome();
        System.out.println(isPalindrome.isPalindrome(s));
    }
}
