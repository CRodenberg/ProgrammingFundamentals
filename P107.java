//P107
/*
Programmer:Cole Rodenberg Date: 9/15/15
*/
import java.util.*;

public class P107
{
	static Scanner console = new Scanner(System.in);
	
	static final int SECRET = 11;
	static final double RATE = 12.50;
	public static void main(String[]args)
	{
		int num1, num2, newNum;
		String name;
		double hoursWorked, wages;
		System.out.print("Please enter an integer: ");
		num1 = console.nextInt();
		System.out.print("Please enter an integer: ");
		num2 = console.nextInt();
		System.out.println("\nThe value of num1 = " + num1 + " and the value of num2 = " + num2);
		newNum = (num1*num2) + num2;
		System.out.println("newNum= " + newNum);
		newNum+=SECRET;
		System.out.println("The value of newNum + SECRET = " + newNum);
		System.out.print("Please enter in your last name: ");
		name = console.next();
		System.out.print("\nPlease enter a decimal number between 0 and 70: ");
		hoursWorked = console.nextDouble();
		wages = RATE*hoursWorked;
		System.out.print("Name: " + name + "\nPay Rate: $" + RATE + "\nHours Worked: " + hoursWorked + "\nSalary: $" + wages);
	}
}