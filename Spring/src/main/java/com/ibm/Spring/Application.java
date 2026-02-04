package com.ibm.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ibm.Spring.beans.SpellChecker;
import com.ibm.Spring.beans.TextEditor;
import com.ibm.Spring.Services.OrderService;
import com.ibm.Spring.beans.BeanConfig;
import com.ibm.Spring.beans.JavaCollections;
import java.util.*;
public class Application
{
	public static void main( String[] args )
	{
//		ApplicationContext context =new ClassPathXmlApplicationContext("Spring.xml");
		
		/*
		 * TextEditor textEditor = (TextEditor)
		 * applicationContext.getBean("textEditor");
		 * 
		 * textEditor.spellCheck();
		 */
		
//		SpellChecker spellChecker1 = (SpellChecker) applicationContext.getBean("spellChecker");
//		
//		SpellChecker spellChecker2 = (SpellChecker) applicationContext.getBean("spellChecker");
//		
//		SpellChecker spellChecker3 = (SpellChecker) applicationContext.getBean("spellChecker");
//		
//		//spellChecker1.CheckSpelling();
//		
//		ClassPathXmlApplicationContext classPathXmlApplicationContext = (ClassPathXmlApplicationContext) applicationContext;
//		classPathXmlApplicationContext.registerShutdownHook();
//		TextEditor texteditor= (TextEditor) context.getBean("textEditor");
//		JavaCollections jc=(JavaCollections) context.getBean("javaCollections");
//		System.out.println("List address");
//		List<String> listAddress=jc.getAddressList();
//		listAddress.forEach(System.out::println);
//		System.out.println("Set Address");
//		Set<String> SetAddress=jc.getAddressSet();
//		SetAddress.forEach(System.out::println);
//		System.out.println("Map address");
//		Map<String,Integer> MapAddress=jc.getAddressMap();
//		MapAddress.forEach((k, v) -> System.out.println(k + " : " + v));
//		System.out.println("Properties address");
//		Properties PropAddress=jc.getAddressProp();
//		PropAddress.forEach((k, v) -> System.out.println(k + " = " + v));
//		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		TextEditor textEditor = (TextEditor) context.getBean("textEditor");
//		textEditor.spellCheck();
//		System.out.println("End");
		ApplicationContext context= new ClassPathXmlApplicationContext("Spring.xml");
//		TextEditor texteditor=(TextEditor)context.getBean("textEditor");
//		texteditor.spellCheck();
		
		OrderService orderService = (OrderService)context.getBean("orderService");
		orderService.makePayment(1000.5);
		System.out.println("End");
	}
		
}