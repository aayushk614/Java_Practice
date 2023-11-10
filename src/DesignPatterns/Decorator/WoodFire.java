package DesignPatterns.Decorator;

public class WoodFire extends BasePizza{

    public int price(){

        System.out.println("Woodfire pizza is used");
        return 200;
    }
}

