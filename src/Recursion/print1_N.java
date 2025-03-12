package Recursion;
import java.util.*;
public class print1_N {
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        print(1,n);
    }
    public static void print(int m,int n){
        if(m>n)
            return;
        System.out.println(m);
        print(m+1,n);
    }
}
