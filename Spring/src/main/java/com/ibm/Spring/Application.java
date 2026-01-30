package com.ibm.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ibm.Spring.beans.SpellChecker;


public class Application
{
	public static void main( String[] args )
	{
		ApplicationContext applicationContext =new ClassPathXmlApplicationContext("Spring.xml");
		
		/*
		 * TextEditor textEditor = (TextEditor)
		 * applicationContext.getBean("textEditor");
		 * 
		 * textEditor.spellCheck();
		 */
		
		SpellChecker spellChecker1 = (SpellChecker) applicationContext.getBean("spellChecker");
		
		SpellChecker spellChecker2 = (SpellChecker) applicationContext.getBean("spellChecker");
		
		SpellChecker spellChecker3 = (SpellChecker) applicationContext.getBean("spellChecker");
		
		//spellChecker1.CheckSpelling();
		
		ClassPathXmlApplicationContext classPathXmlApplicationContext = (ClassPathXmlApplicationContext) applicationContext;
		classPathXmlApplicationContext.registerShutdownHook();
	}
}