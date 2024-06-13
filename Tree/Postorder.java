// class  Node{
//     int data;
//     Node left;
//     Node right;

//     Node( int data){
//         this.data = data;
//         this.left = null;
//         this.right = null;
//     }


// }
 
// public class Postorder {

//     static void postorder(Node root){
//         if( root != null){
//             postorder(root.left);
//             postorder(root.right);
//             System.out.print(root.data+" ");
//         }
//     }

//     public static void main(String[] args){
//         Node root = new Node( 10);
//         root.right = new Node( 20);
//         root.left = new Node( 30);

//         root.left.right = new Node(40);
//         root.right.left = new Node( 60);

//         System.out.print("Postorder Traversal : ");
//         postorder(root);

//     }
    
// }
