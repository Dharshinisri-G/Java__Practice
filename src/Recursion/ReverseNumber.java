package Recursion;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        reverse(n);
    }
    public static void reverse(int n){
        if(n==0)
            return ;
        System.out.print(n%10);
        reverse(n/10);
    }
}
