package demo2;

public class DateTest {

	public static void main(String[] args) {
		// declare local variables/object references
		Date myBirthDate;
		
		// create the object
		myBirthDate = new Date (5, 31, 1998);
		
		// demonstrate capability
		System.out.println ("Dates of importance");
		myBirthDate.displayDate ();

	}  // end method main

}  // end class DateTest
