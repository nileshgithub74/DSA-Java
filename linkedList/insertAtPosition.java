// package linkedList;

// class Node{
//     int data;
//     Node next;

//     Node( int data){
//         this.data = data;
//     }
// }

// public class insertAtPosition {
//     Node head;

//     public void InsertAtEnd(int data){
//         Node newNode = new Node(data);
//         if(head == null){
//             head= newNode;
//             return;
//         }
//         else{

//             Node curr = head;
//             while(curr.next != null){
//                 curr = curr.next;
//             }
//             curr.next = newNode;
//         }
//     }
//     public void insertFirst(int data){
//         Node temp =new Node(data);
//         if(head == null){
//             head = temp;
//         }else{
//             temp.next = head;
//             head= temp;
//         }
//     }
//     public void insertPosition(int data, int pos){
        
//         Node  temp= new Node(data);
//         if(pos == 1){
//             temp.next = head;
//             head= temp;
         
//         }

//         Node curr = head;

//         for(int i=1; i< pos-1; i++){
//             curr = curr.next;
//         }

//         temp.next = curr.next;
//         curr.next = temp;


//     }

//     public void display(){
//         Node curr = head;

//         while( curr.next != null){
//             System.out.println(curr.data + " ->");
//             curr = curr.next;
//         }

//     }

//     public static void main(String[] args){
//         insertAtPosition li = new insertAtPosition();
//         li.InsertAtEnd(10);
//         li.InsertAtEnd(20);
//         li.InsertAtEnd(30);
//         li.InsertAtEnd(40);


//         System.out.println("Element in the linked list are: ");
//         li.display();

//         li.insertPosition(50, 3);
//         System.out.println("after updating: ");
//         li.display();




//     }


// }
