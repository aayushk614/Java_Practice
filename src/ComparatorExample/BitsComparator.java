package ComparatorExample;

import java.util.Comparator;

/**
 * This class provides a comparator for comparing integers based on the number of 1 bits in their binary representation.
 */
public class BitsComparator implements Comparator<Integer> {

    /**
     * This method counts the number of 1 bits in the binary representation of a given integer.
     *
     * @param number The integer whose 1 bits are to be counted.
     * @return The number of 1 bits in the binary representation of the given integer.
     */
    public int countBits(int number) {
        int count = 0;
        while (number > 0) {
            number = number & (number - 1);
            count++;
        }
        return count;
    }

    /**
     * This method compares two integers based on the number of 1 bits in their binary representation.
     * If the number of 1 bits is the same, it compares the integers based on their natural order.
     *
     * @param integer1 The first integer to be compared.
     * @param integer2 The second integer to be compared.
     * @return A negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second.
     */
    @Override
    public int compare(Integer integer1, Integer integer2) {
        int countBits1 = countBits(integer1);
        int countBits2 = countBits(integer2);

        if (countBits1 == countBits2) {
            return integer1 - integer2;
        } else {
            return countBits1 - countBits2;
        }
    }
}
