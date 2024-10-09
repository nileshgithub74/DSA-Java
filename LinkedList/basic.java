import java.util.*;

class Node {
  int data;
  Node next;

  Node(int data) {
      this.data = data;
       this.next = next;
  }
}

public class basic {

  public static void display(Node head){
    Node  temp = head;
      while(temp != null){
        System.out.print(temp.data+" ");
        temp = temp.next;
      }
  }


  public static void displayreverse(Node head){
    if(head == null)return;
    displayreverse(head.next);
    System.out.print(head.data+" ");

  
  }

  public static int lengthlinkedlist(Node head){
    Node temp = head;
    int count =0;

    while (temp !=null) {
      count++;
      temp = temp.next;
      
    }
    return count;
  }

  public static void main(String[] args) {

      Node c = new Node(5);
      Node a = new Node(10);
      Node b = new Node(14);

      c.next = a;
      a.next = b;


      display(c);
      System.out.println();
      // displayreverse(c);
      System.out.println();
      int result = lengthlinkedlist(c);
      System.out.print("Length of linkedlist is : "+result);

      
    
  }
}
