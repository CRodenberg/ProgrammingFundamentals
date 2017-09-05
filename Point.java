/*
Point.java
Programmer: Cole Rodenberg Date: 1/18/2016
Description: This is a class designed for a point with coordinates(x,y),
constructors for initialization, mutators to change the point, accessors
to access this information, and methods to print the point, calculate the
distance from the origin, and the angle.*/

public class Point extends Object{
	private double x;
	private double y;
	public Point(){
		x = 0.0;
		y = 0.0;
	}
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	public Point(Point b){
		x = b.x;
		y = b.y;
	}
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	public void setX(double x){
		this.x = x;
	}
	public void setY(double y){
		this.y = y;
	}
	public void setPoint(double x, double y){
		this.x = x;
		this.y = y;
	}
	public void print(){
		System.out.print("The Point has the coordinates: (");
		System.out.print(x);
		System.out.print(", ");
		System.out.print(y);
		System.out.print(").");
	}
	public double distance(){
		double d;
		d = Math.sqrt(x*x + y*y);
		return d;
	}
	public double angle(){
		double a;
		a = Math.atan(y/x);
		return a;
	}
}//End Point Class