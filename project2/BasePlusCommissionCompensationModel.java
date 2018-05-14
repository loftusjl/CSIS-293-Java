package project2;

public class BasePlusCommissionCompensationModel extends CommissionCompensationModel{
	private double baseSalary;
    
	public BasePlusCommissionCompensationModel(double grossSales, double commissionRate, double salary) {
		super(grossSales,commissionRate);
		setBaseSalary(salary);
	}
	// SETTERS
    public void setBaseSalary(double salary){
        if(salary >= 0.0f)
            this.baseSalary = salary;
        else
            throw new IllegalArgumentException(
                    "Base salary must be >= 0.0f");
    }
    // GETTERS
    public double getBaseSalary(){
        return this.baseSalary;
    }
    // calculate earnings
    @Override
    public double earnings(){
        return getBaseSalary() + super.earnings();
    }
    @Override
    public String toString(){
        return String.format(
                "%s %s\n%s: %.2f", "base salaried", super.toString(),
                "base salary", getBaseSalary());
    }
}
