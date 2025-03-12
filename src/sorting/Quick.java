package sorting;
import java.util.*;
public class Quick {
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=x.nextInt();
        quicksort(0,n-1,a);
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
    public static void quicksort(int l,int h,int[] a){
        if(l<h){
            int p=partition(l,h,a);
            quicksort(l,p-1,a);
            quicksort(p+1,h,a);
        }
    }
    public static int partition(int l,int h,int[] a){
        int p=l;
        int i=l;
        int j=h;
        while(i<j){
            while(a[i]<a[p])
                i++;
            while(a[j]>a[p])
                j--;
            if(i<j)
                swap(i,j,a);
        }
        swap(j,p,a);
        return j;
    }
    public static void swap(int p,int q,int[] a){
        int t=a[p];
        a[p]=a[q];
        a[q]=t;
    }
}
