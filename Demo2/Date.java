<<<<<<< HEAD
package demo2;

public class Date {
	// declare instance variables
	private int month, day, year;
	
	//methods, constructor first
	public Date (int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}  // end constructor
	
	// sets/gets
	public void setMonth (int month) {
		this.month = month;
	}
	public void setDay (int day) {
		this.day = day;
	}
	public void setYear (int year) {
		this.year = year;
	}
	public int getMonth () {
		return month;
	}
	public int getDay () {
		return day;
	}
	public int getYear () {
		return year;
	}
	
	// display the date
	public void displayDate () {
		System.out.printf ("Date: %d/%d/%d\n", month, day, year);
	}  // end method displayDate

}  // end class Date
=======
package demo2;

public class Date {
	// declare instance variables
	private int month, day, year;
	
	//methods, constructor first
	public Date (int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}  // end constructor
	
	// sets/gets
	public void setMonth (int month) {
		this.month = month;
	}
	public void setDay (int day) {
		this.day = day;
	}
	public void setYear (int year) {
		this.year = year;
	}
	public int getMonth () {
		return month;
	}
	public int getDay () {
		return day;
	}
	public int getYear () {
		return year;
	}
	
	// display the date
	public void displayDate () {
		System.out.printf ("Date: %d/%d/%d\n", month, day, year);
	}  // end method displayDate

}  // end class Date
>>>>>>> 6bb1f4c330632809cb8d2fd272330bf90bc46547
