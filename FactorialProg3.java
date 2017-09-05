//FactorialProg3

/* Programmer: Cole Rodenberg Date: 10/6/15*/

public class FactorialProg3
{
	public static void main(String[]args)
	{
		System.out.println("Value of N       Value of N Factorial");
		System.out.println("__________       ____________________");
		for(int i=10; i<=175; i+=5)
		{
			System.out.printf("%10d       %20.7e", i, factorial(i));
			System.out.println();
		}
	}//main
	public static double factorial(int n)
	{
		double fact = 1;
		for(int count=n; count>1; count--)
			fact*=count;
			return fact;
	}//factorial
}//class