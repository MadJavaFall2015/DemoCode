/**
 *  Array of Strings Demo
 *
 *@author    pwaite
 */
public class ArrayDemo1 {

    /**
     *  The main method for the Array of Strings Demo.
     *  This method will create a String Array, 
     *  add Strings to the Array and then display them
     *
     *@param  args  The command line arguments
     */
    public static void main(String[] args) {
     
        String[] stringArray = new String[4];
        stringArray[0] = "stuff";
        stringArray[1] = "stuff1";
        stringArray[2] = "stuff2";
        stringArray[3] = "stuff3";
        
        int counter = 0;
        while (counter < 4) {
            System.out.println(stringArray[counter]);
            counter++;
        }
        
        
        
    }

}
