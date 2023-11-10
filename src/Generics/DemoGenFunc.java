package Generics;

import java.util.ArrayList;
import java.util.List;

public class DemoGenFunc {
    public static void main(String[] args) {
//
//        print(7);
//        print("jhjh");
//        print('p');
        Character ch = 'a';
        showGeneric(ch);
        List<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(6);
        arr.add(90);

        List<Character> arr1 = new ArrayList<>();
        arr1.add('c');
        arr1.add('d');
        arr1.add('a');

        useOfWildCards(arr);
        useOfWildCards(arr1);



    }

    public static <T> void showGeneric(T obj){
        System.out.println(obj);
    }

    public static <T> void print(T toPrint){

        System.out.println(toPrint);
    }

    public static void useOfWildCards(List<?> toPrint){

        System.out.println(toPrint);

    }

    public static void useOfWildCardsOnlyNumbers(List<? extends Number> toPrint){

        System.out.println(toPrint);

    }
}
