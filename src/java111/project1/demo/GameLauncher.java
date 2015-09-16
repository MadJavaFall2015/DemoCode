/**
 *  This is the test drive class for the Guessing Game
 *
 *@author    eknapp
 */
public class GameLauncher {
 
    /**
     *  The main program for the GameLauncher class
     *
     *@param  args  The command line arguments
     */
    public static void main(String[] args) {
        //Create an object of the GuessGame class
        GuessGame  game  = new GuessGame();
         
        //Start the game!
        game.startGame();
    }
 
}
