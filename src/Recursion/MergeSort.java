package Recursion;
import java.util.*;
public class MergeSort {
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=x.nextInt();
        System.out.println(Arrays.toString(mergesort(a)));
    }
    public static int[] mergesort(int[] a){
        if(a.length==1)
            return a;
        int m=a.length/2;
        int[] l=mergesort(Arrays.copyOfRange(a,0,m));
        int[] r=mergesort(Arrays.copyOfRange(a,m,a.length));
        return merge(l,r);
    }
    public static int[] merge(int[] l,int[] r){
        int[] all=new int[l.length+r.length];
        int i=0,j=0,k=0;
        while(i<l.length && j<r.length){
            if(l[i]<=r[j])
                all[k++]=l[i++];
            else
                all[k++]=r[j++];
        }
        while(i<l.length)
            all[k++]=l[i++];
        while(j<r.length)
            all[k++]=l[j++];
        return all;
    }
}
