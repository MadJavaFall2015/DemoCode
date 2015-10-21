/**
 *  This class holds information about an individual dog
 *
 * @author    eknapp
 */
public class Dog {
 
    private  String  name;
    private  String  owner;
    private  int     weight;
 
 
    /**
     *  Sets the name attribute of the Dog object
     *
     * @param  name  The new name value
     */
    public void setName(String name) {
        this.name = name;
    }
 
 
    /**
     *  Gets the name attribute of the Dog object
     *
     * @return    The name value
     */
    public String getName() {
        return name;
    }
 
 
    /**
     *  Sets the owner attribute of the Dog object
     *
     * @param  owner  The new owner value
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }
 
 
    /**
     *  Gets the owner attribute of the Dog object
     *
     * @return    The owner value
     */
    public String getOwner() {
        return owner;
    }
 
 
    /**
     *  Sets the weight attribute of the Dog object
     *
     * @param  weight  The new weight value
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }
 
 
    /**
     *  Gets the weight attribute of the Dog object
     *
     * @return    The weight value
     */
    public int getWeight() {
        return weight;
    }
 
 
    /**
     *  Description of the Method
     *
     * @return    Description of the Return Value
     */
    public int calculateFoodNeeded() {
        if (weight <= 50) {
            return 1;
        } else {
            return 2;
        }
    }
 
 
    /**
     *  Description of the Method
     *
     * @return    Description of the Return Value
     */
    public String display() {
        return "Name: " + getName()
                 + "\nOwner: " + getOwner()
                 + "\nWeight: " + getWeight()
                 + "\nFood Needed: " + calculateFoodNeeded();
    }
 
}
