package graph_theory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 所有可达路径
 * 链接：https://kamacoder.com/problempage.php?pid=1170
 */
public class _01_kedalujin {
    static List<List<Integer>> result = new ArrayList<>(); // 收集符合条件的路径
    static List<Integer> path = new ArrayList<>(); // 1节点到终点的路径

    public static void dfs(int[][] graph, int x, int n) {
        // 当前遍历的节点x 到达节点n
        if (x == n) { // 找到符合条件的一条路径
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = 1; i <= n; i++) { // 遍历节点x链接的所有节点
            if (graph[x][i] == 1) { // 找到 x链接的节点
                path.add(i); // 遍历到的节点加入到路径中来
                dfs(graph, i, n); // 进入下一层递归
                path.remove(path.size() - 1); // 回溯，撤销本节点
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // 节点编号从1到n，所以申请 n+1 这么大的数组
        int[][] graph = new int[n + 1][n + 1];

        for (int i = 0; i < m; i++) {
            int s = scanner.nextInt();
            int t = scanner.nextInt();
            // 使用邻接矩阵表示无向图，1 表示 s 与 t 是相连的
            graph[s][t] = 1;
        }

        path.add(1); // 无论什么路径已经是从1节点出发
        dfs(graph, 1, n); // 开始遍历

        // 输出结果
        if (result.isEmpty()) System.out.println(-1);
        for (List<Integer> pa : result) {
            for (int i = 0; i < pa.size() - 1; i++) {
                System.out.print(pa.get(i) + " ");
            }
            System.out.println(pa.get(pa.size() - 1));
        }
    }
}
