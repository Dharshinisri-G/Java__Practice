package Tree;
import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int val){
        data=val;
    }
}
public class BST {
    Node root;
    BST(){
        root=null;
    }
    Node insert(Node root,int val){
        if(root==null)
            return new Node(val);
        if(val<root.data)
            root.left=insert(root.left,val);
        else if(root.data<val)
            root.right=insert(root.right,val);
        return root;
    }
    void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    void postorder(Node root){
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    void preorder(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
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
    boolean isbst(Node root,int min,int max){
        if(root==null) return true;
        if(root.data<=min|| root.data>=max) return false;
        return isbst(root.left,min,root.data) && isbst(root.right,root.data,max);
    }
    boolean ispresent(int search,Node root){
        if(root==null) return false;
        if(root.data==search) return true;
        if(search<root.data) return ispresent(search,root.left);
        return ispresent(search,root.right);
    }
    int findmin(Node root){
        if(root.left==null)
            return root.data;
        return findmin(root.left);
    }
    int findmax(Node root){
        if(root.right==null)
            return root.data;
        return findmax(root.right);
    }
    int findheight(Node root){
        if(root==null) return -1;
        int leftheight=findheight(root.left);
        int rightheight=findheight(root.right);
        return Math.max(leftheight,rightheight)+1;
    }
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=x.nextInt();
        System.out.println("Enter n number of Elements: ");
        BST bst=new BST();
        for(int i=0;i<n;i++){
            bst.root=bst.insert(bst.root,x.nextInt());
        }
        System.out.print("Inorder: ");
        bst.inorder(bst.root);
        System.out.print("\nPreorder: ");
        bst.preorder(bst.root);
        System.out.print("\nPostorder: ");
        bst.postorder(bst.root);
        System.out.print("\nLevelorder: ");
        bst.levelorder(bst.root);
        System.out.print("\nIs Binary Search Tree: "+bst.isbst(bst.root,Integer.MIN_VALUE,Integer.MAX_VALUE));
        System.out.println("Min Element: "+bst.findmin(bst.root));
        System.out.println("Max Element: "+bst.findmax(bst.root));
        System.out.println("Height of a tree "+bst.findheight(bst.root));
        System.out.println("\nEnter Element to Search: ");
        int search=x.nextInt();
        System.out.println("IsPresent: "+bst.ispresent(search,bst.root));
    }
}
