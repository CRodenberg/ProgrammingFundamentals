/*A5E3.java
Programmer: Cole Rodenberg
Date: 10/27/15*/

import java.util.Scanner;
public class A5E3
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.print("Please enter the initial investment: ");
		double investment = console.nextDouble();
		double total = investment;
		double interest = 10;
		int years = 44;
		for(int y = 16; y <= 60; y++)
			total = total*(1 + (interest/100));
		System.out.print("The initial investment was $");
		System.out.printf("%.2f", investment);
		System.out.print(". The total amount\naccumulated after " + years + " years, if $");
		System.out.printf("%.2f",investment);
		System.out.print(" is\n");
		System.out.print("allowed to compound with an interest rate of 10.00%, comes to\n$");
		System.out.printf("%.2f",total);
		years+=1;
		double secondTotal = total*(1 + (interest/100));
		System.out.print("\n\nThe total amount accumulated after " + years + " years,\nif $");
		System.out.printf("%.2f",investment);
		System.out.print(" is allowed to compound with an\ninterest rate of 10%, comes to\n");
		System.out.printf("%.2f",secondTotal);
		System.out.print(" per month.");
		double earnedInterest = secondTotal - total;
		double incomePerMonth = earnedInterest/12;
		System.out.print("\n\nThe interest earned during the year is $");
		System.out.printf("%.2f",earnedInterest);
		System.out.print(". If\ninterest is withdrawn each year thereafter, my income is\n$");
		System.out.printf("%.2f",incomePerMonth);
		System.out.print(" per month.");
	}
}