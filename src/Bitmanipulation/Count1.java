package Bitmanipulation;

/**
 * This class counts the number of 1 bits in a given integer.
 */
public class Count1 {

    public static void main(String[] args) {
        int number = 85;
        int originalNumber = number;
        int lastBit = 0;
        int count = 0;

        // Iterate through each bit of the number
        while (number != 0) {
            lastBit = number & 1;
            if (lastBit == 1) count++;
            number = number >> 1;
        }

        System.out.println("The number of 1 bits in " + originalNumber + " is = " + count);
    }
}
