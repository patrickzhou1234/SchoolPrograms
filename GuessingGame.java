public class GuessingGame {
    private int hiddennumber; // variable declaration
    private boolean gameOver = false; // variable declaration
    public GuessingGame() {
        hiddennumber = 0; // initialize variable in case of default constructor.
    }
    public void startgame() { // method to start game
        hiddennumber = (int) (1+10*Math.random()); // initialization of random number
    }
    public void guess(int guess) { // guess method
        if (guess == hiddennumber) { // checking if the guess is correct
            System.out.print("You got it!"); // message if condition is true
            gameOver = true; // end game
        } else if (guess > hiddennumber) { // checking if hiddennumber is greater than guess
            System.out.print("Sorry, thats was too high!"); // message if condition is true
        } else { // else means that hiddennumber has to be less than guess
            System.out.print("Sorry, that was too low!"); // message if condition is true
        }
        System.out.print("\n"); // newline
    }
    public boolean gameState() { // accessor method
        return gameOver; // bool gameover
    }
}