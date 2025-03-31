package Graph.ShortestPathBinaryMaze;

import java.util.Scanner;

public class BruteForce {
    static int min = Integer.MAX_VALUE;
    static int[] rowDir = {0, 1, 0, -1};
    static int[] colDir = {1, 0, -1, 0};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] maze = new int[n][m];
        boolean[][] visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                maze[i][j] = sc.nextInt();
            }
        }
        int sx = sc.nextInt();
        int sy = sc.nextInt();
        int dx = sc.nextInt();
        int dy = sc.nextInt();
        if (maze[sx][sy] == 0 || maze[dx][dy] == 0) {
            System.out.println("-1");
            return;
        }
        dfs(sx, sy, dx, dy, maze, visited, n, m, 0);
        System.out.println(min == Integer.MAX_VALUE ? -1 : min);
    }
    public static void dfs(int x, int y, int dx, int dy, int[][] maze, boolean[][] visited, int n, int m, int steps) {
        if (x < 0 || x >= n || y < 0 || y >= m || visited[x][y] || maze[x][y] == 0) {
            return;
        }
        if (x == dx && y == dy) {
            min = Math.min(min, steps);
            return;
        }
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            dfs(x+rowDir[i], y+colDir[i], dx, dy, maze, visited, n, m, steps + 1);
        }
        visited[x][y] = false;
    }
}
