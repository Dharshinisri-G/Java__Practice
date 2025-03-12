package LinkedList;
import java.util.*;
class DNode{
    DNode prev;
    int data;
    DNode next;
    DNode(int val){
        prev=null;
        data=val;
        next=null;
    }
}
public class doublyLinkedList {
    static DNode head,tail;
    doublyLinkedList(){
        head=null;
        tail=null;
    }
    public void insert(int val){
        DNode newnode=new DNode(val);
        if(head==null){
            head=tail=newnode;
        }
        else{
            tail.next=newnode;
            newnode.prev=tail;
            tail=newnode;
        }
    }
    public void display(){
        DNode temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            temp=temp.next;
            if(temp!=null) System.out.print("->");
        }
        System.out.println();
    }
    public void reverse(){
        DNode temp=tail;
        while(temp!=null){
            System.out.print(temp.data);
            temp=temp.prev;
            if(temp!=null) System.out.print("->");
        }
        System.out.println();
    }
}
class Mmain{
    public static void main(String args[]){
        doublyLinkedList dll=new doublyLinkedList();
        Scanner x=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=x.nextInt();
        System.out.print("Enter n numbers: ");
        for(int i=0;i<n;i++)
            dll.insert(x.nextInt());
        dll.display();
        dll.reverse();
    }
}
