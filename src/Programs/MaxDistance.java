package Programs;
import java.util.*;
public class MaxDistance {
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int i,max=0;
        int[] a=new int[n];
        for(i=0;i<n;i++){
            a[i]=x.nextInt();
            if(i>0 && a[i]-a[i-1]>max){
                max=a[i]-a[i-1];
            }
        }
       System.out.println(max);
    }
}
