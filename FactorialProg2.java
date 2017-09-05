//FactorialProg2

/* Programmer: Cole Rodenberg Date: 10/6/15*/

public class FactorialProg2
{
	public static void main(String[]args)
	{
		System.out.println("Value of N       Value of N Factorial");
		System.out.println("__________       ____________________");
		for(int i=1; i<=9; i++)
		{
			System.out.printf("%10d       %20d", i, factorial(i));
			System.out.println();
		}
		for(int i=10; i<=30; i++)
		{
			System.out.printf("%10d       %20d", i, factorial(i));
			System.out.println();
		}
	}//main
	public static long factorial(int n)
	{
		long fact = 1;
		for(int count=n; count>1; count--)
			fact*=count;
			return fact;
	}//factorial
}//class