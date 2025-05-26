package graph_theory;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 床架一个表示数组：不走回头路
 * 创建一个队列，用来实现bfs
 */

public class _03_岛屿问题bfs {
    public static int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    public static void bfs(int x, int y, boolean[][] visited,  int[][] grid){
        //Queue<int[]> 表示这是一个存储整数数组的队列。
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        visited[x][y] = true;
        while (!queue.isEmpty()){
            int[] current = queue.poll();
            for(int i = 0; i < 4; i ++){
                int newX = current[0] + dir[i][0];
                int newY = current[1] + dir[i][1];

                //判断新点是否越界
                if(!(newX < 0 || newX >= grid.length || newY < 0 || newY >= grid[0].length)){
                    if(grid[newX][newY] == 1 && !visited[newX][newY]){
                        visited[newX][newY] = true;
                        queue.offer(new int[]{newX, newY});
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // 读入地图
        int[][] grid = new int[n][m];
        boolean[][] visited = new boolean[n][m];
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < m; j ++){
                grid[i][j] = sc.nextInt();
            }
        }
        int res = 0;
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < m; j ++){
                if(!visited[i][j] && grid[i][j] == 1){
                    res++;
                    bfs(i, j, visited, grid);
                }

            }
        }

        System.out.println(res);
    }
}
