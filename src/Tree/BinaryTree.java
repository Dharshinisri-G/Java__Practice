package Tree;
import java.util.*;
public class BinaryTree{
    Node root;
    class Node{
        int data;
        Node left,right;
        Node(int val){
            data=val;
            left=right=null;
        }
    }
    void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    void preorder(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    void postorder(Node root){
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    void levelorder(Node root){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            int size=q.size();
            while(size-->0){
                Node curr=q.poll();
                System.out.print(curr.data+" ");
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
        }
    }
    boolean isvalidbst(Node root,int min,int max){
        if(root==null) return true;
        if(root.data>=max || root.data<=min) return false;
        return isvalidbst(root.left,min,root.data) && isvalidbst(root.right,root.data,max);
    }
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        BinaryTree bt=new BinaryTree();
        bt.root=bt.new Node(10);
        bt.root.left=bt.new Node(5);
        bt.root.right=bt.new Node(14);
        bt.root.left.left=bt.new Node(3);
        bt.root.left.right=bt.new Node(7);
        bt.root.right.left=bt.new Node(12);
        bt.root.right.right=bt.new Node(16);
        System.out.print("Inorder: ");
        bt.inorder(bt.root);
        System.out.print("\nPostorder: ");
        bt.postorder(bt.root);
        System.out.print("\nPreorder: ");
        bt.preorder(bt.root);
        System.out.print("\nLevel Order: ");
        bt.levelorder(bt.root);
        System.out.print("\nValidate Binary Tree is Binary Search Tree: ");
        System.out.print(bt.isvalidbst(bt.root,Integer.MIN_VALUE,Integer.MAX_VALUE));
    }
}
