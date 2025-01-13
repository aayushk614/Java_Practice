package DesignPatterns.Decorator;

/**
 * The Mushroom class represents a topping decorator that adds mushrooms to a pizza.
 * It extends the Toppings class and provides a specific implementation for calculating the price of the pizza with mushrooms.
 */
public class Mushroom extends Toppings {

    private BasePizza basePizza;

    /**
     * Constructs a new Mushroom decorator with the specified base pizza.
     *
     * @param basePizza The base pizza to which mushrooms will be added.
     */
    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    /**
     * Calculates the price of the pizza with mushrooms.
     *
     * @return The price of the pizza with mushrooms.
     */
    public int getPrice() {
        System.out.println("Mushroom added");
        return basePizza.getPrice() + 80;
    }
}
