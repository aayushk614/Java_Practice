package DesignPatterns.Decorator;

public class DoubleCheese extends Toppings{

    BasePizza basePizza;

    DoubleCheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    public int price(){
        System.out.println("Double cheese added");
        return basePizza.price() + 150;
    }

}
