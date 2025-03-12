package Programs;
import java.util.*;
public class SecondLargest {
    public static void main(String args[]){
    Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int i,max=0;
        int[] a=new int[n];
        for(i=0;i<n;i++){
        a[i]=x.nextInt();
        if(a[i]>max){
            max=a[i];
        }
        }
        int max2=0;
        for(i=0;i<n;i++){
            if(a[i]>max2 && a[i]<max){
                max2=a[i];
            }
        }
        System.out.println(max2);
    }
}
