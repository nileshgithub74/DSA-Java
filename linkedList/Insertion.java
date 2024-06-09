package linkedList;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

public class Insertion {
    Node head;


    public  void InsertAtfirst(int data){
        Node temp = new Node(data);
        if(head == null){
           
            head = temp;
        }
        else{
            temp.next= head;
            head = temp;
        }
    }
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return ;
            
        }
        Node  curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next= newNode;
    }

    public void display(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + "->");
            curr= curr.next;
        }
    }
    public static void main(String[] args){
        Insertion li = new Insertion();
        li.insertAtEnd(10);
        li.insertAtEnd(20);
        li.insertAtEnd(30);
        li.insertAtEnd(40);
        li.insertAtEnd(50);
        li.insertAtEnd(60);

        System.out.println("Element in the Linked-list: ");
        li.display();

        System.out.println("Element after Insertion: ");
        li.InsertAtfirst(5);
        li.display();

    }
    
}
