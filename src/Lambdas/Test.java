package Lambdas;


@FunctionalInterface
interface Func{
    public void say();
}


interface Animal{
    public void bark();
    public void eat();
}


public class Test{

    public static void main(String[] args) {

        Func obj = new Func(){

            public void say(){

                System.out.println("sayinnnggg");
            }
        };

        Func ob2 = () -> {
            System.out.println("Sayingg from lambda");
        };

        ob2.say();


        Animal ob4 = new Animal() {
            @Override
            public void bark() {
                System.out.println("bark");
            }

            @Override
            public void eat() {
                System.out.println("eat");

            }
        };

        ob4.bark();
        ob4.eat();



    }





}
