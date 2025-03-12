package Recursion;
import java.util.*;
public class binarySearch {
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=x.nextInt();
        int t=x.nextInt();
        System.out.print(bs(a,t,0,n-1));
    }
    public static int bs(int[] a,int t,int s,int e){
        if(s>e)
            return -1;
        int m=s+(e-s)/2;
        if(a[m]==t)
            return m;
        else if(t<a[m])
            return bs(a,t,s,m-1);
        return bs(a,t,m+1,e);
    }
}
