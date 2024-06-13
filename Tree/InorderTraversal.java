class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left = null; 
        this.right = null;


    }

}






public class InorderTraversal {

    static void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }

    public static void main(String[] args){
        Node root = new Node(10);
        root.left = new Node( 20);
        root.right = new Node( 60);
       root.left.right = new Node (30);
       root.right.left = new Node(50);

       System.out.println("InOrder traversal : ");
       inorder(root);
    }
    
}
