package project2;

public class Employee{
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    
	public Employee(String first, String last, String ssn) {
		// implicit call to Object constructor occurs here
        setFirstName(first);
        setLastName(last);
        setSocialSecurityNumber(ssn);  
    }
	
	public void earnings() {}

	public void earnings(double grossSales, double commissionRate) {
		CompensationModel emp = new CommissionCompensationModel(grossSales, commissionRate);
		System.out.printf("\n%s", emp);
		
	}
	public void earnings(double grossSales, double commissionRate, double salary) {
		CompensationModel emp = new BasePlusCommissionCompensationModel(grossSales, commissionRate, salary);
		System.out.printf("\n%s", emp);
		
	}
	// SETTERS
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setSocialSecurityNumber(String socialSecurityNumber){
        this.socialSecurityNumber = socialSecurityNumber;
    }

    // GETTERS
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getSocialSecurityNumber(){
        return this.socialSecurityNumber;
    }


 // return string representation of CompensationModel object
	public String toString(){
		return String.format("%s: %s %s\n%s: %s\n",
		"commission employee", getFirstName(), getLastName(),
		"social security number", getSocialSecurityNumber());
	}
}
