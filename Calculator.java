//Calculator.java
/*Programmer: Cole Rodenberg Date: 10/7/15*/

import java.util.*;
public class Calculator
{
	static Scanner console  = new Scanner(System.in);
	public static void main(String[]args)
	{
		int num1, num2;
		char ch;
		System.out.print("Please enter in two numbers in the order you want them to be calculated: ");
		num1 = console.nextInt();
		num2 = console.nextInt();
		System.out.print("\nPlease enter the operation that you wish to take place(+,-,*,/,%): ");
		ch = console.next().charAt(0);
		calculator(num1,num2,ch);
	}
	public static void calculator(int x, int y, char a)
	{
	int sum, quotient, mult, diff, mod;
		if(a == '+')
		{
			sum = x+y;
			System.out.print("\n" + x + " + " + y + " = " + sum);
		}
		else if(a == '*')
		{
			mult = x*y;
			System.out.print("\n" + x + " * " + y + " = " + mult);
		}
		else if(a == '-')
		{
			diff = x-y;
			System.out.print("\n" + x + " - " + y + " = " + diff);
		}
		else if(a == '/')
		{
			quotient = x/y;
			System.out.print("\n" + x + " / " + y + " = " + quotient);
		}
		else if(a == '%')
		{
		mod = x%y;
		System.out.print("\n" + x + " % " + y + " = " + mod);
		}
		else
		{
		System.out.print("\n You did not enter a valid character. Please enter in a +,-,/,%, or *.");
		}
	}
}