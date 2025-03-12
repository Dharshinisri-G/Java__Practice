package Stack_Queue;
import java.util.*;
public class QueueUsingTwoStack {
    Stack<Integer> s1;
    Stack<Integer> s2;
    QueueUsingTwoStack(){
     s1=new Stack<>();
     s2=new Stack<>();
    }
    public void enqueue(int n){
        System.out.println("Inserted: "+n);
        while(!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s1.push(n);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
    public int dequeue(){
        return s1.pop();
    }
    public int peek(){
        return  s1.peek();
    }
    public boolean isEmpty(){
        return s1.size()==0;
    }

    public static void main(String args[]){
        QueueUsingTwoStack q=new QueueUsingTwoStack();
//        Scanner x=new Scanner(System.in);
//
//        while(true){
//            System.out.println("1.Enqueue \n 2.Dequeue \n 3.EmptyOrNot \n 4.FrontElement \n 5.Stop");
//            System.out.print("Enter your Choice: ");
//            int choice=x.nextInt();
//            switch(choice){
//                case 1:
//            }
//        }
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        System.out.println("Deleted: "+q.dequeue());
        System.out.println("Deleted: "+q.dequeue());
        System.out.println((q.isEmpty())?"Queue is Empty":"Queue is not Empty");
        System.out.println("Front Element: "+q.peek());
    }
}
