package Recursion;

import java.util.Scanner;

public class ArraySortedOrNot {
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=x.nextInt();
        System.out.println(isSorted(a,0));
    }
    public static boolean isSorted(int[] a,int f){
        if(f==a.length-1)
            return true;
//        if(a[f]<a[f+1])
//            return isSorted(a,f+1);
//        return false;
        return a[f]<a[f+1] && isSorted(a,f+1);
    }
}
