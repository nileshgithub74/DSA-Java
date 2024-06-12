package Stack;
class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;

    }
}
public class linkedlist {
    Node head;

    public linkedlist(){
        this.head = null;
        
    }

    public boolean isEmpty(){
        return  head == null;
    }

    public void push(int value){

        Node temp = new Node( value);
        temp.next = head;
         head = temp;;
        
    }
    public int pop(){
        if(isEmpty()){
            return -1;
        }else{
            int res = head.data;
            head = head.next;
            return  res;
        }
    }
    public int peek(){
        if(isEmpty()){return -1;

        }else{
            return head.data;
        }
    }

    public void display(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        linkedlist s = new linkedlist();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.display();

        s.pop();
        System.out.println("after pop: ");
        s.display();

        System.out.println(s.peek());
    }

    
}
