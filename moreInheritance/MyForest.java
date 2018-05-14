// File: PineTest.java - test our simple set of classes
// Author: Mike Qualls

package moreInheritance;

public class MyForest {

	public static void main(String[] args) {
		// declare local variables/object references
		Tree trees [];
		
		// create the array of superclass references
		trees = new Tree [8];
		
		
		// create the objects
		for (int count = 0; count < 4; count++)
			trees [count] = new Pine (4, 1);
		for (int count = 4; count < 8; count++)
			trees [count] = new Oak (5, 1);
		
	
		// display our forest - depending on polymorphism
		for (int count = 0; count < trees.length; count++)
			System.out.printf ("Tree %d: %s\n", count + 1, trees [count]);
		
		// use the older and grow methods - that overriden for Oak trees
		for (int count = 0; count < trees.length; count++) {
			trees [count].older ();
			trees [count].grow ();
		}  // end for to modify the trees
		
		// display our forest after the passage of time
		System.out.println ("\n\nAfter aging and growing\n");
		for (int count = 0; count < trees.length; count++)
			System.out.printf ("Tree %d: %s\n", count + 1, trees [count]);
		
	}  // end method main

}  // end class PineTest
