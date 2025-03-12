package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class selectionSort {
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=x.nextInt();
        selecSortMax(a,n,0,0);
        System.out.println(Arrays.toString(a));
    }
    public static void selecSortMax(int[] a,int r,int c,int max){
        if(r==0)
            return;
        if(c<r) {
            if (a[c] > a[max])
                max = c;
            selecSortMax(a, r, c + 1, max);
        }
        else {
            int temp = a[r - 1];
            a[r - 1] = a[max];
            a[max] = temp;
            selecSortMax(a, r - 1, 0, 0);
        }
    }
}
