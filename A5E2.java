/*A5E2.java
Programmer: Cole Rodenberg
Date: 10/27/15*/

import java.util.Scanner;

public class A5E2
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args)
	{
		int dividend = 2;
		int sum;
		int count = 0;
		while(count != 4)
		{
			sum=0;
			dividend++;
			for(int i = 1; i < dividend; i++)
			{
				if(dividend%i == 0)
					sum += i;
			}
		if(sum == dividend)
		{
			count++;
			System.out.println("Next perfect integer is: " + dividend);
		}
		}
		System.out.print("Please enter a positive integer: ");
		int num = console.nextInt();
		int sum2 = 0;
			for(int i = 1; i < num; i++)
				{
					if(num%i == 0)
						sum2+=i;
				}
				if(sum2 == num)
					System.out.print("The integer " + num + " is perfect.");
				else
					System.out.print("The integer " + num + " is not perfect.");
	}
}