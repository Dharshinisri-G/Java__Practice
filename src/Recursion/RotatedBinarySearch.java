package Recursion;

import java.util.Scanner;

public class RotatedBinarySearch {
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=x.nextInt();
        int t=x.nextInt();
        System.out.println(rbs(a,t,0,a.length-1));
    }
    public static int rbs(int[] a,int t,int s,int e){
        if(s>e)
            return -1;
        int m=s+(e-s)/2;
        if(a[m]==t)
            return m;
        if(a[s]<=a[m]){
            if(t>=a[s] && t<a[m])
                return rbs(a,t,s,m-1);
            else
                return rbs(a,t,m+1,e);
        }
        if(t>a[m] && t<=a[e])
            return rbs(a,t,m+1,e);
        return rbs(a,t,s,m-1);
    }
}
