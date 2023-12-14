package KI304MoravskyLab6;

/**
* The main application class that demonstrates the use of the ShoppingCenter class
 * for storing and working with items (Item) in the shopping center.
 */
public class app {

	/**
     * The main method of the application, which demonstrates the use of the ShoppingCenter class
     * and work with objects.
     *
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
    	// Create an instance of the ShoppingCenter class with the ability to store items of the Items type
        Center<? super Items> test0 = new Center<>();
     // Adding various items to the mall
        test0.putItem(new bookshop("Володар перснів", 100.25));
        test0.putItem(new bookshop("Гаррі Поттер і келих вогню", 1.98));
        test0.putItem(new appleshop("Адамс Пармен", 58));
        test0.putItem(new appleshop("Кальвіль Адерслебенський", 10.47));
     // Get the item by index and call the print and buy methods
        Items item = test0.getItem(2);
        item.print();
        item = test0.getItem(1);
        item.print();
        item.buy();
     // Get the best item and display information about it
        Items max = test0.getMax();
        System.out.println("\nThe price item in the bedside table is:");
        max.print();
    }
}

