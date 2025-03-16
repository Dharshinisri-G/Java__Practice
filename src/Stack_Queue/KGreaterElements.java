package Stack_Queue;
import java.util.*;
public class KGreaterElements {
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        PriorityQueue<Integer> p=new PriorityQueue<>();
        int n=x.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) {
            a[i] = x.nextInt();
            if(p.size()!=3) {
                p.add(a[i]);
            }
            else{
                if(p.peek()<a[i]){
                    p.remove();
                    p.add(a[i]);
                }
            }
        }
            System.out.print(p);
    }
}
