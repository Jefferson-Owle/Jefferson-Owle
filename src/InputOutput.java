import java.util.Scanner;

public class InputOutput{

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		System.out.print("enter a number: ");
		int number = userInput.nextInt();   // OR use a string: String number = userInput.nextLine();
		System.out.println("the number is " + number);

	}

}


