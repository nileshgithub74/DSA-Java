
class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;

  }
}

public class implementation {
  static Node head = null;

  static void insertAtBeginning(int data) {

    Node temp = new Node(data);

    if (head == null) {
      head = temp;

    } else {

      temp.next = head;
      head = temp ;

    }

  }

  // insert at the end of linked list
  public static void insertAtEnd(int data) {

    Node newNode = new Node(data);

    if (head == null) {
      head = newNode;
      return;

    }

    Node temp = head;
    while (temp.next != null) {
      temp = temp.next;

    }
    temp.next = newNode;

  }

  // display the linked list

  public static void display() {
    Node temp = head;

    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
  }

  public static void main(String[] args) {

    // inserting the element ;
    insertAtEnd(5);
    insertAtEnd(15);
    insertAtEnd(35);

    insertAtBeginning(5);
    insertAtBeginning(0);
    insertAtBeginning(-5);

    // displaying the element ;

    display();

  }

}