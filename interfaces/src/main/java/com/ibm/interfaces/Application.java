package com.ibm.interfaces;

public class Application
{
	public void permissionToLand(Flyer flyer) {
		flyer.land();
		flyer.takeoff();
	}
	public void permissiontosail(Sailer sailer) {
		sailer.sail();
	}
	public static void main( String[] args )
	{
		Application application=new Application();
		Airplane airplane=new Airplane();
		application.permissionToLand(airplane);
		Sailplane sailplane=new Sailplane();
		application.permissionToLand(sailplane);
		application.permissiontosail(sailplane);
	}
}