package Generics;
//Generic class
class Receive<T>{

    T obj;

    void add(T obj){
        this.obj = obj;
    }

    void print(){
        System.out.println(obj);
    }


}



public class DemoGenerics {



    public static void main(String[] args) {

        Receive<Integer> obj = new Receive<>();

        obj.add(5);
        obj.print();

        Receive<Character> ob2 = new Receive<>();
        ob2.add('t');
        ob2.print();




    }
}
