/**
 *  This class demonstrates passing objects as values
 *
 *@author    eknapp
 */
public class DemoOfPassObjectByValue {
 
    Dog  dogOne  = new Dog();
 
 
    /**
     *  Demo method
     *
     *@param  z  Description of the Parameter
     */
    void go(Dog dogTwo) {
 
        System.out.println("value of dogOne: " + dogOne.size);
        System.out.println("value of dogTwo: " + dogTwo.size);
 
        dogTwo.size = 10;
 
        System.out.println("value of dogOne: " + dogOne.size);
        System.out.println("value of dogTwo: " + dogTwo.size);
 
    }
 
 
    /**
     *  Main processing method for the DemoOfPassObjectByValue object
     */
    void run() {
        dogOne.size = 20;
        go(dogOne);
    }
}
  
