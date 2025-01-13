package DesignPatterns.Decorator;

/**
 * The Margerita class represents a type of pizza.
 * It extends the BasePizza class and provides a specific implementation for calculating the price of the Margerita pizza.
 */
public class Margerita extends BasePizza {

    /**
     * Calculates the price of the Margerita pizza.
     *
     * @return The price of the Margerita pizza.
     */
    public int getPrice() {
        System.out.println("Margerita added");
        return 100;
    }
}
