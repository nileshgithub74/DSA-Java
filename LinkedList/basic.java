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

  public static void main(String[] args) {

      Node temp = new Node(5);
      Node a = new Node(10);
      Node b = new Node(14);


      temp.next = a;
      a.next = b;

     System.out.println(a.data);
    
  }
}
