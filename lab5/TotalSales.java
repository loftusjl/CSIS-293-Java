// File: TotalSales.java - a solution to exercise 7.20, p316
// Author: Mike Qualls


package lab5;
import java.util.Scanner;

public class TotalSales {
	static final int ROW_SIZE = 6, COLUMN_SIZE = 5;

	public static void main(String[] args) {
		// declare local variables
		double [][] sales;
		double dollarValue;
		int personNumber, productNumber;
		Scanner input = new Scanner (System.in);
		
		// create the array allowing space for 4 salerspersons, 5 products, and a totals row and column
		sales = new double [ROW_SIZE][COLUMN_SIZE];
		
		// using sentinel controlled repetition, process sales slips.
		// read sales person number as the sentinel value
		System.out.print ("Enter sales person number as an integer - 1 to 4, 0 to quit: ");
		personNumber = input.nextInt ();
		
		while (personNumber != 0) {
			// read product number and dollar value
			System.out.print ("Enter product number as an integer - 1 to 5: ");
			productNumber = input.nextInt ();
			System.out.print ("Enter total dollar value: ");
			dollarValue = input.nextDouble ();
			
			// place the value read into the array
			sales [productNumber - 1][personNumber - 1] = dollarValue;
			
			// read the next sales person number
			System.out.print ("Enter sales person number as an integer - 1 to 4, 0 to quit: ");
			personNumber = input.nextInt ();			
			
		}  // end while loop to process sales slips
		
		// calculate the totals
		
		// display array values
		displaySalesTotals (sales);
		
	}  // end method main

	
	public static void displaySalesTotals (double [][]sales) {
		// print array values - to include the totals column and row
		
//		for (int row = 0; row < sales.length; row++) {
		for (int row = 0; row < ROW_SIZE; row++) {
			// print columns in the row
//			for (int column = 0; column < sales [row].length; column++) {
			for (int column = 0; column < COLUMN_SIZE; column++) {
				System.out.printf ("%10.2f",  sales [row][column]);
			}  // print a row
			System.out.println ();
		}  // end for statement
		
	}  // end displaySalesTotals
}  // end class TotalSales
