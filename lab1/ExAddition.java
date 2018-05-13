<<<<<<< HEAD
package lab1;

import java.util.Scanner;
public class ExAddition {

	public static void main(String[] args) {
		// declare local variables
		int number1 = 0, number2 = 0;
		Scanner input = new Scanner (System.in);
		
		// perform input
		System.out.print("Enter integer #1: ");
		number1 = input.nextInt ();
		System.out.print ("Enter integer #2: ");
		number2 = input.nextInt ();
		
		// perform processing
		int sum = number1 + number2;
		
		// perform output
		System.out.printf ("Sum is %d%n", sum);	
		
		input.close();

	}  // end method main

}  // end class Addition
=======
package lab1;

import java.util.Scanner;
public class ExAddition {

	public static void main(String[] args) {
		// declare local variables
		int number1 = 0, number2 = 0;
		Scanner input = new Scanner (System.in);
		
		// perform input
		System.out.print("Enter integer #1: ");
		number1 = input.nextInt ();
		System.out.print ("Enter integer #2: ");
		number2 = input.nextInt ();
		
		// perform processing
		int sum = number1 + number2;
		
		// perform output
		System.out.printf ("Sum is %d%n", sum);	
		
		input.close();

	}  // end method main

}  // end class Addition
>>>>>>> 6bb1f4c330632809cb8d2fd272330bf90bc46547
