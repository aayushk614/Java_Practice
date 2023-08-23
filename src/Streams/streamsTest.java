package Streams;

import java.util.List;

public class streamsTest {
    public static void main(String[] args) {

        List<Integer> arr1 = List.of(1,2,4,5,6,7,8);

        System.out.println("Printing only even no using streams");
        arr1.stream().filter(i -> i%2 == 0).forEach(i -> System.out.println(i));







        //arr.forEach(i -> System.out.println(i*2));

        //System.out.println(arr);


        //Stream<Integer> res = arr.stream().filter(i -> i%2==0);

        //arr.stream().filter(i -> i%2==0).forEach(n -> System.out.println(n));

        //res.forEach(n -> System.out.println(n));

        
    }
}