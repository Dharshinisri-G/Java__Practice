package Programs;
import java.util.*;
public interface Twosum {
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int i,c=0,j;
        int[] a=new int[n];
        for(i=0;i<n;i++)
        a[i]=x.nextInt();
        int t=x.nextInt();
        for(i=0;i<n-1;i++){
            for(j=i+1;j<n;j++){
                   if(a[i]+a[j]==t){
                    System.out.println("["+i+" "+j+"]");
                    c++;
                    break;
                   }
            }
        }
        if(c==0)
        System.out.print("[-1,-1]");
    }
}
