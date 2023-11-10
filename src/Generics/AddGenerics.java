package Generics;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class AddGenerics <T> {

    T num1;
    T num2;

    AddGenerics(T a, T b) {
        num1 = a;
        num2 = b;
    }

    public T add() {

        if (num2 instanceof Integer && num1 instanceof Integer) {
            return (T) (Integer) (((Integer) num2).intValue() + ((Integer) num1).intValue());

        }
        return null;
    }


    public static void main(String[] args) {

        AddGenerics<Integer> ob1 = new AddGenerics<>(3,5);
        Integer s = ob1.add();
        System.out.println("The sum is : " + s);

        List<Integer> arr = List.of(24,63,1,53,6);

        Integer[] intArr = {1, 5, 3, 2, 4};

        Integer res = descending(intArr);
        System.out.println(res);



    }

    public static <T extends Comparable<T>> T findLargest(T[] obj){

        Arrays.sort(obj);

        return obj[obj.length - 1];

    }


    public static <T extends Comparable<T>> T descending(T[] obj){

        Arrays.sort(obj);
        return obj[obj.length-1];

    }
}
