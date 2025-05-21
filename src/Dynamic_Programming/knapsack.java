package Dynamic_Programming;

public class knapsack {
    /**
     * 01背包
     * @param weight 物品重量数组
     * @param value   物品价值数组
     * @param cap   背包容量
     * @return
     */
    public static int knapsackDp(int[] weight, int[] value, int cap){
        int len = weight.length;
        //初始化dp表
        int [][] dp = new int[len + 1][len + 1];
        //状态转移
        for(int i = 1; i <= len; i ++){
            for(int c = 1; c <= cap; c ++){
                if(weight[c - 1] > cap){
                    dp[i][c] = dp[i - 1][c];
                }else{
                    dp[i][c] = Math.max(dp[i - 1][c], dp[i - 1][c - weight[i - 1]] +value[i - 1]);
                }
            }
        }
        return dp[len][cap];
    }
}
