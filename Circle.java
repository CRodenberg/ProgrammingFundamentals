/*Circle.java
Programmer: Cole Rodenberg Date: 11/22/15*/

public class Circle extends Object{
	private double xCoordinate;
	private double yCoordinate;
	private double radius;
	public Circle(){
		xCoordinate = 0.0;
		yCoordinate = 0.0;
		radius = 1.0;
	}
	public Circle(double x, double y){
		xCoordinate = x;
		yCoordinate = y;
		radius = 1.0;
	}
	public Circle(double x, double y, double r){
		xCoordinate = x;
		yCoordinate = y;
		radius = r;
	}
	public Circle(Circle c){
		xCoordinate = c.xCoordinate;
		yCoordinate = c.yCoordinate;
		radius = c.radius;
	}
	public void setX(double x){
		xCoordinate = x;
	}
	public void setY(double y){
		yCoordinate = y;
	}
	public void setRadius(double r){
		radius = r;
	}
	public void setCircle(double x, double y, double r){
		xCoordinate = x;
		yCoordinate = y;
		radius = r;
	}
	public double getX(){
		return xCoordinate;
	}
	public double getY(){
		return yCoordinate;
	}
	public double getRadius(){
		return radius;
	}
	public double area(){
		return Math.PI*radius*radius;
	}
	public double circumference(){
		return Math.PI*2*radius;
	}
	public String toString(){
		String str;
		str = "The Circle is located at: ";
		str += "(";
		str += xCoordinate;
		str += ",";
		str += yCoordinate;
 		str += ") ";
		str += "and has a radius of ";
		str += radius;
		return str;
	}
	
}