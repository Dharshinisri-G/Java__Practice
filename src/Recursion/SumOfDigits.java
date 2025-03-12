package Recursion;
import java.util.*;
public class SumOfDigits {
    public static void main(String args[]){
    Scanner x=new Scanner(System.in);
    int n=x.nextInt();
    System.out.println(sum(n));
}
public static int sum(int n){
        if(n==0)
            return n;
        return (n%10)+sum(n/10);
}
}
