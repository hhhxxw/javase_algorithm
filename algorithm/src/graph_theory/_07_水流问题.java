package graph_theory;

import java.util.*;

/**
 * 先把所有的结果存储到一起，最后去重
 * @date 2025-05-31 13:31
 */
public class _07_水流问题 {
    public static List<List<int[]>> res = new ArrayList<>();
    public static int[][] dir = {{0,1}, {1, 0}, {0, -1}, {-1, 0}};
    public static void dfs(int x, int y, boolean[][] visited, int[][] grid){
        List<int[]> list = new ArrayList<>();
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[x][y] = true;
        boolean flag = true;
        while(!queue.isEmpty()){
            int[] point = queue.poll();
            list.add(new int[]{point[0], point[1]});
            for(int i = 0; i < 4; i ++){
                int newX = point[0] + dir[i][0];
                int newY = point[1] + dir[i][1];
                if(newX == 0 || newX == grid.length - 1 || newY == 0 || newY == grid[0].length - 1){
                    list.add(new int[]{newX, newY});
                    res.add(new ArrayList<>(list));
                    return;
                }else{
                    if((newX > 0 && newX < grid.length - 1 && newY > 0 && newY < grid[0].length - 1) && !visited[newX][newY] && grid[newX][newY] < grid[x][y]){
                        list.add(new int[]{newX, newY});
                        visited[newX][newY] = true;
                        queue.add(new int[]{newX, newY});
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] grid = new int[n][m];
        boolean[][] visited = new boolean[n][m];
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < m; j ++){
                grid[i][j] = sc.nextInt();
            }
        }
        HashMap<Object, Object> hash = new HashMap<>();
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < m; j ++){
                if(!visited[i][j] && grid[i][j] == 1){
                    dfs(i, j , visited, grid);
                }
            }
        }
    }

}
