package Easy.String;

public class MyAtoi {
    public int myAtoi(String str){
        str = str.trim();
        if (str.equals("")) return 0;
        int len = str.length();
        long result = 0;
        char begin = str.charAt(0);
        if (begin == '-'){
            // 负数
//            result = -1;
            for (int i = 1; i < len; i++) {
                if (str.charAt(i) < '0' || str.charAt(i) > '9')
                    break;
                result = result*10 - (str.charAt(i)-'0');
                if (result < Integer.MIN_VALUE)
                    return Integer.MIN_VALUE;
            }
        }
        else if (begin == '+'){
            // 有符号的正数
            for (int i = 1; i < len; i++) {
                if (str.charAt(i) < '0' || str.charAt(i) > '9')
                    break;
                result = result*10 + (str.charAt(i)-'0');
                if (result > Integer.MAX_VALUE)
                    return Integer.MAX_VALUE;
            }
        }
        else if (begin >= '0' && begin <= '9'){
            // 前面无符号的正数
            result = begin - '0';
            for (int i = 1; i < len; i++) {
                if (str.charAt(i) < '0' || str.charAt(i) > '9')
                    break;
                result = result*10 + str.charAt(i)-'0';
                if (result > Integer.MAX_VALUE)
                    return Integer.MAX_VALUE;
            }
        }


        return (int)result;
    }

    public static void main(String[] args) {
        String s = "9223372036854775808";
        MyAtoi myAtoi = new MyAtoi();
        System.out.println(myAtoi.myAtoi(s));
    }
}
