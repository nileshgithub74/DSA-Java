 class Node{
    int data; 
    Node  next;
    public Node(int data){
        this.data = data; this.next = null;
    }

    public static void Printlist(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
}

public class TraverseFun {
    public static void main(String[] args){
        Node  head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.next = temp2;
        Node.Printlist(head);
    }
    
}
