// File: Complex.java - define a Complex class for Complex addition
// Author: Mike Qualls

package Demo_Lab6;

public class Complex {
	// instance variables
	private double real, imaginary;
	
	// constructors - the no-argument constructor first
	public Complex () {
		setReal (1);
		setImaginary (1);
	}
	public Complex (double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	// sets/gets - although not requested by the problem
	public void setReal (double real) {
		this.real = real;
	}
	public void setImaginary (double imaginary) {
		this.imaginary = imaginary;
	}
	public double getReal () {
		return real;
	}
	public double getImaginary () {
		return imaginary;
	}
	
	// methods add and subtract
	public Complex add (Complex right) {
		// add the real parts and imaginary parts
		return new Complex (this.real + right.real, 
							   this.imaginary + right.imaginary);
	
	}  // end method add
	public Complex subtract (Complex right) {
		// subtract the right value from the left
		return new Complex (this.real - right.real,
								this.imaginary - right.imaginary);
	}
	
	// print a Complex number as requested by the text (or, use the toString
	// method.  either will be OK
	public void print () {
		System.out.printf ("(%.2f, %.2f)\n", this.getReal (), this.getImaginary ());
	}
	public String toString () {
		return String.format ("(%.2f, %.2f)\n", this.getReal (), this.getImaginary ());
	}
	
}  // end class Complex

