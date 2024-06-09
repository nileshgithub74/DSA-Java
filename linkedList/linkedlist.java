package linkedList;


class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        next = null;
    }
}
public class linkedlist {
    Node head;


    public  void InsertAtEnd( int data){     
        Node newNode = new Node(data );
        if(head == null){
            head = newNode;
            return;
        }
        
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;

        }
        curr.next = newNode;

    }
    public  void display()  // to display the element....
    {
        Node curr = head;
        while(curr != null){

            System.out.println(curr.data);
            curr = curr.next;

        }

    }
    public static void main(String[] args){
        linkedlist li = new linkedlist();
        li.InsertAtEnd(20);
        li.InsertAtEnd( 30);
        li.InsertAtEnd( 40);
        li.InsertAtEnd( 40);

        li.display();


    }
}
