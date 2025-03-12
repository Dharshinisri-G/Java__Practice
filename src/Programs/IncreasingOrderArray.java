package Programs;
import java.util.*;
public class IncreasingOrderArray {
      public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int i,c=0,in=0,t;
        int[] a=new int[n];
        for(i=0;i<n;i++){
            a[i]=x.nextInt();
            if(i>0 && c==0 && a[i]<a[i-1]){
                in=i;
                c++;
            }
        }
        for(i=0;i<in;i++){
         System.out.print(a[i]+" ");
        }
        t=a[in-1];
        t++;
        for(i=in;i<n;i++){
            System.out.print(t+" ");
            t++;
        }
      }
}
