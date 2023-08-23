package MultiThreading;

public class PrintOddEven {

    int counter = 1;
    static int n;

    public void printOdd(){

        synchronized (this){

            while (counter < n){

                while(counter % 2 == 0) {

                    try {
                        wait();
                    }

                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(counter + " ");
                    counter++;
                    notify();
                }

            }


        }


    }


    public void printEven(){

        synchronized (this){
            while(counter < n){

                while (counter % 2 == 1){

                    try {
                        wait();
                    }
                    catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }

                System.out.println(counter + " ");
                counter++;
                notify();


            }
        }

    }





    public static void main(String[] args) {

        //initialize n
        n=10;

        PrintOddEven obj = new PrintOddEven();

        Thread t1 = new Thread(new Runnable() {

            public void run() {
                obj.printEven();
            }
        });

        Thread t2 = new Thread(new Runnable() {

            public void run() {
                obj.printOdd();
            }
        });

        t1.start();
        t2.start();


    }
}
