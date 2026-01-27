package com.ibm.exceptionshandling;

public class Application
{
	public static void main( String[] args )
	{
		try {
			System.out.println(Integer.parseInt(args[0])/Integer.parseInt(args[1]));
		}
		catch(ArrayIndexOutOfBoundsException exception){
			System.out.println("You need to provide the 2 numbers to run error free");
		}
		catch(ArithmeticException exception) {
			System.out.println("you can't divide with zero");
		}
		catch(NumberFormatException exception) {
			System.out.println("You need to give proper numbers as arguments");
		}
		catch(Exception exception) {
			System.out.println("Unknown Exception occured");
		}
		System.out.println("This is the End...");
	}
}