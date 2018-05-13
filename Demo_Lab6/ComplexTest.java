<<<<<<< HEAD
// File: ComplexTest.java - the test driver for Complex objects
// Author: Mike Qualls

package Demo_Lab6;

public class ComplexTest {

	public static void main(String[] args) {
		// declare object references
		Complex result, left, right;
		
		// create the objects
		left = new Complex (10, 25);
		right = new Complex (15, 4);
		
		// add them
		result = left.add (right);
		
		// display the sum using 'print' first then 'toString'
		System.out.printf ("The result of addition using print: ");
		result.print ();
		System.out.printf ("The result of addition using toString: %s\n", result);

		// now do subtraction
		result = left.subtract (right);
		
		// display the sum using 'print' first then 'toString'
		System.out.printf ("The result of subtraction using print: ");
		result.print ();
		System.out.printf ("The result of subtraction using toString: %s\n", result);
		
	}  // end method main

}
=======
// File: ComplexTest.java - the test driver for Complex objects
// Author: Mike Qualls

package Demo_Lab6;

public class ComplexTest {

	public static void main(String[] args) {
		// declare object references
		Complex result, left, right;
		
		// create the objects
		left = new Complex (10, 25);
		right = new Complex (15, 4);
		
		// add them
		result = left.add (right);
		
		// display the sum using 'print' first then 'toString'
		System.out.printf ("The result of addition using print: ");
		result.print ();
		System.out.printf ("The result of addition using toString: %s\n", result);

		// now do subtraction
		result = left.subtract (right);
		
		// display the sum using 'print' first then 'toString'
		System.out.printf ("The result of subtraction using print: ");
		result.print ();
		System.out.printf ("The result of subtraction using toString: %s\n", result);
		
	}  // end method main

}
>>>>>>> 6bb1f4c330632809cb8d2fd272330bf90bc46547
