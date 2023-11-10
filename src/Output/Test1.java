package Output;

class NumberWrapper {
    static int value;
    int k;

    NumberWrapper(int value) {
        this.k = value;
    }

    void increment() {

        value += 5;
    }

    static void find(){


        value = 10;



    }

}

public class Test1 {
    public static void main(String[] args) {
        NumberWrapper ob1 = new NumberWrapper(10);
        ob1.increment();



        System.out.println(NumberWrapper.value);


        NumberWrapper ob2 = new NumberWrapper(10);
        ob2.increment();

        System.out.println(NumberWrapper.value);


        //System.out.println("Outside function: " + number.value);
    }
}