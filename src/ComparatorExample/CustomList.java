package ComparatorExample;

import java.util.ArrayList;

/**
 * CustomList is a subclass of ArrayList that overrides the add method to prevent duplicate elements.
 */
public class CustomList extends ArrayList<Object> {

    /**
     * Adds an element to the list if it is not already present.
     *
     * @param element The element to be added.
     * @return true if the element was added, false otherwise.
     */
    @Override
    public boolean add(Object element) {
        if (this.contains(element)) {
            return false;
        }
        return super.add(element);
    }

    public static void main(String[] args) {
        CustomList customList = new CustomList();

        customList.add(2);
        customList.add(4);
        customList.add(2);
        customList.add(5);

        System.out.println(customList);
    }
}
