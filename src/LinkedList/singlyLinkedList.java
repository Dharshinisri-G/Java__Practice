package LinkedList;
import java.util.*;
    class Node{
        int data;
        Node next;
        Node(int val){
            data=val;
            next=null;
        }
    }
public class singlyLinkedList {
    Node head,tail;
    singlyLinkedList(){
        head=null;
        tail=null;
    }
    public void insert(int val){
        Node newnode=new Node(val);
        if(head==null){
            head=newnode;
            tail=newnode;
        }
        else {
            tail.next = newnode;
            tail = newnode;
        }
    }
    public void insertAtPos(int pos,int val){
        if(pos==0 || pos>length()+1){
            System.out.println("Not a Valid Position");
            return;
        }
        Node newnode=new Node(val);
        if(pos==1){
            newnode.next=head;
            head=newnode;
        }
        else {
            int i = 1;
            Node temp = head;
            while (i < pos - 1) {
                temp = temp.next;
                i++;
            }
            newnode.next = temp.next;
            temp.next = newnode;
        }
    }
    public void deleteAtPos(int pos){
        if(pos>length()){
            System.out.println("Not a Valid Position");
            return;
        }
        else if(pos==1){
            head=head.next;
        }
        else {
            int i = 1;
            Node prev = head;
            Node curr = prev.next;
            while (i < pos - 1) {
                prev = prev.next;
                curr = prev.next;
                i++;
            }
            prev.next = curr.next;
        }
    }
    public int length(){
        Node temp=head;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        return len;
    }
    public void deleteNumber(int val){
        Node prev=null;
        Node curr=head;
        while(curr!=null && curr.data!=val){
            prev=curr;
            curr=curr.next;
        }
        if(curr==null){
            System.out.println("Number doesn't exist in the list");
            return;
        }
        if(curr==head)
            head=head.next;
        else
            prev.next=curr.next;
    }
    public void deleteMiddle(){
        int mid=length()/2;
        deleteAtPos(mid+1);
    }
    public int findMid(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }
    public void reverse(){
        Node prev=null;
        Node Next=null;
        Node curr=head;
        tail=head;
        while(curr!=null){
            Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        head=prev;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            temp=temp.next;
            if(temp!=null) System.out.print("->");
        }
        System.out.println();
    }
}
class Main{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        singlyLinkedList sll=new singlyLinkedList();
        sll.insert(10);
        sll.insert(20);
        sll.insert(30);
        sll.insert(40);
        sll.insert(50);
        sll.display();
        while(true) {
            System.out.print("(1.Insert 2.Insert at Position 3.Delete at Position 4.Delete Number 5.Delete Middle 6.find middle 7.Display 8.reverse 9.Exit)\nEnter your choice: ");
            int choice=x.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    int num = x.nextInt();
                    sll.insert(num);
                    break;
                case 2:
                    System.out.print("Enter a number: ");
                    int no = x.nextInt();
                    System.out.print("Enter position: ");
                    int pos = x.nextInt();
                    sll.insertAtPos(pos, no);
                    sll.display();
                    break;
                case 3:
                    System.out.print("Enter position: ");
                    int po = x.nextInt();
                    sll.deleteAtPos(po);
                    sll.display();
                    break;
                case 4:
                    System.out.print("Enter number: ");
                    int v=x.nextInt();
                    sll.deleteNumber(v);
                    sll.display();
                    break;
                case 5:
                    sll.deleteMiddle();
                    sll.display();
                    break;
                case 6:
                    int mid=sll.findMid();
                    System.out.println(mid);
                case 7:
                    sll.display();
                    break;
                case 8:
                    sll.reverse();
                    sll.display();
                    break;
                case 9:
                    return ;
                default:
                    System.out.println("Enter a valid Choice");
            }
        }
    }
}
