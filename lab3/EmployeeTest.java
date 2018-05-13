package lab3;
import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		// constructor to add two new employees and their base monthly salaries
		Employee emp1 = new Employee("Tommy", "Pickles", 60.00);
		Employee emp2 = new Employee("Fredrick", "Fredrickson", 5.23);
		
		// display both employees starting salaries
		System.out.printf("%s %s started with a yearly salary of $%.2f%n", emp1.getFName(), emp1.getLName(), emp1.yearlySalary());
		System.out.printf("%s %s started with a yearly salary of $%.2f%n%n", emp2.getFName(), emp2.getLName(), emp2.yearlySalary());
		
		// create scanner object to obtain input from command window
		Scanner input = new Scanner(System.in);
		
		// prompt to enter salary increase for employees
		System.out.print("Please enter the percent raise: ");
		double percentRaise = input.nextDouble(); // obtain next integer entered by user
		System.out.printf("%nadding %.0f%% to both employee salaries %n%n", percentRaise);
		emp1.raiseMSalary(percentRaise); // add percentage raise to employee1 salary
		emp2.raiseMSalary(percentRaise); // add percentage raise to employee2 salary
		
		// display both employee salaries
		System.out.printf("%s %s now has a yearly salary of $%.2f%n", emp1.getFName(), emp1.getLName(), emp1.yearlySalary());
		System.out.printf("%s %s now has a yearly salary of $%.2f%n%n", emp2.getFName(), emp2.getLName(), emp2.yearlySalary());
		
		
	}

}
