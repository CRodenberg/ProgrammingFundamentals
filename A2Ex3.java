//A2Ex3.java
/*
Programmer: Cole Rodenberg Date: 9/15/15 
*/
import java.util.*;

public class A2Ex3
{
	
	static Scanner console = new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.print("Please enter the original price of the item: ");
		double originalPrice = console.nextDouble();
		System.out.print("\nPlease enter the percentage of the marked up price: ");
		double percentage = console.nextDouble();
		System.out.print("\nPlease enter the sales tax rate: ");
		double salesTax = console.nextDouble();
		System.out.println("\nOriginal Price: " + originalPrice + "\nPercentage: " + percentage + "\nSales Tax: " + salesTax);
		double sellingPrice = originalPrice*(1+percentage/100) + salesTax/100;
		System.out.print("Final Price: " + sellingPrice);
	}
}