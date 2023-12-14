package KI304MoravskyLab6;

/**
 * The `bookshop` class represents an item of type Item with a specified name and price.
 */
public class bookshop implements Items {
    private String name;
    private double price;
;
/**
 * Constructor of the `bookshop` class, which initializes the name and price of the item.
 *
 * @param n The name of the item.
 * @param p The price of the item.
 */
    public bookshop(String n, double p) {
        this.name = n;
        this.price = p;
    }

    /**
     * Compares this item to another item. This implementation always returns 0 because the comparison by price is undefined.
     *
     * @param Another object to compare.
     * @return The result of the comparison (always 0).
     */
    @Override
    public int compareTo(Items o) {
        return 0;
    }
    /**
     * Gets the price of this item.
     *
     * @return The price of the item.
     */
    @Override
    public double getPrice() {
        return price;
    }

    /**
     * Performs a purchase action for this item and displays a message about the item's price.
     */
    @Override
    public void buy() {
    	 System.out.println("you bought: " + name + price+"$");
    }

    /**
     * Displays information about this item, including name and price.
     */
    @Override
    public void print() {
    	System.out.println("name = '"+name+ "' price = "+price+"$");
    }
	@Override
	public String  getName () {
		  return name;
	}
}


