package Easy.Math;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    static final String str1 = "Fizz";
    static final String str2 = "Buzz";
    static final String str3 = "FizzBuzz";
    static final int num1 = 3;
    static final int num2 = 5;

    public List<String> fizzBuzz(int n) {
        List<String> strings = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if ((i % 3) == 0 && (i % 5) == 0)
                strings.add(str3);
            else if (i % 5 == 0)
                strings.add(str2);
            else if ( i % 3 == 0)
                strings.add(str1);
            else
                strings.add(String.valueOf(i));
        }
        return strings;
    }
}
