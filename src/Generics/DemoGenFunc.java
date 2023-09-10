package Generics;

import java.util.ArrayList;
import java.util.List;

public class DemoGenFunc {
    public static void main(String[] args) {
//
//        print(7);
//        print("jhjh");
//        print('p');

        List<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(6);
        arr.add(90);

        useofWildCards(arr);
    }


    public static <T> void print(T toPrint){

        System.out.println(toPrint);
    }

    public static void useofWildCards(List<?> toPrint){

        System.out.println(toPrint);



    }
}
