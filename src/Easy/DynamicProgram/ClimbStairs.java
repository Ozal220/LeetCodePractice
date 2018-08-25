package Easy.DynamicProgram;


public class ClimbStairs {
    public int climbStairs(int n) {
        // 因为只能爬两种(1,2)，所以类似于斐波那契额数列，把上一次和上上次所用的步数记录下来。
        if(0 == n) return 0;
        int pre1 = 1, pre2 = 1;
        int sum = 1;
        for(int i = 1; i < n; i ++){
            sum = pre1 + pre2;
            pre2 = pre1;
            pre1 = sum;
        }

        return sum;
    }
}
