import java.util.*;

/** A class representing an order 
 * @author Paula Waite
 */
 
 public class Order {
    private String customerName;
    private ArrayList<MenuItem> items = new ArrayList<MenuItem>();
   


	/**

	 * Returns the value of CustomerName.

	 */

	public String getCustomerName() {

		return customerName;

	}





	/**

	 * Sets the value of CustomerName.

	 * @param customerName The value to assign CustomerName.

	 */

	public void setCustomerName(String customerName) {

		this.customerName = customerName;

	}


	public void addMenuItem(MenuItem item) {
	    items.add(item);
	}

	
    /** Overriding the toString method
     *  @returns the order details
     */
    public String toString() {
        String orderString = "";
        for (MenuItem item : items) {
            orderString += item;
        }
        return customerName + " ordered: " + orderString; 
        
    }
 
 }
