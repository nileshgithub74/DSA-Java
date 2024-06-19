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
    Node root;


    static boolean search(Node root, int x) {
        if (root == null) {
            return false;
        }

        if (root.data == x) {
            return true;
        } else if (root.data < x) {
            return search(root.right, x);
        } else {
            return search(root.left, x);
        }
    }

   static  void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }


    

    public static void main(String[] args){

        SearchDemo tree   =new SearchDemo();
       
        tree.root = new Node(50);

        
        tree.root.left = new Node(30);
        tree.root.right = new Node(70);

        tree.root.left.left = new Node(20);
        tree.root.left.right = new Node(40);

        tree.root.right.left = new Node(60);
        tree.root.right.right = new Node(80);


     System.out.println("Inoder traversal : ");
        inorder(tree.root);

        System.out.println();

        boolean result = search(tree.root , 70);
        if(result){
            System.out.println("yes it is found");
        }else{
            System.out.println(" Not found");
        }
        
    
      



















    }



    
    
}
