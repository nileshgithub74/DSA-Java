

class Node {
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data = data;
        prev = null;
        next= null;
    }
}
public class traversal {

    void display(Node head){
        if(head == null)
           return ;
        
        System.out.println(head.data +" ");
        Node temp = head.next;
        while(temp != head){
            System.out.println(temp.data+" ");
            temp= temp.next;

        }

    }


    
}
