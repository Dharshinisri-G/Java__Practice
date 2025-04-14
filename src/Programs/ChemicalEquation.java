package Programs;

    import java.util.*;
    public class ChemicalEquation {
        public static void main(String args[]) {
            Scanner x=new Scanner(System.in);
            String s=x.nextLine();
            char[] c=s.toCharArray();
            Deque<Map<String,Integer>> stack=new ArrayDeque<>();
            Map<String, Integer> currMap=new HashMap<>();
            int i=0,start=0,count=0,mul=1,n=c.length;
            while(i<n) {
                if(c[i]=='(') {
                    stack.push(currMap);
                    currMap=new HashMap<>();
                    i++;
                }
                else if(c[i]==')') {
                    i++;
                    start=i;
                    while(i<n && Character.isDigit(c[i])) {
                        i++;
                    }
                    mul=start<i?Integer.parseInt(s.substring(start,i)):1;
                    Map<String,Integer> tempMap=currMap;
                    currMap=stack.pop();
                    for(String str:tempMap.keySet()) {
                        currMap.put(str,currMap.getOrDefault(str,0)+tempMap.get(str)*mul);
                    }
                }
                else if(Character.isUpperCase(c[i])) {
                    start=i;
                    i++;
                    while(i<n && Character.isLowerCase(c[i])) {
                        i++;
                    }
                    String atom=s.substring(start,i);
                    start=i;
                    while(i<n && Character.isDigit(c[i])) {
                        i++;
                    }
                    count=start<i?Integer.parseInt(s.substring(start,i)):1;
                    currMap.put(atom,currMap.getOrDefault(atom,0)+count);
                }
            }
            List<String> list=new ArrayList<>(currMap.keySet());
            Collections.sort(list);
            StringBuilder sb=new StringBuilder();
            for(String st:list) {
                sb.append(st);
                int in=currMap.get(st);
                if(in!=1) {
                    sb.append(in);
                }
            }
            System.out.println(sb.toString());
        }
    }
