package Programs;
import java.util.*;
public class Profit{
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int i,j;
        int[] a=new int[n];
        int max=0;
        for(i=0;i<n;i++)
        a[i]=x.nextInt();
        for(i=0;i<n-1;i++){
            for(j=i+1;j<n;j++){
                   if(a[j]>a[i] && max<a[j]-a[i])
                   max=a[j]-a[i];
            }
        }
        System.out.println(max);
    }
}