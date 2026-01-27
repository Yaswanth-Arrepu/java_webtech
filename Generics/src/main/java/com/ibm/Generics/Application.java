package com.ibm.Generics;
class Point<Y extends Number>{
	private Y x;
	private Y y;
	public Point(Y x,Y y) {
		this.x=x;
		this.y=y;
	}
	public Y getX() {
		return x;
	}
	public void setX(Y x) {
		this.x=x;
	}
	public Y getY() {
		return y;
	}
	public void setY(Y y) {
		this.y=y;
	}
}
public class Application
{
	public static void main( String[] args )
	{
		Point<Float> point1=new Point<Float>(2.9f,4.8f);
		System.out.println(point1.getX()+" "+point1.getY());
		Point<Integer> point2= new Point<Integer>(2,4);
		System.out.println(point2.getX()+" "+point2.getY());
		point1.setY(4.9f);
		System.out.println(point1.getX()+" "+point1.getY());
	}
}
//Here <Y> is a indication of generics kind