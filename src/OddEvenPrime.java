
public class OddEvenPrime {
	
	public static void main(String[] args) {
		//set variables
		int n, i = 2;
		n = 1223;  // value for testing
		boolean flag = false;  //set to true if not prime 
		
		// check even or odd
		if (n % 2 == 0) {
			System.out.println("number is even");
		}
		else {
			System.out.println("number is odd");
		}
		
		// 
		if (n > 1) {
			
			while (i <= n/2) {
				if (n % i == 0) {
					flag = true;
					break;
				
				}
				++i;
			
			}
		}
		else {
			flag = true;
		}
		
		if (!flag)System.out.print("number is Prime.");
		

	}

}
