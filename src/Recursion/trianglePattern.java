package Recursion;

import java.util.Scanner;

public class trianglePattern {
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        reverseTriangle(n,0);
        triangle(n,0);
    }
    public static void triangle(int r,int c){
        if(r==0)
            return;
        if(c<r) {
            triangle(r,c+1);
            System.out.print("*");
        }
        else {

            triangle(r-1,0);
            System.out.println();
        }
    }
    public static void reverseTriangle(int r,int c){
        if(r==0)
            return;
        if(c<r) {
            System.out.print("*");
            reverseTriangle(r,c+1);
        }
        else {
            System.out.println();
            reverseTriangle(r-1,0);
        }
    }
}
