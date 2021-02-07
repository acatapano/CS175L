//Enables the use of the console for inputs.
import java.util.Scanner;

public class houseCode {

	public static void main(String[] args) {
		
		//Establishes in as an input for data.
		Scanner in = new Scanner(System.in);
		
		int houseLength = 0;
		int houseWidth = 0;
		int houseHeight = 0;
		
		int windowNumber = 0;
		int windowLength = 0;
		int windowWidth = 0;
		
		int doorNumber = 0;
		int doorLength = 0;
		int doorWidth = 0;
		
		double costPersqft = 0;
		double sqFttopaint = 0;
		double totalCost = 0;
		
		//Prints the phrase and asks for the input of an integer to become the value of houseLength.
		System.out.println("Input the length of the house: ");
		houseLength = in.nextInt();
		System.out.println("Input the width of the house: ");
		houseWidth = in.nextInt();
		System.out.println("Input the height of the house: ");
		houseHeight = in.nextInt();
		
		System.out.println("Input the number of windows: ");
		windowNumber = in.nextInt();
		System.out.println("Input the length of each window: ");
		windowLength = in.nextInt();
		System.out.println("Input the width of each window: ");
		windowWidth = in.nextInt();
		
		System.out.println("Input the number of doors: ");
		doorNumber = in.nextInt();
		System.out.println("Input the length of each door: ");
		doorLength = in.nextInt();
		System.out.println("Input the width of each door: ");
		doorWidth = in.nextInt();
		
		System.out.println("Input the cost to paint 1 square foot: ");
		costPersqft = in.nextDouble();
		
		sqFttopaint = ((4*(houseLength*houseWidth)) + (houseLength*(houseHeight - houseWidth))) - ((windowNumber*(windowLength*windowWidth)) + (doorNumber*(doorLength*doorWidth)));
		totalCost = sqFttopaint*costPersqft;
		
		System.out.print("Total cost to paint " + sqFttopaint + " sqft: $" + totalCost);
	}

}
