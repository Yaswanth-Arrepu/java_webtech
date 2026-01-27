package com.ibm.objectclass;

import java.awt.Point;

class point{
	public int x;
	public int y;
	@Override
	public boolean equals(Object target) {
		if(target!=null && target instanceof Point) {
			Point point2=(Point)target;
			if(this.x==point2.x && this.y==point2.y) {
				return true;
			}
		}
		return false;
	}
}
public class Application
{
	public static void main( String[] args )
	{
		Point point1=null,point2=null;
		point1=new Point();
		point2=new Point();
		point1.x=2;
		point1.y=3;
		point2.x=2;
		point2.y=3;
		System.out.println(point1==point2);
		System.out.println(point1.equals(point2));
	}
}