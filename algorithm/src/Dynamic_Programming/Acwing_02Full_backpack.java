package Dynamic_Programming;

import java.util.Scanner;

/**
 * @author 一只咸鱼的大厂梦-hxw
 * @date 2025-06-10 20:55
 */

/**
 * 输入
 * 4 5
 * 1 2
 * 2 4
 * 3 4
 * 4 5
 * 输出
 * 10
 */
public class Acwing_02Full_backpack {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 物品种数
        int n = sc.nextInt();
        // 背包容积
        int m = sc.nextInt();

        int[] v_arr = new int[n];
        int[] w_arr = new int[n];

        for(int i = 0; i < n; i ++){
            // 体积
            v_arr[i] = sc.nextInt();
            // 价值
            w_arr[i] = sc.nextInt();
        }

        // dp[i][j] : 前i个物体容量为j的最大价值
        int[][] dp = new int[n + 1][m + 1];
        //到第i个物体
        for(int i = 1; i <= n; i ++){
            // 容量为j
            for(int j = 0; j <= m; j ++){
                // 不放当前物品
                dp[i][j] = dp[i - 1][j];
                if(j >= v_arr[i - 1]){
                    dp[i][j] = Math.max(dp[i][j], dp[i][j - v_arr[i - 1]] + w_arr[i - 1]);
                }
            }
        }
        System.out.println(dp[n][m]);

    }
}
