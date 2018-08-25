package Easy.Design;

import java.util.Stack;

public class MinStack {

    private int min;
    private Stack<Integer> minStack;

    /** initialize your data structure here. */
    public MinStack() {
        min = Integer.MAX_VALUE;
        minStack = new Stack<>();
    }

    public void push(int x) {
        min = Math.min(min, x); // 从if 判断大小再赋值改成Math库里的min方法后速度提高了一些
        minStack.push(x);
    }

    public void pop() {
        if (top() == min){
            minStack.pop();
            min = Integer.MAX_VALUE;
            for (int n : minStack){
                if (min > n)
                    min = n;
            }
        }
        else
            minStack.pop();
    }

    public int top() {
        return minStack.peek();
    }

    public int getMin() {
        return min;
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }
}
