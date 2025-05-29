package graph_theory;

import java.util.*;

public class _06_沉默孤岛 {
    public static int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    public static void bfs(int x, int y, boolean[][] visited, int[][] grid){
        Queue<int[]> queue = new LinkedList<>();
        Queue<int[]> queue1 = new LinkedList<>();
        queue.add(new int[]{x, y});
        queue1.add(new int[]{x, y});
        visited[x][y] = true;
        Map<Integer, Integer> map = new HashMap<>();
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
                        queue1.add(new int[]{newX, newY});
                    }
                }
            }
        }
        if(isclosed){
           while(!queue1.isEmpty()){
               int[] node = queue1.poll();
               int nodeX = node[0];
               int nodeY = node[1];
               grid[nodeX][nodeY] = 0;
           }
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
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < m; j ++){
                if(!visited[i][j] && grid[i][j] == 1){
                    bfs(i, j, visited, grid);
                }
            }
        }

        for(int i = 0; i < n; i ++){
            for(int j = 0; j < m; j ++){
                System.out.printf("%d ",grid[i][j]);
            }
            System.out.println();
        }


    }
}
