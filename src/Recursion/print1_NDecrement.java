package Recursion;
import java.util.*;
public class print1_NDecrement {
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        print(n);
    }
    public static void print(int n){
        if(n==0)
            return ;
        System.out.println(n);
        print(--n);
    }
}
