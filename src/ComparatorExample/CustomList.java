package ComparatorExample;

import java.util.ArrayList;

public class CustomList extends ArrayList {

    @Override
    public boolean add(Object o) {

        if(this.contains(o))
            return true;

        return super.add(o);
    }

    public static void main(String[] args) {

        CustomList list = new CustomList();

        list.add(2);
        list.add(4);
        list.add(2);
        list.add(5);

        System.out.println(list);









    }
}


