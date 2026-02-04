package com.ibm.Annotation;

import java.lang.reflect.Constructor;

public class Application
{
	public static void main( String[] args )
	{
		//process class annotation
		Class<CustomAnnotationUsage> clazz = CustomAnnotationUsage.class;
		CustomAnnotation classAnn = clazz.getAnnotation(CustomAnnotation.class);
		if(classAnn != null) {
			printAnntation("class",classAnn);
		}
		try {
			//process constructor annotation
			Constructor<?>  constructor = clazz.getDeclaredConstructor();
			CustomAnnotation constAnn = constructor.getAnnotation(CustomAnnotation.class);
			if(constAnn != null) {
				printAnntation("Constuctor",constAnn);
			}
		}catch (NoSuchMethodException e) {
			//TODO Auto- generated catch block
			e.printStackTrace();
		}catch(SecurityException e) {
			//TODO AUTO- generated catch block
			e.printStackTrace();
		}
	}
	private static void printAnntation( String element, CustomAnnotation ann)
	{
		// TODO Auto-generated method stub
		System.out.println("Element: " +element);
		System.out.println("Name: " +ann.name());
		System.out.println("Duration: " +ann.duration());
		System.out.println("Version: " +ann.version());
		System.out.println();
		

	}
}