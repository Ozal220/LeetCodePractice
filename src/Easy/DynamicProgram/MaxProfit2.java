package Easy.DynamicProgram;

// 买卖股票最佳时期 I
// 可买卖多次次版
// 思路： 如果明天的大于今天的就买，明天卖。
public class MaxProfit2 {
    public int maxProfit(int[] prices) {
        int sum = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i]>prices[i-1])
                sum += prices[i] - prices[i-1];
        }
        return sum;
    }

    public static void main(String[] args) {
        MaxProfit2 maxProfit2 = new MaxProfit2();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int re = maxProfit2.maxProfit(prices);
        System.out.println(re);
    }
}
