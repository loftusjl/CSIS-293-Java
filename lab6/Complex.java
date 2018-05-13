package lab6;

class Complex{
	float real, imaginary;
 
	Complex() {} // needed to include empty constructor for overloading
	
	// establish float variables
	Complex(float r, float i){
			real = r;
			imaginary = i;
	}
 
	void printResult() // results method for use throughout the class
	{
		System.out.println("("+real+", "+imaginary+"i)");
	}
 
	Complex add(Complex comp2)
	{
		Complex result = new Complex();
 
		result.real = real + comp2.real; // adds real numbers
		result.imaginary = imaginary + comp2.imaginary; // adds imaginary numbers
 
		return(result);
	}
 
	Complex subtract(Complex comp2)
	{
		Complex result = new Complex();
 
		result.real = real - comp2.real; // subtracts real numbers
		result.imaginary = imaginary - comp2.imaginary; // subtracts imaginary numbers
 
		return(result);
	}
 
}
 
package lab6;

class Complex{
	float real, imaginary;
 
	Complex() {} // needed to include empty constructor for overloading
	
	// establish float variables
	Complex(float r, float i){
			real = r;
			imaginary = i;
	}
 
	void printResult() // results method for use throughout the class
	{
		System.out.println("("+real+", "+imaginary+"i)");
	}
 
	Complex add(Complex comp2)
	{
		Complex result = new Complex();
 
		result.real = real + comp2.real; // adds real numbers
		result.imaginary = imaginary + comp2.imaginary; // adds imaginary numbers
 
		return(result);
	}
 
	Complex subtract(Complex comp2)
	{
		Complex result = new Complex();
 
		result.real = real - comp2.real; // subtracts real numbers
		result.imaginary = imaginary - comp2.imaginary; // subtracts imaginary numbers
 
		return(result);
	}
 
}
