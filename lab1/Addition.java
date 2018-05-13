<<<<<<< HEAD
package lab1;

// Fig. 2.7: Addition.java
// Addition program that inputs two numbers then displays their sum.
import java.util.Scanner; //program uses class Scanner
public class Addition {

	public static void main(String[] args) {
		// create a Scanner to obtain input from the command window
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first integer: "); // prompt
		int number1 = input.nextInt(); // read first number from user
		
		System.out.print("Enter second integer: "); // prompt
		int number2 = input.nextInt(); // read second number from user
		
		int sum = number1 + number2; // add numbers, then store total in sum
		
		System.out.printf("Sum is %d%n", sum); // display sum		
		
		input.close(); // resource cleanup

	} // end method main

} // end class Addition
=======
package lab1;

// Fig. 2.7: Addition.java
// Addition program that inputs two numbers then displays their sum.
import java.util.Scanner; //program uses class Scanner
public class Addition {

	public static void main(String[] args) {
		// create a Scanner to obtain input from the command window
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first integer: "); // prompt
		int number1 = input.nextInt(); // read first number from user
		
		System.out.print("Enter second integer: "); // prompt
		int number2 = input.nextInt(); // read second number from user
		
		int sum = number1 + number2; // add numbers, then store total in sum
		
		System.out.printf("Sum is %d%n", sum); // display sum		
		
		input.close(); // resource cleanup

	} // end method main

} // end class Addition
>>>>>>> 6bb1f4c330632809cb8d2fd272330bf90bc46547
