package Graph.ShortestPathBinaryMaze;
import java.util.*;
public class DFS {
    static int min=Integer.MAX_VALUE;
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int m=x.nextInt();
        int[][] a=new int[n][m];
        boolean[][] b=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
                a[i][j]=x.nextInt();
        }
        int sx=x.nextInt();
        int sy=x.nextInt();
        int dx=x.nextInt();
        int dy=x.nextInt();
        if(a[sx][sy]==0 || a[dx][dy]==0){
            System.out.println("-1");
            return;
        }
        dfs(sx,sy,dx,dy,a,b,n,m,1);
        if(min==Integer.MAX_VALUE)
            System.out.print("-1");
        else
            System.out.print(min);
    }
    public static void dfs(int sx,int sy,int dx,int dy,int[][] a,boolean[][] b,int n,int m,int s){
        if(sx<0 || sx>=n || sy<0 || sy>=m || b[sx][sy] || a[sx][sy]==0 || s>=min){
            return;
        }
        if(sx==dx && sy==dy){
            min=s;
        }
        b[sx][sy]=true;
        dfs(sx,sy+1,dx,dy,a,b,n,m,s+1);
        dfs(sx+1,sy,dx,dy,a,b,n,m,s+1);
        dfs(sx,sy-1,dx,dy,a,b,n,m,s+1);
        dfs(sx-1,sy,dx,dy,a,b,n,m,s+1);
        b[sx][sy]=false;
    }
}
