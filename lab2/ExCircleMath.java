// File:  CircleMath.java - the contents of Lab #2
// Author:  Mike Qualls

package lab2;

import java.util.Scanner;

public class ExCircleMath {

	public static void main(String[] args) {
		// declare local variables
		int radius, diameter;
		double circumference, area;
		Scanner input = new Scanner (System.in);
		
		// perform input
		System.out.print ("Enter radius as an integer: ");
		radius = input.nextInt ();
		
		// perform processing
		diameter = radius * 2;
		circumference = 2 * Math.PI * radius;
		area = Math.PI * Math.pow (radius, 2);
		
		// perform output
		System.out.println ("The results of Circle Math");
		System.out.printf ("\tFor a circle of radius %d\n", radius);
		System.out.printf ("\t\tdiameter = %d\n", diameter);
		System.out.printf ("\t\tcircumference = %f\n", circumference);
		System.out.printf ("\t\tarea = %f\n", area);
		System.out.println ("That's all");
		
		// close the input stream
		input.close ();
		
	}  // end method main

}  // end class CircleMath
