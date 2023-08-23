package DesignPatterns;


class Singleton{

    private static Singleton obj = null;

    private Singleton(){

        System.out.println("Singleton Constructor called!!");
    }

    public static synchronized Singleton getInstance(){

        if(obj == null)
            obj = new Singleton();

        return obj;

    }


}



public class SingletonD {



    public static void main(String[] args) {

        Singleton obj = Singleton.getInstance();
        Singleton ob2 = Singleton.getInstance();
        Singleton ob3 = Singleton.getInstance();

        System.out.println(obj.hashCode());
        System.out.println(ob2.hashCode());
        System.out.println(ob3.hashCode());


    }







}
