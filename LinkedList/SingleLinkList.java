class Node{
    private int data;
    private Node next;

    public Node(){
        data=0;
        next = null;

    }
    public void setData(int d){
        data= d;

    }
    public void  setext(Node n){
        next =n;
    }
    public int getData(){
        return(data);
    }
    public Node getNext(){
        return(next);

    }
}

class LinkList{
    private int size;
    private Node start;

    public LinkList(){
        size =0;
        start = null;


    }
    public void insertAtFirst(){
        
    }
    public boolean isEmpty(){
        if(start == null){
            return true;

        }else{
            return false;
        }
    }
    public int getListSize(){
        return  size;
    }
    public  void viewList(){
        Node t;

        if(isEmpty()){
            System.out.println("List is empty");

        }
        else{
            t=start;
            for(int i=0; i<=size; i++){
                System.out.print(" "+t.getData());
                t=t.getNext();
            }
        }
         
    }


}