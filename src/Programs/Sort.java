package Programs;
import java.util.*;
public class Sort {
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int i,j,aa=0,d=0;
        int[] a=new int[n];
        for(i=0;i<n;i++){
            a[i]=x.nextInt();
        }
        for(i=1;i<n;i++){
            if(a[i]>a[i-1]){
                aa++;
            }
        }
        for(j=0;j<n-1;j++){
            if(a[j]>a[j+1]){
                d++;
            }
        }
        aa++;
        d++;
        if(aa==n){
        System.out.println("Enthusiastic");
        }
        else if(d==n){
        System.out.println("Reserved");
        }
        else{
        System.out.println("-1");
        }
    }
}
