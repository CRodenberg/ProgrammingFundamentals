//A4E3.java

/* Programmer: Cole Rodenberg Date: 10/6/15*/
import java.util.Scanner;
public class A4E3
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[]args)
	{
		int accNum, minBalance, currentBalance;
		double serviceCharge, interest;
		char accType;
		System.out.print("Please enter the account number: ");
		accNum = console.nextInt();
		System.out.print("\nPlease enter the minimum balance: ");
		minBalance = console.nextInt();
		System.out.print("\nPlease enter the current balance: ");
		currentBalance = console.nextInt();
		System.out.print("\nPlease enter the account type: ");
		accType = console.next().charAt(0);
		switch(accType)
		{
			case 's': if(currentBalance<minBalance)
						serviceCharge = 10.00;
					else interest = .04*currentBalance;
					break;
			case 'c': if(currentBalance<minBalance)
						serviceCharge=25.00;
						else
						{
							if((currentBalance-minBalance)<5000)
								interest=.05*currentBalance;
							else
								interest = .05*currentBalance;
						}
						break;
			default:
				System.out.print("\n Enter in the correct character!");
		}
		System.out.println(accNum + " " + accType + " " + minBalance + " " + currentBalance);
	}
}
	