package lab3;

public class Employee {
	// declare local variables
	private String fName;
	private String lName;
	private double monthlySalary;

	// method to set the first name in the object
	public void setFName(String fName) {
		this.fName = fName; // store first name
	}
	
	// method to set the first name in the object	
	public void setLName(String lName) {
		this.lName = lName; // store last name
	}

	// method to get the first name from the object
	public String getFName() {
		return fName; // return value of name to caller
	}
	
	// method to get the first name from the object
	public String getLName() {
		return lName; // return value of name to caller
	}
	
	// method to add percent in integers to the monthly salary. Must be positive.
	public void raiseMSalary(double mSalaryRaise) {
		if (mSalaryRaise > 0) { // if the mSalaryAmount is valid
			mSalaryRaise = (1 + (mSalaryRaise/100));
			monthlySalary = (monthlySalary * mSalaryRaise); // add it to the monthly salary
		}
	}
	
	// method to retrieve the yearly salary from the object
	public double yearlySalary() {
		return (monthlySalary * 12); // multiply monthly salary by 12
	}

	// Account constructor that receives 3 parameters (First Name, Last Name, Monthly Salary)
	public Employee(String fName, String lName, double monthlySalary) {
		this.fName = fName; // assign first name to instance variable fName
		this.lName = lName; // assign last name to instance variable lName
		
		// validate that the balance is greater than 0.0; if it's not, 
		// instance variable balance keeps its default initial value of 0.0
		if (monthlySalary > 0.0) { // if the balance is valid
			this.monthlySalary = monthlySalary; // assign it to instance variable balance
		}
	}

}
