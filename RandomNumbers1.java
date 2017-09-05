/*RandomNumbers1.java
Programmer: Cole Rodenberg Date: 11/9/15*/
import static java.lang.Math.*;
import java.util.Scanner;

public class RandomNumbers1 extends Object
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the number of random numbers to be generated: ");
		int number = input.nextInt();
		System.out.print("\nPlease enter the low: ");
		int low = input.nextInt();
		System.out.print("\nPlease enter the high: ");
		int high = input.nextInt();
		int[]randomNumbers = new int[number];
		for(int i = 0; i < randomNumbers.length; i++)
			randomNumbers[i] = myRandNumGen(low, high);
		System.out.print("Please enter the desired Numbers Per Line: ");
		int numbersPerLine = input.nextInt();
		printArray(randomNumbers, numbersPerLine);
	}
	public static int myRandNumGen(int low, int high)
	{
		return (int)(random()*(high - low + 1)) + low;
	}
	public static void printArray(int[] array, int N)
	{
		System.out.println("The elements of the array are: ");
		for (int i = 0; i < array.length; i++)
		{
			if(i % N == 0)
				System.out.print("\n\t" + array[i]);
			else
				System.out.print("\t" + array[i]);
		}
	}
}