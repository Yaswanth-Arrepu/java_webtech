package com.ibm.interfaces;

public class Sailplane implements Sailer, Flyer {

	@Override
	public void takeoff() {
		System.out.println("Sailplane takeoff");
	}

	@Override
	public void land() {
		System.out.println("Sailplane landed");

	}

	@Override
	public void fly() {
		System.out.println("Sailplane Flying");

	}

	@Override
	public void sail() {
		System.out.println("Sailplane sailing");

	}

	@Override
	public void dock() {
		System.out.println("Sailplane dcoked");

	}

}
