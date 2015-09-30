/** A class representing a restaurant 
 * @author Paula Waite
 */
 
 public class Restaurant {
    private String name;
    private String type;
	
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
 
 }
