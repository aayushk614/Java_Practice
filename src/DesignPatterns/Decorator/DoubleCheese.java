package DesignPatterns.Decorator;

/**
 * The DoubleCheese class represents a topping decorator that adds double cheese to a pizza.
 * It extends the Toppings class and provides a specific implementation for calculating the price of the pizza with double cheese.
 */
public class DoubleCheese extends Toppings {

    private BasePizza basePizza;

    /**
     * Constructs a new DoubleCheese decorator with the specified base pizza.
     *
     * @param basePizza The base pizza to which double cheese will be added.
     */
    public DoubleCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    /**
     * Calculates the price of the pizza with double cheese.
     *
     * @return The price of the pizza with double cheese.
     */
    public int getPrice() {
        System.out.println("Double cheese added");
        return basePizza.getPrice() + 150;
    }
}
