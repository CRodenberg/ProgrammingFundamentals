/*TestCircle.java
Programmer: Cole Rodenberg Date: 11/22/15*/

public class TestCircle
{
	public static void main(String[] args)
	{
		Circle C1 = new Circle();
		System.out.print("Testing default constructor: \n" + C1.toString());
		
		Circle C2 = new Circle(3.2, 4.5);
		System.out.print("\nTesting second constructor with 2 parameters (3.2,4.5): \n" + C2.toString());
		Circle C3 = new Circle(2.1, 1.4, 5.6);
		System.out.print("\nTesting third constructor with 3 parameters: \n" + C3.toString());
		Circle C4 = new Circle(C3);
		System.out.print("\nTesting fourth constructor with a Circle as a parameter: \n" + C4.toString());
		C1.setX(7.7);
		System.out.print("\nTesting the setX (x should be 7.7): \n" + C1.toString());
		C1.setY(9.7);
		System.out.print("\nTesting the setY (y should be 9.7): \n" + C1.toString());
		C1.setRadius(3.3);
		System.out.print("\nTesting the setRadius (radius should be 3.3): \n" + C1.toString());
		C1.setCircle(1.2,1.5,3.8);
		System.out.print("\nTesting the setCircle (should be 1.2,1.5,3.8): \n" + C1.toString());
		double xTest = C2.getX();
		System.out.print("\nTesting the getX method (should be 3.2): \n" + xTest);
		double yTest = C2.getY();
		System.out.print("\nTesting the getY method (should be 4.5): \n" + yTest);
		double rTest = C2.getRadius();
		System.out.print("\nTesting the getRadius method (should be 1.0): \n" + rTest);
		double aTest = C3.area();
		System.out.print("\nTesting the area method (should be 98.52034): \n" + aTest);
		double cTest = C3.circumference();
		System.out.print("\nTesting the circumference method (should be 35.1858): \n" + cTest);
	}
}