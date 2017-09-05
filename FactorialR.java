//FactorialR

/* Programmer: Cole Rodenberg Date: 2/23/16*/

public class FactorialR
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
		if (n == 1)
			return 1;
		return n * factorial(n-1);
	}//factorial
}//class