import java.util.Scanner;
public class ReadInputLine {
	private static Scanner keyboard;

	public static void main(String[] args) {
		keyboard = new Scanner(System.in);
        String inputNumber = keyboard.next();
        System.out.println(inputNumber);
	}
}
