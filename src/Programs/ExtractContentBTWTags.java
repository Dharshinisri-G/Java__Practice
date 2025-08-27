package Programs;

import java.util.Scanner;

public class ExtractContentBTWTags {
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        x.nextLine();
        for(int j=0;j<n;j++){
            String s=x.nextLine();
            boolean boo=false;
            int i=0;
            while(i<s.length()){
                int startTagOpen=s.indexOf('<',i);
                int startTagClose=s.indexOf('>',startTagOpen);
                if(startTagOpen==-1 || startTagClose==-1)
                    break;
                String startTag=s.substring(startTagOpen+1,startTagClose);
                if(startTag.trim().split("\\s+").length>3){
                    i=startTagClose+1;
                    continue;
                }
                String endTag="</"+startTag+">";
                int endTagOpen=s.indexOf(endTag,startTagClose+1);
                if(endTagOpen==-1){
                    i=startTagClose+1;
                    continue;
                }
                String str=s.substring(startTagClose+1,endTagOpen);
                if(str.contains("<")){
                    i=startTagClose+1;
                    continue;
                }else{
                    System.out.println(str);
                    boo=true;
                }
                i=endTagOpen+endTag.length();
            }
            if(!boo){
                System.out.println("None");
            }
        }
    }
}
