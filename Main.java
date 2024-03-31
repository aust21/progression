import java.util.Scanner;


public class Main {
	public static void main(String[] args) {

		String typeOfProgression = inputReader();
		Progression prog;
		switch (typeOfProgression) {
			case "arithmetic":
				prog = new ArithmeticProgression(2, 1);
				prog.printProgression(10);
				break;
			case "fibonacci":
				prog = new FibonacciProgression(0, 1);
				prog.printProgression(10);
				break;
			case "geometric":
				prog = new GeometricProgression(0, 1);
				prog.printProgression(10);
				break;
			default:
				System.out.println("Please choose arithmetic, fibonacci or geometric");
		}
		
	}

	public static String inputReader() {
		Scanner input = new Scanner(System.in);
		System.out.print("Which progression do you want to see? ");
		String inputText = input.nextLine();
		return inputText;
	}
}