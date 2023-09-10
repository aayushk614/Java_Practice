package Bitmanipulation;

public class BitMasking {

    public static void main(String[] args) {
        int n = 17;
        int bitmask = 1;
        int last = 0;

        for(int i = 1;i<=32;i++){

            last = n&bitmask;
            if(last !=0)
            System.out.println(last);
            bitmask <<= 1;

        }


    }
}
