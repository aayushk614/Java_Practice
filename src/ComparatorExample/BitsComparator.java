package ComparatorExample;

import java.util.Comparator;

public class BitsComparator implements Comparator<Integer> {

    public int countBits(int n){

        int c = 0;
        while(n >0){

            n = n & (n-1);
            c++;
        }

        return c;
    }

        @Override
        public int compare(Integer o1, Integer o2) {

            if(countBits(o1) == countBits(o2))
                return o1 - o2;

            else
                return countBits(o1) - countBits(o2);

        }


}
