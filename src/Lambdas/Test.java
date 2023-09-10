package Lambdas;


@FunctionalInterface
interface A{

    void run();

}



public class Test{




    public static void main(String[] args) {

        A obj = () ->{
                System.out.println("Run implemented!!!!");

        };




        obj.run();

    }



}
