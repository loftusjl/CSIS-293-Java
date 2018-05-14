package project2;

public class EmployeeTest {
	
	public static void main(String[] args) {

		// Create first employee
		Employee emp1 = new Employee("Bob", "Smith", "555-55-5555");
		
		CompensationModel emp1Comp = new CommissionCompensationModel(5000, .04);
		double emp1CompGross = emp1Comp.getGrossSales();
		
        System.out.println("Employee information obtained by get methods: \n");
        System.out.printf("%s %s\n", "First name is",
                emp1.getFirstName());
        System.out.printf("%s %s\n", "Last name is",
                emp1.getLastName());
        System.out.printf("%s %s\n", "Social security number is",
        		emp1.getSocialSecurityNumber());
        System.out.println();
        System.out.println("Compensation information obtained by earnings method:");
        System.out.println(emp1Comp);
        System.out.println("Employee earnings: " + emp1Comp.earnings());
        
     // Create second employee
     		Employee emp2 = new Employee("Lydia", "Deets", "666-66-6666");
     		
     		CompensationModel emp2Comp = new BasePlusCommissionCompensationModel(9500, .04, 1000);
     		
     		
             System.out.println("Employee information obtained by get methods: \n");
             System.out.printf("%s %s\n", "First name is",
            		 emp2.getFirstName());
             System.out.printf("%s %s\n", "Last name is",
            		 emp2.getLastName());
             System.out.printf("%s %s\n", "Social security number is",
            		 emp2.getSocialSecurityNumber());
             System.out.println();
             System.out.println("Compensation information obtained by earnings method:");
             System.out.println(emp2Comp);
             System.out.println("Employee earnings: " + emp2Comp.earnings());
             System.out.printf("\n---------------\n%s\n---------------\n", "Switching Compensation Models");
             
             BasePlusCommissionCompensationModel emp1Promoted = new BasePlusCommissionCompensationModel(double sales, double rate, 2000);
             	
//             ((BasePlusCommissionCompensationModel) emp1Comp).setBaseSalary(2000);
             if(emp1Promoted instanceof BasePlusCommissionCompensationModel) {
            	 System.out.println("Employee earnings: " + (emp1Promoted).earnings());
             }
		
		
	}

}
