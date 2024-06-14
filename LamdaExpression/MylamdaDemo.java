package LamdaExpression;


@FunctionalInterface


interface Mylamda{

    public void display();
}


class Myclass implements Mylamda{
    public void display(){
        System.out.println("Heyy , this is nilesh");
    }

   
}
public class MylamdaDemo{
    public static void main(String[] args){
        Mylamda  m = new Myclass();
        m.display();
    }
}










