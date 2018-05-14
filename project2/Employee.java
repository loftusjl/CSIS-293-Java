package project2;

public class Employee{
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private boolean basePlusComp;
    
	public Employee(String first, String last, String ssn, boolean model) {
		// implicit call to Object constructor occurs here
        setFirstName(first);
        setLastName(last);
        setSocialSecurityNumber(ssn);
        setBasePlusComp(model);
    }

	// SETTERS
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setBasePlusComp(boolean basePlusComp){
        this.basePlusComp = basePlusComp;
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
    public boolean getBasePlusComp() {
    	return this.basePlusComp;
    }


 // return string representation of CompensationModel object
	public String toString(){
		return String.format("%s: %s %s\n%s: %s\n%s: %b",
		"commission employee", getFirstName(), getLastName(),
		"social security number", getSocialSecurityNumber(),
		"employee is under Base Plus Commission Compensation model: ", getBasePlusComp());
	}
}
