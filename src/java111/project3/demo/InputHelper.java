import java.io.*;
 
/**
 *  This is the helper class for project 3.
 *
 *@author    eknapp
 */
public class    InputHelper {
 
    /**
     *  Gets the userInput attribute 
     *  of the InputHelper object
     *
     *@param  prompt  The prompt seen by the user
     *@return         The userInput value
     */
    public String getUserInput(String prompt) {
        String  inputLine  = null;
        System.out.print(prompt + "  ");
        try {
            BufferedReader  is = 
                    new BufferedReader(
                    new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) {
                return null;
            }
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
         
        return inputLine.toLowerCase();
    }
}
