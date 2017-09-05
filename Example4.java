//Example4.java
/*
Programmer: Cole Rodenberg Date: 9/12/15
*/
import java.util.Scanner;

public class Example4
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.print("Please enter five decimal number:");
		float n1 = console.nextFloat();
		float n2 = console.nextFloat();
		float n3 = console.nextFloat();
		float n4 = console.nextFloat();
		float n5 = console.nextFloat();
		System.out.println("\n");
		System.out.println("Your numbers are: ");
		System.out.print(n1 + ", ");
		System.out.print(n2 + ", ");
		System.out.print(n3 + ", ");
		System.out.print(n4 + ", ");
		System.out.print(n5 + ", ");
		
		int n1Int = (int)(n1 + .5); 
		int n2Int = (int)(n2 + .5); 
		int n3Int = (int)(n3 + .5); 
		int n4Int = (int)(n4 + .5);
		int n5Int = (int)(n5 + .5);
		double divNum = 5.0;
		int sum = n1Int + n2Int + n3Int + n4Int + n5Int;
		double avg = sum/divNum;
		System.out.println();
		System.out.print("The sum of the integers is: " + sum + " and the average of the integers is " + avg);
		
	}//End main
}//End class