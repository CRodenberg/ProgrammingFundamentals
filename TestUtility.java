/*TestUtility.java
Programmer: Cole Rodenberg Date: 11/9/15*/


public class TestUtility
{
	public static void main(String[] args)
	{
		System.out.print("Testing isEven with odd number: " + Utility.isEven(5));
		System.out.print("\nTesting isEven with even number: " + Utility.isEven(6));
		System.out.print("\nTesting isOdd with odd number: " + Utility.isOdd(5));
		System.out.print("\nTesting isOdd with even number: " + Utility.isOdd(6));
		System.out.print("\nTesting isPrime with prime number: " + Utility.isPrime(3));
		System.out.print("\nTesting isPrime with composite number: " + Utility.isPrime(10));
		String name = "nicole";
		String subName = "cole";
		String notSubName = "bob";
		System.out.print("\nTesting isASubString with actual substring: " + Utility.isASubString(subName, name));
		System.out.print("\nTesting isASubString with wrong substring: " + Utility.isASubString(notSubName, name));
		System.out.print("\nTesting isPerfectInt with perfect int: " + Utility.isPerfectInt(6));
		System.out.print("\nTesting isPerfectInt with not perfect int: " + Utility.isPerfectInt(5));
		int num = 5;
		long num1 = 5;
		double num2 = 5;
		System.out.print("\nTesting factorial with int: " + Utility.factorial(num));
		System.out.print("\nTesting factorial with double: " + Utility.factorial(num2));
		System.out.print("\nTesting factorial with long: " + Utility.factorial(num1));
		System.out.print("\nTesting maximum with 3 numbers: " + Utility.maximum(1,2,3));
		System.out.print("\nTesting maximum with 4 numbers: " + Utility.maximum(1,2,3,4));
		System.out.print("\nTesting maximum with 5 numbers: " + Utility.maximum(1,2,3,4,5));
		System.out.print("\nTesting minumum with 3 numbers: " + Utility.minimum(1,2,3));
		System.out.print("\nTesting minumum with 4 numbers: " + Utility.minimum(1,2,3,4));
		System.out.print("\nTesting minumum with 5 numbers: " + Utility.minimum(1,2,3,4,5));
		System.out.print("\nTesting sumOfSeries: " + Utility.sumOfSeries(2,5,5));
		System.out.print("\nTesting sumOfGeoSeries: " + Utility.sumOfGeoSeries(2,5,5));
	}
}
	