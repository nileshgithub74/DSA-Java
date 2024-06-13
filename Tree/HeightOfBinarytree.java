// class Node{
//     int data;
//     Node left ;
//      Node right;

//     Node(int data){
//         this.data = data;
//         this.right = null;
//         this.left= null;
//     }
// }





// public class HeightOfBinarytree {


//     static int height(Node root){
//         if( root == null){
//             return 0;
//         }

//         int leftheight= height(root.left);
//         int rightheight = height(root.right);

//         return Math.max(leftheight, rightheight)+ 1;

//     }
//     static  void inorder(Node root){
//         if( root != null){

//             inorder(root.left);
//             System.out.println(root.data+" ");
//             inorder(root.right);


//         }

//     }
//     public  static void main(String[] args){
//         Node root = new Node(10);
//         root.right = new Node(20);
//         root.left = new Node(30);
//         root.right.left = new Node(40);
//         root.left.left = new Node( 50);

//         System.out.println("Inorder traversal : ");
//         inorder(root);

//         System.out.println("Height of Binary tree : ");
//         System.out.println(height(root));
//     }
    
// }
