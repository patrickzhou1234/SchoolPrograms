import java.util.Scanner;

public class GameTesterClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // initialize scanner
        GuessingGame newgame = new GuessingGame(); // declare a new game
        newgame.startgame(); // start the game
        System.out.println("The game has started!"); // start message
        while(!newgame.gameState()) { // check if game is still running
            System.out.print("Please input your guess: "); // prompt for guess
            newgame.guess(in.nextInt()); // call upon guess method from other class
        }
        in.close(); // closing the scanner for good measure
    }
}