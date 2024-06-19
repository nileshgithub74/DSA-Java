package Binarytree;



class Node{
    int data;
    Node right;
    Node left;

    Node(int data){
        this.data = data;
        this.left =null;
        this.right= null;
    }
}

public class SearchIterative {
    Node root;

    Node insertRec(Node root, int x){
        Node tem = new Node(x);
        if(root == null){
            return tem;
        }
        if(root.data == x){
            return root;
        }
        else if( root.data < x){
            root.right = insertRec(root.right, x);
        }else{
            root.left = insertRec(root.left, x);
        }
        return root;
    }

     Node insert(int key){
        return insertRec(root, key);
     }

    public static void main(String[] args){

    }

    
}
