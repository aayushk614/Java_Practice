package Output;

import java.util.LinkedList;
import java.util.Queue;

public class call {
    int a = 60;


    public void swap1(call obj){

        obj.a += 10;
    }






    public static void main(String[] args) {

//        call obj = new call();
//
//        System.out.println("Before swap, a = "+obj.a);
//
//        obj.swap1(obj);
//
//
//        System.out.println("After swap, a = "+obj.a);

    Queue<int[]> q = new LinkedList<int[]>();

    q.add(new int[]{1,2,3});
    q.add(new int[]{15,6,7});
    q.poll();

    int[] a = q.poll();
    for(int i : a)
        System.out.println(i);











    }
}
