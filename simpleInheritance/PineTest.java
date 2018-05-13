// File: PineTest.java - test our simple set of classes
// Author: Mike Qualls

package simpleInheritance;

public class PineTest {

	public static void main(String[] args) {
		// declare local variables/object references
		Pine pine1, pine2;
		Oak oak1, oak2;
		
		// create the objects
		pine1 = new Pine ();
		pine2 = new Pine (7, 3);
		oak1 = new Oak ();
		oak2 = new Oak (35, 10);
		
		// display our forest
		System.out.println ("Our Forest");
		System.out.printf ("\tPine1: %s\n", pine1);
		System.out.printf ("\tPine2: %s\n", pine2);
		System.out.printf ("\tOak1: %s\n", oak1);
		System.out.printf ("\tOak2: %s\n", oak2);

	}  // end method main

}  // end class PineTest
