/*Utility.java
Programmer: Cole Rodenberg Date: 11/9/15*/

import static java.lang.Math.*;

public class Utility extends Object
{
	public static boolean isEven(int number)
	{
		return (number%2 == 0);
	}
	public static boolean isOdd(int number)
	{
		return (number%2 == 1);
	}
	public static boolean isPrime(int number)
	{
		if((number % 2) == 0)
			return false;
		for(int i = 3; i < number; i +=2)
		{
			if((number % i)==0)
				return false;
		}
		return true;
	}
	public static boolean isASubString(String src, String dest)
	{
		if(dest.contains(src))
			return true;
		else
			return false;
	}
	public static boolean isPerfectInt(int number)
	{
		int sum = 0;
		int count = 0;
			for(int i = 1; i < number; i++)
			{
				if(number%i == 0)
					sum += i;
			}
		if(sum == number)
			return true;
		else
			return false;
	}
	public static int factorial(int n)
	{
		int fact = 1;
		for(int count=n; count>1; count--)
			fact*=count;
			return fact;
	}//factorial
	public static double factorial(double n)
	{
		double fact = 1;
		for(double count = n; count>1; count--)
			fact*=count;
			return fact;
	}//factorial
	public static long factorial(long n)
	{
		long fact = 1;
		for(long count=n; count>1; count--)
			fact*=count;
			return fact;
	}//factorial
	public static int minimum(int a, int b, int c)
	{
		return min(min(a,b),c);
	}
	public static int minimum(int a, int b, int c, int d)
	{
		return min(min(min(a,b),c),d);
	}
	public static int minimum(int a, int b, int c, int d, int e)
	{
		return min(min(min(min(a,b),c),d),e);
	}
	public static int maximum(int a, int b, int c)
	{
		return max(max(a,b),c);
	}
	public static int maximum(int a, int b, int c, int d)
	{
		return max(max(max(a,b),c),d);
	}
	public static int maximum(int a, int b, int c, int d, int e)
	{
		return max(max(max(max(a,b),c),d),e);
	}
	public static int sumOfSeries(int a, int d, int N)
	{
		int sum = 0;
		int term = a;
		for (int i = 1; i <= N; i++)
		{
			sum = sum + term;
			term = term + d;
		}
		return term;
	}
	public static int sumOfGeoSeries(int a, int d, int N)
	{
		int sum = 0;
		int term = a;
		for (int i = 1; i <= N; i++)
		{
			sum = sum + term;
			term = term * d;
		}
		return term;

	}
}

	
	
	
	
	
	
	
	