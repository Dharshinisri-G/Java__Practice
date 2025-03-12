package sorting;
import java.util.*;
public class Merge{
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=x.nextInt();
        mergesort(0,n-1,a);
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
    public static void mergesort(int l,int h,int[] a){
        if(l<h){
            int m=l+(h-l)/2;
            mergesort(l,m,a);
            mergesort(m+1,h,a);
            merge(l,m,h,a);
        }
    }
    public static void merge(int l, int m, int h, int[] a){
        int n1=m-l+1;
        int n2=h-m;
        int[] le=new int[n1];
        int[] ri=new int[n2];
        for(int i=0;i<n1;i++)
            le[i]=a[l+i];
        for(int i=0;i<n2;i++)
            ri[i]=a[m+1+i];
        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
             if(le[i]<=ri[j])
                 a[k++]=le[i++];
             else
                 a[k++]=ri[j++];
        }
        while(i<n1)
            a[k++]=le[i++];
        while(j<n2)
            a[k++]=ri[j++];
    }
}