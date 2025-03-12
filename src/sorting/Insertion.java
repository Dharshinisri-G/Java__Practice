package sorting;
import java.util.*;
public class Insertion {
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=x.nextInt();
        for(int i=1;i<n;i++){
            int k=a[i];
            int j=i-1;
            while(j>=0 && a[j]>k){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=k;
        }
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
}
