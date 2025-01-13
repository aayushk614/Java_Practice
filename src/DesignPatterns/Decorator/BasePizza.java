package DesignPatterns.Decorator;

/**
 * Abstract class representing a base pizza.
 * This class should be extended by specific types of pizzas.
 */
abstract class BasePizza {
    /**
     * Method to get the price of the pizza.
     * This method should be implemented by subclasses to provide the specific price of the pizza.
     *
     * @return The price of the pizza.
     */
    public abstract int getPrice();
}
