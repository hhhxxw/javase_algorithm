package Dynamic_Programming;

public class leecode_746_使用最小花费爬楼梯 {
    public static void main(String[] args) {
        int[] cost = {10, 15, 20};

        System.out.println(minCostClimbingStairs(cost));
    }
    public static int minCostClimbingStairs(int[] cost){
        int len = cost.length;
        // dp[i]： 到达 i台阶所需要花费的最少体力
        int[] dp = new int[len + 1];

        // dp数组初始化
        dp[0] = 0;
        dp[1] = 0;

        //递推顺序的确定： 因为dp[i]是通过dp[i - 1] 和 dp[i - 2]确定的，所以是从前往后遍历
        for(int i = 2; i <= len; i ++){
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }
        return dp[len];
    }
}
