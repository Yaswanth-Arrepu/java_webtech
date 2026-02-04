package com.ibm.Internationalizers;

//import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.print.attribute.standard.PrinterMessageFromOperator;

public class Application
{
	public static void main( String[] args )
	{
//		double d=98765.4321;
//		NumberFormat nf=NumberFormat.getInstance(Locale.ITALY);
//		NumberFormat nf1=NumberFormat.getInstance(Locale.US);
//		NumberFormat nf2=NumberFormat.getInstance(Locale.CHINA);
//		System.out.println("Italy representation of "+d+" is "+nf.format(d));
//		System.out.println("US representation of "+d+" is "+nf1.format(d));
//		System.out.println("China representation of "+d+" is "+nf2.format(d));
		Locale defaultLocale=new Locale("es");
		System.out.println(defaultLocale);
		System.out.println("defaultLocale");
		System.out.println("Language "+defaultLocale.getLanguage());
		System.out.println("Country "+defaultLocale.getCountry());
		System.out.println("Displayname "+defaultLocale.getDisplayName());
		System.out.println("Variant "+defaultLocale.getVariant());
		ResourceBundle resourceBundle=ResourceBundle.getBundle("Messages",defaultLocale);
		System.out.println("English");
		printMessage(resourceBundle);
	}
	
	private static void printMessage(ResourceBundle bundle) {
		System.out.println("Greeting "+bundle.getString("greetings"));
		System.out.println("Question "+bundle.getString("question"));
		System.out.println("Farewell "+bundle.getString("farewell"));
	}
}