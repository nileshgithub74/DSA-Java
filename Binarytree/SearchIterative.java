// package Binarytree;



// class Node{
//     int data;
//     Node right;
//     Node left;

//     Node(int data){
//         this.data = data;
//         this.left =null;
//         this.right= null;
//     }
// }

// public class SearchIterative {
//       Node root;
//     // SearchIterative(){
//     //     this.root = null;
//     // }

//     Node insertRec(Node root, int x){
//         Node tem = new Node(x);
//         if(root == null){
//             return tem;
//         }
//         if(root.data == x){
//             return root;
//         }
//         else if( root.data < x){
//             root.right = insertRec(root.right, x);
//         }else{
//             root.left = insertRec(root.left, x);
//         }
//         return root;
//     }

//      void insert(int key) {
//         root = insertRec(root, key);
//     }

//     public static void main(String[] args){
//         SearchIterative tree = new SearchIterative();
       
//         tree.insert(50);
//         tree.insert(30);
//         tree.insert(20);
//         tree.insert(40);
//         tree.insert(70);
//         tree.insert(60);
//         tree.insert(80);


        
//     }

    
// }
