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
     static Node root;
    SearchIterative(){
        this.root = null;
    }

   static  Node insertRec(Node root, int x){
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

    static void insert(int key) {
        root = insertRec(root, key);
    }

    public static void main(String[] args){
       
        insert(10);
        insert(20);

    }

    
}
