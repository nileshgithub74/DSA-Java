class Node {
  int data;
  Node next;

  // Constructor to initialize the node
  Node(int data) {
      this.data = data;
      this.next = null; // initialize next as null
  }
}

public class basic {

  public static void main(String[] args) {
      // Create nodes
      Node temp = new Node(5);
      Node a = new Node(10);
      Node b = new Node(14);

      // Link the nodes
      temp.next = a;
      a.next = b;

     System.out.println(a.data);
    
  }
}
