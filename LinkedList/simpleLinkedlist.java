class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
       

    }
}

public class simpleLinkedlist {
    public static void main(String[] args){
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.next= temp2;


        
    }
    
}
