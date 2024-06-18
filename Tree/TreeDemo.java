// // class Node {
// //     int data;
// //     Node left;
// //     Node right;

// //     Node(int data) {
// //         this.data = data;
// //         this.left = null;
// //         this.right = null;
// //     }
// // }

// // public class TreeDemo {
// //     public static void inorder(Node root) {
// //         if (root != null) {
// //             inorder(root.left);
// //             System.out.print(root.data + " ");
// //             inorder(root.right);
// //         }
// //     }

// //     public static void main(String[] args) {
// //         Node root = new Node(10);
// //         root.left = new Node(20);
// //         root.right = new Node(30);
// //         root.right.right = new Node(40);
// //         root.left.left = new Node(50);

// //         System.out.println("Inorder traversal of Tree:");
// //         inorder(root);
// //         System.out.println(); // New line for better output formatting
// //     }
// // }


// class Node{
//     int data;
//     Node right;
//     Node left;

//     Node(int data){
//         this.data = data;
//         this.right = null;
//         this.left = null;

//     }

// }

// public class TreeDemo{

//      void inorder(Node root){
//         if(root != null){
//             inorder(root.left);
//             System.out.println(root.data+" ");
//             inorder(root.right);
//         }
//     }

//     static void preorder(Node root){
//         if(root != null){
//             System.out.print(root.data+" ");
//             preorder(root.left);
//             preorder(root.right);
//         }
//     }

//     static void postorder(Node root){
//         if(root != null){
//             postorder(root.left);
//             postorder(root.right);
//             System.out.print(root.data+" ");
//         }
//     }

//     public static void main(String[] args){
//         Node  root = new Node(10);
//         root.left  =new Node(40);
//         root.right = new Node(30);
//         root.right.left = new Node(50);
//         root.right.left.right = new Node(60);
//         root.left.right= new  Node(70);

//         TreeDemo tree  = new TreeDemo();
//         System.out.println("Inorder Traversal: ");
//         tree.inorder(root);

//         System.out.println("Preorder traversal : ");
//         preorder(root);

//         System.out.println("PostOrder traversal: ");
//         postorder(root);
//     }
    
// }