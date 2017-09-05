/*A5E1.java
Programmer: Cole Rodenberg
Date: 10/27/15*/

import java.util.Scanner;
public class A5E1
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args)
	{
			System.out.print("Please enter an integer: ");
			int num = console.nextInt();
		if(num<0)
			num=-num;
		int temp = 0;
		int mod = 10;
		int ndigits = 0;
		int sum = 0;
		while(temp != num)
		{
			ndigits++;
			temp = num%mod;
			mod*=10;
		}
		for(int i = ndigits-1; i>=0; i--)
		{
			int digit = num/(int)Math.pow(10,i);
			sum+=digit;
			System.out.print(digit + " ");
			num = num % (int)Math.pow(10,i);
		}
		System.out.println("Sum of Digits = " + sum);
	
	}
}