package Recursion;
import java.util.*;
public class productOfDigits {
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        System.out.println(prod(n));
    }
    public static int prod(int n){
        if(n<10)
            return n;
        return (n%10)*prod(n/10);
    }
}
