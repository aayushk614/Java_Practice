package Bitmanipulation;

public class Count1 {

    public static void main(String[] args) {
        int i = 85;
        int n = i;
        int last = 0;
        int c = 0;

        while(i != 0){

            last = i&1;
            if(last == 1) c++;

            i = i>>1;
        }

        System.out.println("The number of 1 bits in " + n + " is = " + c);
    }
}
