import java.util.*;
 
/**
 *  This is the Kennel class which holds Dog 
 *  objects and calculates the food
 *  needs of the Kennel for a week.
 *
 * @author    eknapp
 */
public class Kennel {
 
    private  InputHelper  input;
    private  java.util.ArrayList<Dog>    dogs;
    private  int          totalFoodForWeek;
 
 
    /**
     *  Main processing method for the Kennel object
     */
    public void run() {
        dogDataEntry();
        displayDogs();
        calculateTotalFoodWeight();
        displayTotals();
    }
 
 
    /**
     *  Get the dogs
     */
    public void dogDataEntry() {
 
        dogs = new java.util.ArrayList<Dog>();
        input = new InputHelper();
 
        String  name          = "";
        String  owner         = "";
        String  weightString  = "";
        String  more          = "";
        int     weight        = 0;
        Dog     newDog        = null;
 
        while (true) {
            name = input.getUserInput(
                    "Enter the name of the dog");
            owner = input.getUserInput(
                    "Enter the name of the owner");
            weightString = input.getUserInput(
                    "Enter the weight of the dog");
            weight = Integer.parseInt(weightString);
            newDog = new Dog();
            newDog.setName(name);
            newDog.setOwner(owner);
            newDog.setWeight(weight);
            dogs.add(newDog);
            more = input.getUserInput(
                    "Would you like to enter another?");
            if (!more.equals("y")) {
                break;
            }
        }
    }
 
 
    /**
     *  Display the dogs to the terminal window.
     */
    public void displayDogs() {
 
        Dog  dog  = null;
        for (int i = 0; i < dogs.size(); i++) {
            dog =  dogs.get(i);
            System.out.println(dog.display());
            System.out.println();
        }
    }
 
 
    /**
     *  Calculate the total Food by Weight
     */
    public void calculateTotalFoodWeight() {
       
       // for (int i = 0; i < dogs.size(); i++) {
        for (Dog dog : dogs) {
            totalFoodForWeek += dog.calculateFoodNeeded() * 7;
        }
    }
 
 
    /**
     *  Display the totals
     */
    public void displayTotals() {
 
        System.out.println("Total Food Needed for the Week: "
                 + totalFoodForWeek + " pounds");
 
    }
}
