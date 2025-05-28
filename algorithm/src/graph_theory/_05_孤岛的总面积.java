package graph_theory;

import jdk.dynalink.support.SimpleRelinkableCallSite;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
// 求连通块，特判：碰到边界的连通块不算
public class _05_孤岛的总面积 {
    public static int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    public static int totoalArea;
    public static void bfs(int x, int y, boolean[][] visited, int[][] grid){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[x][y] = true;
        int count = 0;
        boolean isclosed = true;
        while(!queue.isEmpty()){
            int[] node = queue.poll();
            int nodeX = node[0];
            int nodeY = node[1];
            count += 1;
            if(nodeX == 0 || nodeX == grid.length - 1 || nodeY == 0 || nodeY == grid[0].length - 1){
                isclosed = false;
            }
            for(int i = 0; i < 4; i ++){
                int newX = nodeX + dir[i][0];
                int newY = nodeY + dir[i][1];
                if(newX >= 0 && newX < grid.length && newY >= 0 && newY < grid[0].length){
                    if(!visited[newX][newY] && grid[newX][newY] == 1){
                        visited[newX][newY] = true;
                        queue.add(new int[]{newX, newY});
                    }
                }
            }
        }
        if(isclosed){
            totoalArea += count;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];
        boolean[][] visited = new boolean[n][m];
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < m; j ++){
                grid[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < m; j++){
                if(!visited[i][j] && grid[i][j] == 1){
                    bfs(i, j , visited, grid);
                }
            }
        }
        System.out.println(totoalArea);

    }

}
