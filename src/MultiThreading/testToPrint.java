package MultiThreading;

public class testToPrint {


    public static void main(String[] args) {


//        for(int i=1;i<=5;i++) {
//            //ToPrint thread1 = new ToPrint(i);
//            Thread thread2 = new Thread(new ToPrint1(i));
//
//            thread2.start();
//        }
//        //thread2.start();

        for(int i =1;i<=5;i++) {
            ToPrint thread1 = new ToPrint(i);
            thread1.start();



        }




    }





}
