package Graph.ShortestPathBinaryMaze;

import java.util.Scanner;

public class DynamicProgramming {
    static int[] rowDir = {0, 1, 0, -1};
    static int[] colDir = {1, 0, -1, 0};
    static int n, m;
    static int[][] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] maze = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                maze[i][j] = sc.nextInt();
            }
        }
        int sx = sc.nextInt();
        int sy = sc.nextInt();
        int dx = sc.nextInt();
        int dy = sc.nextInt();
        dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        if (maze[sx][sy] == 0 || maze[dx][dy] == 0) {
            System.out.println("-1");
            return;
        }
        dp[sx][sy] = 0;
        dfs(sx, sy, dx, dy, maze);
        System.out.println(dp[dx][dy] == Integer.MAX_VALUE ? -1 : dp[dx][dy]);
    }
    public static void dfs(int x, int y, int dx, int dy, int[][] maze) {
        for (int i = 0; i < 4; i++) {
            int newX = x + rowDir[i];
            int newY = y + colDir[i];
            if (newX >= 0 && newX < n && newY >= 0 && newY < m && maze[newX][newY] == 1) {
                if (dp[newX][newY] > dp[x][y] + 1) { // Only update if a shorter path is found
                    dp[newX][newY] = dp[x][y] + 1;
                    dfs(newX, newY, dx, dy, maze);
                }
            }
        }
    }
}
