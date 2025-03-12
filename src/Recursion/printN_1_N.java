package Recursion;
import java.util.*;
public class printN_1_N {
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        print(n);
    }
    public static void print(int n){
        if(n==0)
            return;
        System.out.println(n);
        print(n-1);
        System.out.println(n);
    }
}
