package lab6;

public class ComplexTest {
		public static void main(String args[])
		{
			// set up test complex numbers
			Complex comp1 = new Complex(88.9F, 3.2F);
			Complex comp2 = new Complex(08.6F, 0.75F);
			
			System.out.println("First complex number is: ");
			comp1.printResult(); // display first complex number
			System.out.println("Second complex number is: ");
			comp2.printResult(); // display second complex number
			
			System.out.println();
	 
			Complex comp3 = new Complex(); // used for storing math calculations
	 
			System.out.println("Addition of the first and second complex number is: ");
			comp3 = comp1.add(comp2); // use method to add comp1 and comp2
			comp3.printResult(); // display result
	 
			System.out.println("Subtraction of first and second complex number is: ");
			comp3 = comp1.subtract(comp2); // use method to subtract comp1 and comp2
			comp3.printResult(); // display result
		}
}
