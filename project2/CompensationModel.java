package project2;

public class CompensationModel extends Employee{
	private boolean basePlusComp;
    private double grossSales;
    private double commissionRate;
	
	public CompensationModel(String first, String last, String ssn, boolean model) {
		// call to superclass Employee constructor
		super(first, last, ssn);
		this.basePlusComp = false; // give logic to set true or false. 
		}
	// setters
    public void setGrossSales(double grossSales){
        if(grossSales >= 0.0f)
            this.grossSales = grossSales;
        else
            throw new IllegalArgumentException(
                    "Gross sales must be >= 0.0f");
    }
    public void setCommissionRate(double commissionRate){
        if(commissionRate > 0.0f && commissionRate < 1.0f)
            this.commissionRate = commissionRate;
        else
            throw new IllegalArgumentException(
                    "Commission rate must be > 0.0f and < 1.0f");
    }
    
    // getters
    public double getGrossSales(){
        return this.grossSales;
    }
    public double getCommissionRate(){
        return this.commissionRate;
    }
    
    // calculate earnings
    @Override
    public double earnings(){
        return getCommissionRate() * getGrossSales();
	}
    
    // return string representation of CompensationModel object
    @Override
        public String toString(){
            return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
                    "commission employee", getFirstName(), getLastName(),
                    "social security number", getSocialSecurityNumber(),
                    "gross sales", getGrossSales(),
                    "commission rate", getCommissionRate());
        }


}
