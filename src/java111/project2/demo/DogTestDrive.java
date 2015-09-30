/**
 *  The Dog Test Drive class. We will make 3 objects of different sizes.
 *
 *@author    eknapp
 */
public class DogTestDrive {
 
    /**
     *  The main program for the DogTestDrive class. Why do we need a main
     *  method?
     *
     *@param  args  The command line arguments
     */
    public static void main(String[] args) {
 
        Dog  one    = new Dog();
        one.size = 70;
 
        Dog  two    = new Dog();
        two.size = 8;
 
        Dog  three  = new Dog();
        three.size = 35;
 
        one.bark();
        two.bark();
        three.bark();
 
    }
 
}
  
