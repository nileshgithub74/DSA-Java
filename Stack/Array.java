// package Stack;


// class Mystack{
//     int  arr[];
//     int capacity ;
//     int top ;

//     public Mystack(int capacity){
//         this.capacity = capacity;
//         top = -1;
//         arr = new int[capacity];

//     }
//     public boolean isFull(){
//         if(top == capacity-1)
//            return  true;
       
//         return false;
//     }
//     public boolean isEmpty(){
//         if( top == -1)
//            return true;
       
//         return false;
//     }

//     public void push(int value){
//         if(isFull()){
//             System.out.println("stack is full");
//         }else{
//             top ++;
//             arr[top] = value;
//         }
//     }

//     public int pop(){
//         if(isEmpty()){
//             System.out.println("stack is empty");
//             return -1;

//         } else{
//             int result = arr[top];
//             top --;
//             return result;

//         }
//     }
//     public int peek(){
//         if(isEmpty()){
//             System.out.println("Empty");
//             return -1;
//         }else{
//             return  arr[top];
//         }

//     }

//     public void display(){
//         if(isEmpty()){
//             System.out.println("Stack is empty");
//         }else{
//             System.out.println("stack elements are: ");
//             for(int i=0; i<=top; i++){
//                 System.out.print(arr[i] +" ");
//             }
//         }
//     }


// }

// public class Array {
//     public static  void main(String[] args){
//         Mystack  s = new Mystack( 5);
//         s.push(10);
//         s.push(20);
//         s.push(30);
//         s.push(40);
//         s.push(50);

//        s.display();
//        s.pop();
//        s.display();
      

//         System.out.println(s.peek());
        





//     }
    
// }
