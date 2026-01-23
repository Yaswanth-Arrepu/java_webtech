package com.ibm.encapsulation;
import com.ibm.encapsulation.pack1.base1;

class Student{
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age>0) {
			this.age=age;
		}
		this.age = age;
	}
	
}
public class Application
{
	public static void main( String[] args )
	{
		base1 base1= new base1();
		base1.pubf=1;
	}
}