//A2Ex2.java
/*
Programmer: Cole Rodenberg Date: 9/15/15 
*/
import java.util.*;

public class A2Ex2
{
	
	Scanner console = new Scanner(System.in);
	public static void main(String[]args)
	{
		int num;
		System.out.print("Please enter a 4 digit integer: ");
		num = console.nextInt();
		if(num<0)
		{
			num = -num;
		}
		System.out.println(num/1000);
		num%=1000;
		System.out.println(num/100);
		num%=100;
		System.out.println(num/10);
		num%=10;
		System.out.println(num);
	}
}