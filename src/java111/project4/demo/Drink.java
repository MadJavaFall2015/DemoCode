public class Drink extends MenuItem {
    private boolean alcoholic;
    private String size;

	/**

	 * Returns the value of alcoholic.

	 */

	public boolean getAlcoholic() {

		return alcoholic;

	}

	/**

	 * Sets the value of alcoholic.

	 * @param alcoholic The value to assign alcoholic.

	 */

	public void setAlcoholic(boolean alcoholic) {

		this.alcoholic = alcoholic;

	}





	/**

	 * Returns the value of size.

	 */

	public String getSize() {

		return size;

	}





	/**

	 * Sets the value of size.

	 * @param size The value to assign size.

	 */

	public void setSize(String size) {

		this.size = size;

	}

	
	
	/** Overriding the toString method
     *  @returns the drink details
     */
    public String toString() {
        String alcoholicOrNonAlcoholic = "non-alcoholic";
        if (alcoholic) {
           alcoholicOrNonAlcoholic = "alcoholic"; 
        }
        return super.toString() + ". This is a " + size + " " + alcoholicOrNonAlcoholic + " drink";
        
    }


	
    
}
