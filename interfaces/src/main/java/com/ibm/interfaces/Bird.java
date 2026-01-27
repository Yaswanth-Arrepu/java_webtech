package com.ibm.interfaces;

public class Bird implements Flyer {

	@Override
	public void takeoff() {
		System.out.println("Bird takeoff");

	}

	@Override
	public void land() {
		System.out.println("Bird landed");

	}

	@Override
	public void fly() {
		System.out.println("Bird flying");

	}

}
