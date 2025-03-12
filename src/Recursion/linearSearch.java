package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class linearSearch {
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=x.nextInt();
        int t=x.nextInt();
        System.out.println("Checks if Present: "+find(a,t,0));
        System.out.println("Check target index from first: "+findtarget(a,t,0));
        System.out.println("Check target index from last: " +findtargetLast(a,t,a.length-1));
        findAlltarget(a,t,0);
        System.out.println("Declaring arrayList in class Sharable: "+l);
        //Passing the list in recursion
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println("Passing the arraylist to each recursive call: "+findAlltarget2(a,t,0, list));
        //Creating separate list in each of the recursive calls
        System.out.println("Creating new ArrayList in each recursive call: "+findAllIndex(a,t,0));
    }
    public static boolean find(int[] a,int t,int i){
        if(i==a.length)
            return false;
        return a[i]==t || find(a,t,i+1);
    }
    public static int findtarget(int[] a,int t,int i){
        if(i==a.length)
            return -1;
        if(a[i]==t)
            return i;
        return findtarget(a,t,i+1);
    }
    public static int findtargetLast(int[] a,int t,int i){
        if(i==-1)
            return -1;
        if(a[i]==t)
            return i;
        return findtargetLast(a,t,i-1);
    }
    static List<Integer> l=new ArrayList<>();
    public static void findAlltarget(int[] a,int t,int i){
        if(i==a.length)
            return;
        if(a[i]==t)
            l.add(i);
        findAlltarget(a,t,i+1);
    }
    public static ArrayList<Integer> findAlltarget2(int[] a,int t,int i,ArrayList<Integer> list){
        if(i==a.length)
            return list;
        if(a[i]==t)
            list.add(i);
        return findAlltarget2(a,t,i+1,list);
    }
    public static ArrayList<Integer> findAllIndex(int[] a,int t,int i){
        ArrayList<Integer> list1=new ArrayList<>();
        if(i==a.length)
            return list1;
        if(a[i]==t)
            list1.add(i);
        ArrayList<Integer> ansFromBelowCalls=findAllIndex(a,t,i+1);
        list1.addAll(ansFromBelowCalls);
        return list1;
    }
}
