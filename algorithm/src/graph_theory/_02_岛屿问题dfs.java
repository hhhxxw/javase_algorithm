package graph_theory;

import java.util.Scanner;

public class _02_岛屿问题dfs {
    public static int[][] dir = {{0, 1}, {1, 0},{0 ,-1},{-1, 0}};
    public static void dfs(boolean[][] visited, int x, int y, int[][] grid){
        // 遍历当前结点的四周
        for(int i = 0; i < 4; i ++){
            int nextX = x + dir[i][0];
            int nextY = y + dir[i][1];
            //越界
            //注意：这里一定要使用grid[0], 如果使用grid[i]不能保证【1-4】的范围，因为是遍历四周
            if(nextX < 0 || nextX >= grid.length || nextY < 0 || nextY >= grid[0].length){
                System.out.println(grid[i].length);
                System.out.println(grid[0].length);
                System.out.println("===================");
                continue;
            }
            if(!visited[nextX][nextY] && grid[nextX][nextY] == 1){
                visited[nextX][nextY] = true;
                dfs(visited, nextX, nextY, grid);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        //读入地图
        int[][] grid = new int[n][m];
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < m; j ++){
                grid[i][j] = sc.nextInt();
            }
        }

        //标记是否被访问过
        boolean[][] visited = new boolean[n][m];

        // 用来统计结果
        int ans = 0;
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < m; j ++){
                if(!visited[i][j] && grid[i][j] == 1){
                    ans ++;
                    visited[i][j] = true;
                    dfs(visited, i, j, grid);
                }
            }
        }
        System.out.println(ans);
    }
}
