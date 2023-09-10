package Output;

public class call {
    int a = 60;


    public void swap1(call obj){

        obj.a += 10;
    }






    public static void main(String[] args) {

        call obj = new call();

        System.out.println("Before swap, a = "+obj.a);

        obj.swap1(obj);


        System.out.println("After swap, a = "+obj.a);

    }
}
