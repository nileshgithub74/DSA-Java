package Binarytree;


class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right =null;
    }
}




public class SearchDemo {

    static void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }

    public static void main(String[] args){
        Node root = new root(10);
        root.right
    }

    
    
}
