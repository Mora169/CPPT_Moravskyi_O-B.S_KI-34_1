package KI304MoravskyLab6;


import java.util.ArrayList;

/**
 * The Center class represents a shopping center for storing and working with items (Item).
  *
  * @param <T> The type of items that can be stored in the mall.
 */
public class Center<T extends Items> {

    private ArrayList<T> array;

    /**
     * A constructor for the Center class that initializes an empty list to hold items.
     */
    public Center() {
        array = new ArrayList<T>();
    }

    /**
     * Adds an item to the shopping center and displays a message about adding the item.
     *
     * @param item The item to add to the mall.
     */
    public void putItem(T item) {
        array.add(item);
        System.out.print("Item added-> ");
        item.print();
    }

    /**
     * Gets an item from the mall by index.
     *
     * @param i The index of the item to retrieve.
     * @return The item at the specified index.
     */
    public T getItem(int i) {
        return array.get(i);
    }

    /**
     * Finds and returns the heaviest item in the mall.
     *
     * @return The heaviest item in the mall, or null if the list is empty.
     */
    public T getMax() {
        if (!array.isEmpty()) {
            T max = array.get(0);
            for (int i = 1; i < array.size(); i++) {
                if (array.get(i).compareTo(max) > 0) {
                    max = array.get(i);
                }
            }
            return max;
        }
        return null;
    }

    /**
     * Uses an item in the mall by index and calls the item's buy() method.
     *
     * @param i The index of the item to use.
     */
    public void useItem(int i) {
        array.get(i).buy();
    }
    public void get(T item) {
    	 item.print();
		// TODO Auto-generated method stub
    	//System.out.println("test2=");
	}
}

