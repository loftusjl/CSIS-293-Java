package project2;

public class Employee{
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private double earnings;
    
	public Employee(String first, String last, String ssn) {
		// implicit call to Object constructor occurs here
        setFirstName(first);
        setLastName(last);
        setSocialSecurityNumber(ssn);
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
    // calculate earnings
    public double earnings(){
		return earnings;
    }

 // return string representation of CompensationModel object
	public String toString(){
		return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
		"commission employee", getFirstName(), getLastName(),
		"social security number", getSocialSecurityNumber());
	}
}
