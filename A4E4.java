//A4E4.java
/*Programmer: Cole Rodenberg Date: 10/13/15*/

import java.util.Scanner;
public class A4E4
{
	public static void main(String[]args)
	{
		int count = 1;
		int count2 = 0;
		int num;
		double power;
		Scanner console = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		num = console.nextInt();
		do
		{
			power = Math.pow(10, count);
			double div = Math.pow(10, count2);
			System.out.print((num%(int)power)/(int)div);
			count++;
			count2++;
		}while((num%(int)power) != num);
	}
}