/**
 *  This is a very simple example of looping in Java
 *
 *@author    eknapp
 */
public class Loopy {
 
    /**
     *  The main program for the Loopy class
     *
     *@param  args  The command line arguments
     */
    public static void main(String[] args) {
 
        int  x  = 1;
 
        System.out.print("Before the Loop");
 
        while (x < 4) {
            System.out.println("In the loop");
            System.out.println("Value of x is " + x);
            x = x + 1;
        }
 
        System.out.println("This is after the loop");
 
    }
 
}
