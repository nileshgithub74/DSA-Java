// class Node{
//     int data;
//     Node next;
//     public Node(int data){
//         this.data = data;
//         this.next = null;

//     }

//     static int SearchElement(int element, Node head ){
//         Node curr = head;
//         int position = 1;
//         while(curr != null){
//             if(curr.data == element){
//                 return   position;

//             }else{
//                 position ++;
//                 curr = curr.next;
//             }
//         }
//         return -1;
//     }

//     static void display(Node head){
//         Node  curr = head;
//         while(curr != null ){
//             System.out.println(curr.data+" ");
//             curr = curr.next;
//         }
//     }
// }

// public class Searching{
//     public static void main(String[] args){
//         Node head1 = new Node(10);
//         Node temp1 = new Node(20);
//         Node temp2 = new Node( 30);

//         head1.next= temp1;
//         temp1.next = temp2;

      
        
//         // Node.display(head1);
//         int position= Node.SearchElement( 20, head1);
//         System.out.println(position);
//     }
// }