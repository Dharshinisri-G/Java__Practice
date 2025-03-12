package Recursion;

import java.util.Scanner;

public class ReverseNumWithHelper {
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        System.out.println(rev(n));
    }
    public static int rev(int n){
        int digits=(int)Math.log10(n)+1;
        return helper(digits,n);
    }
    public static int helper(int d,int n){
        if(n<10)
            return n;
        return ((n%10)*(int)Math.pow(10,d-1))+helper(d-1,n/10);
    }
}
