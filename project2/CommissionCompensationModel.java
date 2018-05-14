package project2;

public class CommissionCompensationModel extends CompensationModel{
	private double grossSales;
    private double commissionRate;
    
	public CommissionCompensationModel(double grossSales, double commissionRate) {
		setGrossSales(grossSales);
		setCommissionRate(commissionRate);
		
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
    @Override // indicates this method overrides a superclass method
    public String toString(){
        return String.format("%s: %.2f\n%s: %.2f",
                "Gross Sales", getGrossSales(),
                "Commission Rate", getCommissionRate());
    }
}
