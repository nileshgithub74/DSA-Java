// class Node {
//     int data;
//     Node left;
//     Node right;

//     Node(int data) {
//         this.data = data;
//         this.left = null;
//         this.right = null;
//     }
// }

// public class TreeDemo {
//     public static void inorder(Node root) {
//         if (root != null) {
//             inorder(root.left);
//             System.out.print(root.data + " ");
//             inorder(root.right);
//         }
//     }

//     public static void main(String[] args) {
//         Node root = new Node(10);
//         root.left = new Node(20);
//         root.right = new Node(30);
//         root.right.right = new Node(40);
//         root.left.left = new Node(50);

//         System.out.println("Inorder traversal of Tree:");
//         inorder(root);
//         System.out.println(); // New line for better output formatting
//     }
// }
