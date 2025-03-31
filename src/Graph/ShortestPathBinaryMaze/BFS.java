package Graph.ShortestPathBinaryMaze;
import java.util.*;

public class BFS {
    static class Node {
        int x, y, dist;
        Node(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }
    public static void main(String args[]) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        int m = x.nextInt();
        int[][] a = new int[n][m];
        boolean[][] b = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                a[i][j] = x.nextInt();
        }
        int sx = x.nextInt();
        int sy = x.nextInt();
        int dx = x.nextInt();
        int dy = x.nextInt();
        int minSteps = bfs(sx, sy, dx, dy, a, b, n, m);
        System.out.println(minSteps);
    }
    public static int bfs(int sx, int sy, int dx, int dy, int[][] a, boolean[][] b, int n, int m) {
        if (a[sx][sy] == 0 || a[dx][dy] == 0) {
            return -1;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(sx, sy, 1));
        b[sx][sy] = true;
        int[] rowDir = {0, 1, 0, -1};  // Right, Down, Left, Up
        int[] colDir = {1, 0, -1, 0};
        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            int x = curr.x, y = curr.y, dist = curr.dist;
            if (x == dx && y == dy) {
                return dist;
            }
            for (int i = 0; i < 4; i++) {
                int newX = x + rowDir[i];
                int newY = y + colDir[i];
                if (newX >= 0 && newX < n && newY >= 0 && newY < m && !b[newX][newY] && a[newX][newY] == 1) {
                    queue.add(new Node(newX, newY, dist + 1));
                    b[newX][newY] = true;
                }
            }
        }
        return -1;
    }
}
