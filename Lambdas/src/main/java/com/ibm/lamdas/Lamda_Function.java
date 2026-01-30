package com.ibm.lamdas;
interface Printer{
	public void printing(String name,int count);
}
class Process{
	public void execute(String printerName, int count, Printer printer) {
		printer.printing(printerName,count);
	}
}
public class Lamda_Function {
	public static void main(String[] args) {
		Process process=new Process();
//		process.execute("HP", (pname)->System.out.println(pname+" Printer printing"));
//		process.execute("Canon",(pname)-> System.out.println(pname+" Printer printing"));
//		process.execute("HP",System.out::println);
//		process.execute("Canon", (name)->System.out.println(name+" is printing"));
		process.execute("HP", 5,Lamda_Function::printIt);
		process.execute("Canon", 10, (name,count)-> System.out.println(name+"printing"+count+" pages"));
	}
	static void printIt(String name,int count) {
		System.out.println(name+"printer printing "+count+" pages");
	}
}
