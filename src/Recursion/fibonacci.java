package Recursion;
import java.util.*;
public class fibonacci {
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        System.out.print(fibo(n));
    }
    public static int fibo(int n){
        if(n<2)
            return n;
        return fibo(n-1)+fibo(n-2);
    }
}
