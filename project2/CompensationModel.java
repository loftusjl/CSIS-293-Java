package project2;

public class CompensationModel{
    private String compModel = "Compensation Model";
    private double earnings;
	
	protected final void setModel(String model) {
		
		// reference object being created
		this.compModel = model;
	}
    
	protected final String getModel() {
		
		return this.compModel;
		
	}
	
    // calculate earnings
    public double earnings(){
		return earnings;
    }
    
    public CompensationModel() {

		}

    // return String representation of object
    public String toString(){
        return String.format(
                "Compensation Model is: %s\nEarnings: %.2f", compModel, earnings());
    }

}