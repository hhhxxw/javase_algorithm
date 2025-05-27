package graph_theory;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _04_岛屿的最大面积 {
    public static int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    public static int  bfs(int x, int y, boolean[][] visited, int[][] grid){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        visited[x][y] = true;
        int count = 1;
        while(!queue.isEmpty()){

            int[] current = queue.poll();
            //上下左右遍历地图上新的点
            for(int i = 0; i < 4; i ++){
                int newX = current[0] + dir[i][0];
                int newY = current[1] + dir[i][1];
                if(newX >= 0 && newX < grid.length && newY >= 0 && newY < grid[0].length){
                    if(!visited[newX][newY] && grid[newX][newY] == 1){
                        visited[newX][newY] = true;
                        count += 1;
                        queue.offer(new int[]{newX, newY});
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 读入地图
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[][] visited = new boolean[n][m];
        int[][] grid = new int[n][m];
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < m; j ++){
                grid[i][j] = sc.nextInt();
            }
        }
        int res = Integer.MIN_VALUE;
        // 感觉就是最大联通块
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < m; j ++){
                if(!visited[i][j] && grid[i][j] == 1){

                    int count = bfs(i, j, visited, grid);
                    if(count > res){
                        res = count;
                    }
                }
            }
        }
        System.out.println(res);
    }
}
