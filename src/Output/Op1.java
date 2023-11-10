package Output;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class Op1 {
    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(48);

        int arr[] = {1,2,324,5,65};


        List<Integer> a = List.of(1,2,4,4,132,12,1);
        int p[] = findarr();


        Stream<Integer> k = a.stream();
        List<String> s1 = List.of("ram", "ramesh", "dell", "apple");

        s1.stream().filter(si -> si.length()%2==0).forEach(System.out::println);

        //k.forEach(i -> System.out.println(i));
        //k.filter(ai -> ai%2==0).forEach(i -> System.out.println(i));

    }

    static int[] findarr(){

        return new int[]{2,4,2,1};
    }
}
