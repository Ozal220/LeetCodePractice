package Easy.DynamicProgram;

// 买卖股票最佳时期 I
// 只能买卖一次版
// 思路：找最大收益的过程实际上是找到目前为之的最低价
public class MaxProfit1 {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int result = 0;

        for(int i = 0; i < prices.length; i++){

            if(min > prices[i])
                min = prices[i];

            if(result < (prices[i] - min))
                result = prices[i] - min;
        }
        return result;
    }

    public static void main(String[] args) {
        MaxProfit1 maxProfit1 = new MaxProfit1();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int re = maxProfit1.maxProfit(prices);
        System.out.println(re);
    }
}
