package TwoPointer_SlidingWindow;
import java.util.*;
public class MaxConsecutiveOnesWithKZeros {
    public static void  main(String args[]){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=x.nextInt();
        int k=x.nextInt();
        int l=0,r=0,c=0,ml=0;
        while(r<a.length){
            if(a[r]==0) c++;
            while(c==k){
                if(a[l]==0) c--;
                l++;
            }
        }
    }
}
