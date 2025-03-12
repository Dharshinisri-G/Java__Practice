package Programs;
import java.util.*;
public class Replace {
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        int n,i;
        n=x.nextInt();
        List<Integer> l=new ArrayList<>();
        for(i=0;i<n;i++){
            l.add(x.nextInt());
        }
        Collections.sort(l);
        for(i=l.get(0);i<=l.get(n-1);i++){
            if(l.contains(i)){
                System.out.print(i+" ");
            }
            else{
                System.out.print("-1 ");
            }
        }
    }
}
