// class Node{
//     int data;
//     Node left;
//     Node right;
//     Node(int data){
//         this.data = data;
//         this.right = null;
//         this.left = null;
//     }
// }


// public class PreOrderTraversal {
//     static void preorder(Node root){
//         if(root != null){
//             System.out.print(root.data+" ");
//             preorder(root.left);
//             preorder(root.right);

//         }
//     }

//     public static void main(String[] args){
//         Node root = new Node(10);
//         root.left = new Node( 20);
//         root.right = new Node( 40);
//         root.right.left = new Node( 50);
//         root.left.left = new Node ( 90);

//         System.out.println("Preorder traversal: ");
//         preorder(root);
//     }

    
// }
