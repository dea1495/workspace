import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

public class RandomNumbers {

	/**
	 * 
	 */
	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);
		int numGuesses = 0;
		int randomNumber = new Random().nextInt(10) + 1;
		out.println("Enter a number between 1 and 10");
		
        int inputNumber = Keyboard.nextInt();
        numGuesses++;
        while (randomNumber != inputNumber) {
        	out.println();
        	out.println("Try Again");
        	out.println("Enter a number between 1 and 10");
        	inputNumber = Keyboard.nextInt();
        	numGuesses++;
        }
        out.println("Finally - took you " + numGuesses + "goes!");
        for (int count = 1; count <= numGuesses; count++) {
        	out.println("Loser");
        }		
	}

}
