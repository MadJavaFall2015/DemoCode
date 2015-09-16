/**
 *  The Basic Math Test Drive class.
 *
 *@author    eknapp
 */
public class BasicMathTestDrive {

    /**
     *  The main program for the BasicMathTestDrive class.
     *
     *@param  args  The command line arguments
     */
    public static void main(String[] args) {

        BasicMath  one  = new BasicMath();
        
        System.out.println();
        System.out.println("Integer calculations:");

        one.integerAddition();
        one.integerSubtraction();
        one.integerMultiplication();
        one.integerDivisionWrong();
        one.integerDivisionRight();
        
        System.out.println();
        System.out.println("Floating Point calculations:");

        one.doubleAddition();
        one.doubleSubtraction();
        one.doubleMultiplication();
        one.doubleDivision();
        
        System.out.println();
        
    }

}


