package com.Shanklish.DateComparison;
import java.text.ParseException;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;


public class DateCompareMain {

	public static void main(String[] args) throws ParseException 
	{
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your earliest date in the following format 'Year-Month-Day'");
		String d1 = scan.nextLine();
		
		System.out.println("Please enter the more recent date in the following format 'Year-Month-Day'");
		String d2 = scan.nextLine();
		
		//Parses the inputed date into the correct 'LocalDate' format.
		LocalDate olderDate = LocalDate.parse(d1);
		LocalDate newerDate = LocalDate.parse(d2);
		
		//Calculates the time between the two dates
		Period diff = olderDate.until(newerDate);
		
		// Assigns values obtained from methods into local variables
		int day = diff.getDays();
		int month = diff.getMonths();
		int year = diff.getYears();
	
		//Displays the results
	    System.out.println(year + " years, " + month + " months and " + day +" days." );
										

	}

}
