package com.ibm.thread;
class Runner implements Runnable{
	@Override
	public void run() {
		System.out.println("THe current Thread is "+Thread.currentThread());
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class Application
{
	public static void main( String[] args )
	{
//		Thread mainthread=Thread.currentThread();
//		System.out.println(mainthread);
//		try {
//			mainthread.sleep(1000);
//		}catch(InterruptedException e) {
//			e.printStackTrace();
//		}
		
		
//		Runner runner=new Runner();
//		Thread thread1=new Thread();
//		System.out.println(thread1);
//		System.out.println(thread1.getState());
//		thread1.start();
//		System.out.println(thread1.getState());
//		try {
//			Thread.sleep(1000);
//		}catch(InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println(thread1.getState());
//		System.out.println("The End");
		
		Runner runner=new Runner();
		Thread producer=new Thread(runner,"producer");
		Thread consumer=new Thread(runner,"consumer");
		producer.start();
		consumer.start();
		try {
		Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(producer.getState());
		System.out.println(consumer.getState());
		System.out.println("The End");
		
		
	}
}