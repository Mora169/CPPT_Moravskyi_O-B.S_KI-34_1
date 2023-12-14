
package KI304MoravskyLab6;

public interface Items extends Comparable<Items>{
	    /**
	     * Get thePrice of the item.
	     * Get getName of the item.
	     * @return The Price of the item as a double value.
	     * @return The Name of the item as a double value.
	     */
	    public double getPrice();
	    public String  getName();
	    /**
	     * Perform an action Price the item.
	     */
	    public void buy();

	    /**
	     * Print information about the item.
	     */
	    public void print();
}


