package Recursion;
import java.util.*;
public class print1_N_2 {
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        print(n);
    }
    public static void print(int n){
        if(n==0)
            return ;
        print(n-1);
        System.out.println(n);
    }
}
