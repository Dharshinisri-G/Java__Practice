package Programs;
import java.util.*;

public class BalanceParanthesis {
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        String st=x.nextLine();
        char[] ch=st.toCharArray();
        Stack<Character> s=new Stack<>();
        int i,k=0;
        for(i=0;i<ch.length;i++){
            if(ch[i]=='(' || ch[i]=='[' || ch[i]=='{'){
                s.push(ch[i]);
            }
            if(ch[i]==')'){
                if(s.isEmpty() || s.pop()!='(')
                k++;
            }
            if(ch[i]==']'){
                if(s.isEmpty() || s.pop()!='[')
                k++;
            }
            if(ch[i]=='}'){
                if(s.isEmpty() || s.pop()!='}')
                k++;
            }
            
        }
        if(k>0 && s.isEmpty()){
            System.out.println("Balanced Paranthesis");
        }
        else
        {
            System.out.println("Not balanced Paranthesis");
        }
    }
}
