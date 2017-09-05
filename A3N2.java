//A3N2.java

//Programmer: Cole Rodenberg Date: 9/22/15

import java.util.*;

public class A3N2
{
	static Scanner console = new Scanner(System.in);
	static final double INCOME_TAX = .15;
	static final double STATE_TAX = .035;
	static final double SS_TAX = .0575;
	static final double MEDICARE_TAX = .0275;
	static final double PENSION = .05;
	static final double HEALTH_INSURANCE = 75;
	public static void main(String[]args)
	{
		double gross,netPay;
		String name;
		System.out.print("Please enter the employee name: ");
		name = console.next();
		System.out.println();
		System.out.print("Please enter the gross amount: ");
		gross = console.nextDouble();
		netPay = gross - (gross*INCOME_TAX + gross*STATE_TAX + gross*SS_TAX + gross*MEDICARE_TAX + gross*PENSION + HEALTH_INSURANCE);
		System.out.println("\n\n\n");
		System.out.println(name);
		System.out.printf("Gross Amount: \t\t$%.2f", gross);
		System.out.println();
		System.out.printf("Federal Tax: \t\t$%.2f", gross*INCOME_TAX);
		System.out.println();
		System.out.printf("State Tax: \t\t$%.2f", gross*STATE_TAX);
		System.out.println();
		System.out.printf("Social Security Tax: \t$%.2f", gross*SS_TAX);
		System.out.println();
		System.out.printf("Medicare/Medicaid Tax: \t$%.2f", gross*MEDICARE_TAX);
		System.out.println();
		System.out.printf("Pension Plan: \t\t$%.2f", gross*PENSION);
		System.out.println();
		System.out.printf("Health Insurance: \t$%.2f", HEALTH_INSURANCE);
		System.out.println();
		System.out.printf("Net Pay: \t\t$%.2f", netPay);
	}
}