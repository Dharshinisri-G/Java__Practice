package Programs;
import java.util.*;
public class Leader {
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
            int n=x.nextInt();
            int i,c=0,j;
            int[] a=new int[n];
            for(i=0;i<n;i++)
            a[i]=x.nextInt();
            for(i=0;i<n;i++){
                c=0;
                for(j=i+1;j<n;j++){
                    if(a[i]<a[j])
                    c++;
                }
                if(c==0)
                System.out.print(a[i]+" ");
            }
}
    }
