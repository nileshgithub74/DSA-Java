package Binarytree;

class Node{
    int data;
    Node right;
    Node left;

    Node(int data){
        this.data = data;
        this.left= null;
        this.right=null;
    }
}

public class BinaryTreeDemo {
    Node root;

     Node insertRec(Node root , int x){
        Node tem= new Node(x);
        if(root == null){
            return  tem;
        }
        if(root.data > x){
            root.left = insertRec(root.left,x);
        }else if(root.data  <x){
            root.right= insertRec(root.right, x);


        }
        return root;

    }

    void insert(int x){
        root= insertRec(root, x);

    }

    void display(Node root){
        if(root != null){
            display(root.left);
            System.out.print(root.data+" ");
            display(root.right);
        }
    }

    public  static void  main(String[] args){
        BinaryTreeDemo tree = new BinaryTreeDemo();

        tree.insert(10);
        tree.insert(20);
        tree.insert(50);
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Inorder traversal: ");
        tree.display(tree.root);
         
        

    }


    
}
