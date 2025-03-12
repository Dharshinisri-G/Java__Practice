package Programs;
import java.util.*;
public class Modrev {
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        int n,m,k;
        n=x.nextInt();
        m=x.nextInt();
        k=x.nextInt();
        int i,rev,num,diff,c=0;
        for(i=n;i<=m;i++){
            rev=0;
            num=i;
            while(num>0){
                rev=rev*10+(num%10);
                num=num/10;
            }
         diff=i-rev;
         if(diff<0){
         diff*=-1;
         }
         if(diff%k==0){
         c++;
         }
        }
        System.out.println(c);
    }
}
