package Recursion;

import java.util.*;
import java.util.Scanner;
/// /// Not correct modify the code later
public class Mergesort2 {
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=x.nextInt();
        mergesort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
    public static void mergesort(int[] a,int s,int e){
        if(s==e)
            return;
        int m=s+(e-s)/2;
        mergesort(a,s,m);
        mergesort(a,m+1,e);
        merge(a,s,m,e);
    }
    public static void merge(int[] a,int s,int m,int e){
        int i=s;
        int j=m+1;
        int k=s;

        while(i<=m && j<=e){
            if(a[i]<=a[j])
                a[k++]=a[i++];
            else
                a[k++]=a[j++];
        }
        while(i<=m)
            a[k++]=a[i++];
        while(j<=e)
            a[k++]=a[j++];
    }
}
