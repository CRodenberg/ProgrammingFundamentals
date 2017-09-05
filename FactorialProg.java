//FactorialProg

/* Programmer: Cole Rodenberg Date: 10/6/15*/

public class FactorialProg
{
	public static void main(String[]args)
	{
		System.out.println("Value of N       Value of N Factorial");
		System.out.println("__________       ____________________");
		for(int i=10; i<=30; i++)
		{
			System.out.printf("%10d       %20d", i, factorial(i));
			System.out.println();
		}
	}//main
	public static int factorial(int n)
	{
		int fact = 1;
		for(int count=n; count>1; count--)
			fact*=count;
			return fact;
	}//factorial
}//class