package DesignPatterns.Decorator;

public class Mushroom extends Toppings{

    BasePizza basePizza;

    Mushroom(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    public int price(){

        System.out.println("Mushroom added");
        return basePizza.price() + 80;
    }
}
