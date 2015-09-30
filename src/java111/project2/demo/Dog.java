/**
 *  This Dog class shows different behavior depending on size.
 *
 *@author    eknapp
 */
public class Dog {
 
    int     size;
 
    String  name;
 
 
    /**
     *  This method is the code for the bark action
     */
    void bark() {
 
        if (size > 60) {
            System.out.println("Wooof! Woooof!");
        } else if (size > 14) {
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Yip! Yip!");
        }
    }
 
}
  
