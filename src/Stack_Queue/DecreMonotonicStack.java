package Stack_Queue;
import java.util.*;
public class DecreMonotonicStack {
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=x.nextInt();
        }
        int[] b=new int[n];
        Stack<Integer> s=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()<=a[i])
                s.pop();
            if(s.isEmpty()) b[i]=-1;
            else b[i]=s.peek();
            s.push(a[i]);
        }
        for(int i=0;i<n;i++)
            System.out.print(b[i]+" ");
    }
}
