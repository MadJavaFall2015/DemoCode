package java111.project5.demo;

/** A class representing a menu item 
 * @author Paula Waite
 */
 
 public abstract class MenuItem {
    private String name;
    private String description;

    public abstract void prepare();
	
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

	 * Returns the value of description.

	 */

	public String getDescription() {

		return description;

	}

	/**

	 * Sets the value of description.

	 * @param description The value to assign description.

	 */

	public void setDescription(String description) {

		this.description = description;

	}
  
    /** Overriding the toString method
     *  @returns the menu item details
     */
    public String toString() {
        
        return name + " : " + description + System.lineSeparator();
        
    }
 
 }
