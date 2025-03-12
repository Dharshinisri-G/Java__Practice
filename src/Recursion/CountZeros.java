package Recursion;

import java.util.Scanner;

public class CountZeros {
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        System.out.println(count(n));
    }
    public static int count(int n){
        int c=0;
        return helper(n,c);
    }
    public static int helper(int n,int c){
        if(n==0)
            return c;
        if(n%10==0)
            return helper(n/10,c+1);
        return helper(n/10,c);
    }
}
