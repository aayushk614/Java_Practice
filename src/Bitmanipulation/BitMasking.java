package Bitmanipulation;

/**
 * This class demonstrates bit masking operations.
 */
public class BitMasking {

    public static void main(String[] args) {
        int number = 17;
        int bitmask = 1;
        int lastBit = 0;

        // Iterate through each bit position
        for (int i = 1; i <= 32; i++) {
            lastBit = number & bitmask;
            if (lastBit != 0) {
                System.out.println(lastBit);
            }
            bitmask <<= 1;
        }
    }
}
