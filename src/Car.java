
public class Car {
	//Describe movement
	public void move(int distance) {
		if (distance > 0) { 
			System.out.println("Moving");	
		}
		else if (distance < 0) {
			System.out.println("Reversing");
		}
		else {
			System.out.println("Parked");
		}
	} 

	public static void main(String[] args) {
		// Input distance
		int distance = -9;
		Car kia = new Car();
		kia.move(distance);

	}

}
