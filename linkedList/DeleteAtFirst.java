class LinkedList {
    Node head; // Head of the list

    // Node class
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Method to delete a node at a given position
    void deleteNode(int position) {
        // If linked list is empty
        if (head == null) {
            return;
        }

        // Store head node
        Node temp = head;

        // If the head needs to be removed
        if (position == 0) {
            head = temp.next; // Change head
            return;
        }

        // Find the previous node of the node to be deleted
        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }

        // If position is more than number of nodes
        if (temp == null || temp.next == null) {
            return;
        }

        // Node temp.next is the node to be deleted
        // Store pointer to the next of node to be deleted
        temp.next = temp.next.next;

        // Unlink the deleted node from list
       
    }

    // Method to insert a new node at the end of the list
    public void append(int new_data) {
        Node new_node = new Node(new_data);

        if (head == null) {
            head = new_node;
            return;
        }

        new_node.next = null;

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = new_node;
    }

    // Method to print the LinkedList
    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();

        llist.append(1);
        llist.append(2);
        llist.append(3);
        llist.append(4);
        llist.append(5);

        System.out.println("Created Linked list is:");
        llist.printList();

        llist.deleteNode(2); // Delete node at position 2

        System.out.println("\nLinked List after Deletion at position 2:");
        llist.printList();
    }
}
