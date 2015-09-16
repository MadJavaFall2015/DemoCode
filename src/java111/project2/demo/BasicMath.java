/**
 *  This BasicMath class shows basic math operations.
 *
 *@author    eknapp
 */
public class BasicMath {

    /**
     *  Demo of integer addition
     */
    public void integerAddition() {

        int  x  = 5;
        int  y  = 7;

        int  z  = x + y;

        System.out.println(x + " plus " + y + " equals " + z);
    }


    /**
     *  Demo of integer subtraction
     */
    public void integerSubtraction() {

        int  x  = 5;
        int  y  = 7;

        int  z  = y - x;

        System.out.println(y + " minus " + x + " equals " + z);
    }


    /**
     *  Demo of integer multiplication
     */
    public void integerMultiplication() {

        int  x  = 5;
        int  y  = 7;

        int  z  = y * x;

        System.out.println(y + " times " + x + " equals " + z);
    }


    /**
     *  Demo of integer division the wrong way
     */
    public void integerDivisionWrong() {

        int     x  = 5;
        int     y  = 7;

        double  z  = y / x;

        System.out.println(y + " divided by " + x + " equals " + z + " (eh?)");
    }


    /**
     *  Demo of integer division the right way
     */
    public void integerDivisionRight() {

        int     x  = 5;
        int     y  = 7;

        double  z  = (double) y / x;

        System.out.println(y + " divided by " + x + " equals " + z + " (that's better)");
    }


    /**
     *  Demo of floating point addition
     */
    public void doubleAddition() {

        double  x  = 5.5;
        double  y  = 7.2;

        double  z  = x + y;

        System.out.println(x + " plus " + y + " equals " + z);
    }


    /**
     *  Demo of floating point subtraction
     */
    public void doubleSubtraction() {

        double  x  = 5.0;
        double  y  = 7.0;

        double  z  = y - x;

        System.out.println(y + " minus " + x + " equals " + z);
    }


    /**
     *  Demo of floating point multiplication
     */
    public void doubleMultiplication() {

        double  x  = 5.2;
        double  y  = 7.9;

        double  z  = y * x;

        System.out.println(y + " times " + x + " equals " + z);
    }
    
    /**
     *  Demo of double division
     */
    public void doubleDivision() {

        double     x  = 5;
        double     y  = 7.2;

        double  z  = y / x;

        System.out.println(y + " divided by " + x + " equals " + z + " (no problem here)");
    }

}


