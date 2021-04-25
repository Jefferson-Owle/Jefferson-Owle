import java.util.Scanner;

public class Addition {

	static int addTwoNumbers(int x, int y){
	     return x + y;
	}
	
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Number of operations? ");
		int t = userInput.nextInt();
		
		
		for(int i=1; i<=t; i++){
			System.out.print("enter first number: ");
			int num1 = userInput.nextInt();
			System.out.print("enter second number: ");
			int num2 = userInput.nextInt();
			
			System.out.println("the sum is " + addTwoNumbers(num1, num2));
		
		 }
		
	}

}
