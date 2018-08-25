package Easy.Others;

import java.util.Stack;

public class IsBracketPair {
    public boolean isValid(String s) {
        int len = s.length();
        if (len == 0)
            return true;

        if (1 == len)
            return false;

        Stack<Character> stack = new Stack<>();
        char ch = '*';    //记录等待的括号右边
        char top = '*';
        for (int i = 0; i < len; i++) {
            if (!stack.isEmpty() && s.charAt(i)==ch){
                stack.pop();
                if (!stack.isEmpty())
                    top = stack.peek();
            }
            else {
                top = s.charAt(i);
                stack.push(top);
            }
            switch (top){
                case '(' : ch = ')'; break;
                case '{' : ch = '}'; break;
                case '[' : ch = ']'; break;
            }
        }

        return stack.isEmpty();
    }


    public static void main(String[] args) {
//        IsBracketPair isBracketPair = new IsBracketPair();
//        System.out.println(isBracketPair.isValid("[(])"));
        int[] nums = new int[5];
        for (int n: nums) {
            System.out.printf(n + " ");
        }

    }
}
