/** A class to test the dog food calculation **/

public class TestDogFoodNeeds {

    public static void main(String[] args){
        // instantiate a dog object
        Dog dog = new Dog();
        
        // set the weight
        dog.setWeight(80);
        
        // call calculate method
        int unitsOfFood = dog.calculateFoodNeeded();
        
        // verify the result is correct
        if (unitsOfFood == 2) {
            System.out.println("Test was successful for a large dog");
        } else {
            System.out.println("Test failed for a large dog");
        }
    
    }
}
