package Easy.String;

public class ReverseIntTest {
    // 我的答案 用字符串的来转换耗时40ms
    public int reverse(int x) {
        if (x < 10 && x > -10) return x;
        StringBuffer sb = new StringBuffer(Integer.toString(x));
        sb.reverse();
        while (true){
            if (sb.charAt(0) != '0')
                break;
            sb.deleteCharAt(0);
        }
        if (sb.charAt(sb.length()-1) == '-'){
            sb.deleteCharAt(sb.length()-1);
            sb.insert(0,'-');
        }
        String s = new String(sb);
        Long longNum =  Long.valueOf(s);
        if (longNum > Integer.MAX_VALUE || longNum < Integer.MIN_VALUE)
            return 0;
        return Integer.valueOf(s);

    }

    // 别人的答案 耗时26ms,也更简单。
    public int reverse2(int x) {
        if (x < 10 && x > -10) return x;
        long res = 0;
        while (x!=0){
            res = res*10 + x%10;
            x/=10;
        }
        return res>Integer.MAX_VALUE || res<Integer.MIN_VALUE ? 0 : (int) res;
    }


    public static void main(String[] args) {
        ReverseIntTest reverseIntTest = new ReverseIntTest();
        int re = reverseIntTest.reverse2(901000);
        System.out.println(re);
    }
}
