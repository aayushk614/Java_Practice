package DesignPatterns.Decorator;

/**
 * The Test class demonstrates the use of the decorator pattern to create a pizza with various toppings.
 */
public class Test {

    public static void main(String[] args) {

        // Create a pizza with double cheese and mushroom toppings
        BasePizza pizza = new DoubleCheese(new Mushroom(new Margerita()));
        System.out.println("The price of the pizza is " + pizza.getPrice());
    }
}
