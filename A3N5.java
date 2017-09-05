//A3N5.java

//Programmer: Cole Rodenberg Date: 9/22/15

import java.util.*;

public class A3N5
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[]args)
	{
		//Introduction Section and Input from user
		double f,c;
		System.out.print("Please enter a temperature in Fahrenheit: ");
		f = console.nextDouble();
		System.out.println();
		//Computations
		c = ((5*(f-32))/9);
		
		//Output Section
		System.out.printf("Temperature in Fahrenheit: %.2f", f);
		System.out.println();
		System.out.printf("Temperature in Celsius: %.2f", c);
	}
}