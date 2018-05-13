package project2;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    // constructor
    public BasePlusCommissionEmployee(String first, String last, String ssn,
            double sales, double rate, double salary){
        // explicit call to superclass CommissionEmployee constructor
        super(first, last, ssn, sales, rate);

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
    // return String representation of object
    @Override
    public String toString(){
        return String.format(
                "%s %s\n%s: %.2f", "base salaried", super.toString(),
                "base salary", getBaseSalary());
    }
}
