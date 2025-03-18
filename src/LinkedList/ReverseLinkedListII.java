package LinkedList;

import java.util.Scanner;

public class ReverseLinkedListII {
    Node head,tail;
    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }
    ReverseLinkedListII(){
        head=null;
        tail=null;
    }
    void insert(int val){
        Node nn=new Node(val);
        if(head==null){
            head=nn;
            tail=nn;
        }else{
            tail.next=nn;
            tail=nn;
        }
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            temp=temp.next;
            if(temp.next!=null)
                System.out.print("->");
        }
    }

    void reverse(int l,int r){

        Node dummy=null;
    }
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        ReverseLinkedListII rv=new ReverseLinkedListII();
        int n=x.nextInt();
        for(int i=0;i<n;i++)
            rv.insert(x.nextInt());
        rv.display();
        int l=x.nextInt();
        int r=x.nextInt();
        rv.reverse(l,r);
        rv.display();
    }
}
