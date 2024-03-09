import java.util.Scanner;


public class Main {
	public static void main(String[] args) {

		String typeOfProgression = inputReader();
		Progression prog;
		prog = new FibonacciProgression(0, 1);
		prog.printProgression(10);
	}

	public static String inputReader() {
		Scanner input = new Scanner(System.in);
		System.out.print("Which progression do you want to see? ");
		String inputText = input.nextLine();
		return inputText;
	}
}