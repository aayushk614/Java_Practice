package MultiThreading;

public class ToPrint extends Thread{

    public int threadNum;

    ToPrint(int n){
        threadNum = n;
    }

    @Override
    public void run(){
        for(int i=1;i<=5;i++)
            System.out.println(i + " is printed by thread "+threadNum);

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
