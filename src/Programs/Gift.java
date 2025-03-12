package Programs;
import java.util.*;

public class Gift {
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        int t,i;
        t=x.nextInt();
        for(i=0;i<t;i++){
            int n=x.nextInt();
            int j,g=0;
            int[] a=new int[n];
            for(j=0;j<n;j++){
                a[j]=x.nextInt();
                if(j!=0 && a[j]>a[j-1]){
                    g++;
                }
            }
            g+=n;
            System.out.println(g);
        }
    }
}
