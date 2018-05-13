package lab2;
// Import Scanner class
import java.util.Scanner; // import class Scanner for input

public class CircleMath {

	public static void main(String[] args) {
		// create a Scanner to obtain input from the command window
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter the Radius: "); // prompt
		int radius = input.nextInt(); // read radius from user
		
		// output diameter as decimal, then circumference and area as floats
		System.out.printf("%s%d%n%s%f%n%s%f%n", "diameter = ", radius * 2, "circumference = ", 2 * Math.PI * radius, "area = ", Math.PI * Math.pow(radius, 2));
		
		input.close(); // close resource

	}

}
