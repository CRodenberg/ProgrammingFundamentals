/*RandomNumbers.java
Programmer: Cole Rodenberg Date: 11/9/15*/
import static java.lang.Math.*;
import java.util.Scanner;

public class RandomNumbers extends Object
{
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the number of random numbers to be generated: ");
		int number = input.nextInt();
		System.out.print("\nPlease enter the low: ");
		int low = input.nextInt();
		System.out.print("\nPlease enter the high: ");
		int high = input.nextInt();
		int[]randomNumbers = new int[number];
		for(int i = 0; i < randomNumbers.length; i++)
			randomNumbers[i] = (int)(random()*(high - low + 1))+low;
		System.out.print("Please enter the desired Numbers Per Line: ");
		int numbersPerLine = input.nextInt();
		for (int i = 0; i < randomNumbers.length; i++)
		{
			if(i % numbersPerLine == 0)
				System.out.println();
			System.out.print(randomNumbers[i] + " ");
		
	}
}