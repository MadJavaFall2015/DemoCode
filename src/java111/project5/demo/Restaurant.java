package java111.project5.demo;

/** A class representing a restaurant 
 * @author Paula Waite
 */
 
 public class Restaurant {
    private String name;
    private String type;
    public static int count;

	

    /** No-arg constructor for Restaurant **/
  public Restaurant() {
        count++;
    }
    
    /** Creates a restaurant object and sets the name and type
     *  @param name Restaurant name
     *  @param type Restaurant type
     */
    public Restaurant(String name, String type) {
        //this();
        this.name = name;
        this.type = type;
        
    
    }
    
    /**

	 * Returns the value of count.

	 */

	public static int getCount() {

		return count;

	}

	
    /**

	 * Returns the value of name.

	 */

	public String getName() {

		return name;

	}





	/**

	 * Sets the value of name.

	 * @param name The value to assign name.

	 */

	public void setName(String name) {

		this.name = name;

	}





	/**

	 * Returns the value of type.

	 */

	public String getType() {

		return type;

	}





	/**

	 * Sets the value of type.

	 * @param type The value to assign type.

	 */

	public void setType(String type) {

		this.type = type;

	}


  
	/** Display the restaurant details */
    public void serveFood() {
        System.out.println("Serving food from " + name + " is a " + type + " restaurant");
    }
    
    /** Overriding the toString method
     *  @returns the restaurant details
     */
    public String toString() {
        
        return super.toString() + "Serving food from " + name + " is a " + type + " restaurant. The count is now " + count;
        
    }
 
 }
