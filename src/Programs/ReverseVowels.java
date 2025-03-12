package Programs;
import java.util.*;
public class ReverseVowels {
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        String s=x.nextLine();
        char[] ch=s.toCharArray();
        int i,k;
        List<Character> l=new ArrayList<>();
        for(i=ch.length-1;i>=0;i--){
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'){
                l.add(ch[i]);
            }
        }
        
        k=0;
        for(i=0;i<ch.length;i++){
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'){
                System.out.print(l.get(k));
                k++;
            }
            else{
                System.out.print(ch[i]);
            }
        }
    }
}
