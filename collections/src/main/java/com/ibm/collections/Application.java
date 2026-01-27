package com.ibm.collections;
import java.util.ArrayList;
import java.util.Iterator;
public class Application
{
	public static void main( String[] args )
	{
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("Y");
		arrayList.add("a");
		arrayList.add("s");
		arrayList.add("h");
		arrayList.add("u");
		Iterator<String> iterator=arrayList.iterator();
		while(iterator.hasNext()) {
			String text=iterator.next();
			System.out.print(text);
		}
	}
}