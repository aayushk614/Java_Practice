package DesignPatterns.Decorator;

public class Test {

    public static void main(String[] args) {



        BasePizza pizza = new DoubleCheese(new Mushroom(new WoodFire()));
        System.out.println("the price of pizza is "+ pizza.price());



    }
}
