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
        if(root.left!=null)
            return findmin(root.left);
        return root.data;
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
    int calNodesAtLevel(Node root,int level){
        if(root==null) return 0;
        if(level==0) return 1;
        return calNodesAtLevel(root.left,level-1)+calNodesAtLevel(root.right,level-1);
    }
    int maxnodes(Node root){
        int h=findheight(root);
        return (int)(Math.pow(2,h+1)-1);
    }
    int maxNodesAtLevel(Node root,int level){
        return (int)Math.pow(2,level);
    }
    int depthOfNode(Node root,int target,int depth){
        if(root==null) return -1;
        if(root.data==target) return depth;
        int le=depthOfNode(root.left,target,depth+1);
        if(le!=-1) return le;
        return depthOfNode(root.right,target,depth+1);
    }
    void rightview(Node root){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            int size=q.size();
            Node rightmost=null;
            while(size-->0){
                Node curr=q.poll();
                rightmost=curr;
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            System.out.print(rightmost.data+" ");
        }
    }
    void leftview(Node root){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            int size=q.size();
            Node leftmost=null;
            for(int i=0;i<size;i++){
                Node curr=q.poll();
                if(i==0) leftmost=curr;
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            System.out.print(leftmost.data+" ");
        }
    }
    void topview(Node root){

    }
    int size(Node root){
        if(root==null) return 0;
        return 1+size(root.left)+size(root.right);
    }
    Node deletenode(Node root,int key){
        if(root==null)
            return root;
        if(key<root.data){
            root.left= deletenode(root.left,key);
        }
        else if(key>root.data){
            root.right=deletenode(root.right,key);
        }
        else{
            if(root.left==null)
                return root.right;
            else if(root.right==null)
                return root.left;
            root.data=findmin(root.right);
            root.right=deletenode(root.right,root.data);
        }
        return root;
    }
    Node findLca(Node root,int source,int destination){ //Least Common Ancestor
        if(root==null) return root;
        if(source<root.data && destination<root.data) return findLca(root.left,source,destination);
        else if(source>root.data && destination>root.data) return findLca(root.right,source,destination);
        return root;
    }

    int findDistance(int source,int destination,Node root){
        Node lca=findLca(root,source,destination);
        System.out.println(lca.data);
        return depthOfNode(lca,source,0)+depthOfNode(lca,destination,0);
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
        System.out.print("\nEnter source: ");
        int source=x.nextInt();
        System.out.print("Enter Destination: ");
        int destination=x.nextInt();
        System.out.print("The distance between source and destination is "+bst.findDistance(source,destination,bst.root));
//        System.out.print("\nSize of the Tree: "+bst.size(bst.root));
//        System.out.println("\nEnter a Node to Delete: ");
//        int dlt=x.nextInt();
//        bst.root=bst.deletenode(bst.root,dlt);
//        System.out.print("Inorder: ");
//        bst.inorder(bst.root);
//        System.out.print("\nPreorder: ");
//        bst.preorder(bst.root);
//        System.out.print("\nPostorder: ");
//        bst.postorder(bst.root);
//        System.out.print("\nLevelorder: ");
//        bst.levelorder(bst.root);
//        System.out.println("\nIs Binary Search Tree: "+bst.isbst(bst.root,Integer.MIN_VALUE,Integer.MAX_VALUE));
//        System.out.println("Min Element: "+bst.findmin(bst.root));
//        System.out.println("Max Element: "+bst.findmax(bst.root));
//        System.out.println("Height of a tree "+bst.findheight(bst.root));
//        System.out.println("Right View of a tree ");
//        bst.rightview(bst.root);
//        System.out.println("\nLeft View of a tree ");
//        bst.leftview(bst.root);
//        System.out.println("\nTop View of a tree ");
//        bst.topview(bst.root);
//        System.out.println("Enter Element to Search: ");
//        int search=x.nextInt();
//        System.out.println("IsPresent: "+bst.ispresent(search,bst.root));
//        System.out.println("Maximum nodes in a tree of height "+bst.findheight(bst.root)+" has "+bst.maxnodes(bst.root));
//        System.out.println("Enter a level: ");
//        int level=x.nextInt();
//        System.out.println("Maximum nodes in level "+level+" is "+bst.maxNodesAtLevel(bst.root,level));
//        System.out.println("Number of Nodes in level "+level+" is "+bst.calNodesAtLevel(bst.root,level));
//        System.out.println("Enter node to find its depth: ");
//        int target=x.nextInt();
//        System.out.print("Depth of a Node "+target+" is "+bst.depthOfNode(bst.root,target,0));
    }
}
