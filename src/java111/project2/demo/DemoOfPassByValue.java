/**
 *  This class demonstrates pass values
 *
 *@author    eknapp
 */
public class DemoOfPassByValue {
 
    int  numberInstanceVariable  = 7;
 
 
    /**
     *  Demo method
     *
     *@param  z  Description of the Parameter
     */
    void go(int numberLocalVariable) {
 
        System.out.println("numberInstanceVariable: "
                + numberInstanceVariable);
        System.out.println("numberLocalVariable: "
                + numberLocalVariable);
 
        numberLocalVariable = 10;
 
        System.out.println("numberInstanceVariable: "
                + numberInstanceVariable);
        System.out.println("numberLocalVariable: "
                + numberLocalVariable);
 
    }
 
 
    /**
     *  Main processing method for the DemoOfPassByValue object
     */
    void run() {
        go(numberInstanceVariable);
    }
}
  
