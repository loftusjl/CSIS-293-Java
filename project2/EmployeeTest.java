package project2;

public class EmployeeTest {
	
	public static void main(String[] args) {
		// Standard employee base pay
		double basePay = 1000;

		// Create first employee
		Employee emp1 = new Employee("Bob", "Smith", "555-55-5555");
		System.out.printf("%.2f",emp1.earnings(5000, .04));
		
//		CompensationModel emp1Comp = new CommissionCompensationModel(5000, .04);
		
        System.out.println("Employee information obtained by get methods: \n");
        System.out.printf("%s: %s %s\n", "Full name",emp1.getFirstName(), emp1.getLastName());
        System.out.printf("%s %s\n", "Social security number: ", emp1.getSocialSecurityNumber());
        System.out.println();
        System.out.println("Compensation information obtained by toString() and earnings() methods:");
        System.out.printf("\n%s\n",emp1.toString());
        System.out.printf("\n%s\n",emp1.toString());
        System.out.println("Employee earnings: " + emp1.earnings(5000, .04));
        System.out.println();
        
        // Create second employee
 		Employee emp2 = new Employee("Lydia", "Deets", "666-66-6666");
 		
 		CompensationModel emp2Comp = new BasePlusCommissionCompensationModel(5000, .04, basePay);
 		
 		
         System.out.println("Employee information obtained by get methods: \n");
         System.out.printf("%s: %s %s\n", "Full name",emp2.getFirstName(), emp2.getLastName());
         System.out.printf("%s %s\n", "Social security number is",emp2.getSocialSecurityNumber());
         System.out.println();
         System.out.println("Compensation information obtained by toString() and earnings() methods:");
         System.out.println(emp2Comp);
         System.out.println("Employee earnings: " + emp2Comp.earnings());
         
         // Switch compensation models
         System.out.printf("\n---------------\n%s\n---------------\n", "Switching Compensation Models");
         
         // cast emp1 compensation to BasePlusCommissionCompensationModel
//         CompensationModel emp1Promoted = new BasePlusCommissionCompensationModel(((CommissionCompensationModel) emp1Comp).getGrossSales(), ((CommissionCompensationModel) emp1Comp).getCommissionRate(), basePay);
         
    	 System.out.printf("%s: %s %s\n", "Full name",emp1.getFirstName(), emp1.getLastName());
//    	 System.out.println("Updated Employee earnings: " + emp1Promoted.earnings());
    	 System.out.println();
     
         // cast emp2 to CommissionCompensationModel
    	 CompensationModel emp2Demoted = new CommissionCompensationModel(((CommissionCompensationModel) emp2Comp).getGrossSales(),((CommissionCompensationModel) emp2Comp).getCommissionRate());
    	 
         System.out.printf("%s: %s %s \n", "Full name",emp2.getFirstName(), emp2.getLastName());
         System.out.println("Updated Employee earnings: " + emp2Demoted.earnings());

		
		
	}

}
