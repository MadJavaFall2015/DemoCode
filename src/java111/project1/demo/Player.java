/**
 *  This is the Player class. We will have one of these for each player in the
 *  game.
 *
 *@author    eknapp
 */
public class Player {
    int  number  = 0;
 
 
    /**
     *  This method is called when a player guesses a number
     */
    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing " + number);
    }
 
}
