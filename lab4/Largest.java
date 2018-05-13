package lab4;

import java.util.Scanner;

public class Largest {
	
	public static void main(String[] args) {
		// Initialize Variables
		int counter = 0;
		Scanner input = new Scanner(System.in);
		int largest = 0;
		
		while (counter<10) { // while < 10 because we are starting at 0
			System.out.print("Enter number greater than 0: "); // prompt
			int number = input.nextInt(); // read input
			
			if (number > largest) { // compare to see if new number is the largest entered
				largest = number; // assign new input as largest number		
			}
			
			counter = counter + 1; // counter creates iterative loop
		
		}
		System.out.printf("Largest number is: %d", largest); // print result of if then comparison
		
		input.close(); // resource cleanup

	} // end main method

} // end class Largest
