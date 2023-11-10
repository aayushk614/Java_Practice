package Interfaces;


class Car{

    int count;
    int c=0;

    class Maruti{
        public void display1()
        {
            System.out.println("Maruti Suzuki!!!!");
        }
    }

    public void display(){
        count=5;

        System.out.println("The value of count is:"+count);
    }

    public static void dis(){
         int k=0;
         int l = 9;




        System.out.println("The value of count is:");
    }


}


interface A{
    public void run1();

     default void g(){
        System.out.println("Default function");
    }

}


interface B{

    public void run1();
}


interface Apple{

    int a = 10;
    public void check();



}
public class Demo implements Apple{

    int a=19;

    public void check(){
        System.out.println("hello");
    }

    public static void main(String[] args) {

        Demo obj = new Demo();
        obj.check();
        System.out.println(obj.a);




//        Interfaces.A obj = new Interfaces.Demo();
//        obj.run1();
//        obj.g();

//        B obj = () -> {
//            {
//                System.out.println("Lambda implemented");
//            }
//
//        };
//
//        obj.run1();










//        List<Integer> arr = List.of(1,2,4,6,78,9);
//
//
//        Interfaces.Car obj = new Interfaces.Car();
//
//        Interfaces.Car.Maruti ob2 = obj.new Maruti();
//        ob2.display1();





//        Interfaces.Car obj = new Interfaces.Car();
//        Interfaces.Car.dis();
//        Interfaces.Car.c=8;
//        obj.display();
//        Interfaces.Car.dis();



        //arr.forEach(i -> System.out.println(i*2));

        //System.out.println(arr);


        //Stream<Integer> res = arr.stream().filter(i -> i%2==0);

        //arr.stream().filter(i -> i%2==0).forEach(n -> System.out.println(n));

        //res.forEach(n -> System.out.println(n));


//        String s1 = "Hell";
//
//        System.out.println(s1.hashCode());
//
//        String s2 = new String("Hello");
//
//        System.out.println(s2.hashCode());











    }
}
