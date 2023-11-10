package Generics;

public class TestGenerics <T>{

    T obj;

    public void put(T obj){
        this.obj = obj;
    }

    public void print(){
        System.out.println(obj);
    }

    public static void main(String[] args) {

        TestGenerics<Integer> ob = new TestGenerics<>();
        ob.put(48);
        ob.print();

        TestGenerics<Character> ob1 = new TestGenerics<>();
        ob1.put('k');
        ob1.print();


    }



}
