package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class bubbleSort {
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=x.nextInt();
        Bubsort(a,n,0);
        System.out.println(Arrays.toString(a));
    }
    public static void Bubsort(int[] a,int r,int c){
        if(r==0)
            return;
        if(c<r-1){
            if(a[c]>a[c+1]){
                int t=a[c];
                a[c]=a[c+1];
                a[c+1]=t;
            }
                Bubsort(a,r,c+1);

        }
        Bubsort(a,r-1,0);
    }
}
