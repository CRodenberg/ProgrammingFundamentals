//A3N6.java

//Programmer: Cole Rodenberg Date: 9/22/15

import java.util.*;

public class A3N6
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[]args)
	{
		//Introduction Section
		double a,b,c,discriminate,rootOne,rootTwo,discriminateRoot;
		System.out.print("This program uses the quadratic formula to find the roots of a given quadratic  function.\n\n\n");
		System.out.println("\t\tThe Function: f(x) = ax^2+bx+c\n\n");
		
		//Input Section
		System.out.print("Please enter the value of a: ");
		a = console.nextDouble();
		System.out.println();
		System.out.print("Please enter the value of b: ");
		b = console.nextDouble();
		System.out.println();
		System.out.print("Please enter the value of c: ");
		c = console.nextDouble();
		System.out.println();
		
		//Computation Section
		discriminate = (b*b)-(4*a*c);
		rootOne = (-b + Math.sqrt(discriminate))/(2*a);
		rootTwo = (-b - Math.sqrt(discriminate))/(2*a);
		
		//Output Section with some computing
		System.out.println("The function: " + a + "x^2 + " + b + "x +" + c + "\n\n");
		if(a==0)
		{
			System.out.println("This is not a quadratic function.");
		}
		else if(discriminate == 0)
		{
			System.out.print("The equation has a single repeated root.");
		}
		else if(discriminate > 0)
		{
			System.out.print("Has two real roots equal to: ");
			System.out.printf("%.6f",(-b/(2*a)));
		}
		else if(discriminate < 0)
		{
			System.out.print("Has two complex roots.");
		}
	}
}