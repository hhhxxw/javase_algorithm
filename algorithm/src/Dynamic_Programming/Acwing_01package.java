package Dynamic_Programming;
import java.util.*;
/**
 * @author 一只咸鱼的大厂梦-hxw
 * @date 2025-06-09 22:05
 */

/*
输入
4 5
1 2
2 4
3 4
4 5
输出
8
 */
public class Acwing_01package{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 物品数量
        int n = sc.nextInt();
        // 背包容量
        int v = sc.nextInt();

        int[] v_arr = new int[n];
        int[] w_arr = new int[n];
        for(int i = 0; i < n; i ++){
            v_arr[i] = sc.nextInt();
            w_arr[i] = sc.nextInt();
        }
        // dp[i][j] : 前i个物品容量为j的时候的最大价值
        int[][] dp = new int[n + 1][v + 1];

        // 考虑遍历的顺序
        for(int i = 1; i <= n; i ++){
            for(int j = 1; j <= v; j ++){
                if(j < v_arr[i - 1]){
                    dp[i][j] = dp[i - 1][j];
                }else{
                    // 动态转移方程
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - v_arr[i - 1]] + w_arr[i- 1]);
                }
            }
        }
        System.out.println(dp[n][v]);
    }
}

