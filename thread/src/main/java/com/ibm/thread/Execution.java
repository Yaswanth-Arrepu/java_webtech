package com.ibm.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable // add unimplemnted method to the test
{
	int count;
	Task(int count)
	{
		this.count = count;
	}
	@Override
	public void run() 
	{
		System.out.println(Thread.currentThread()+"--->"+count);
		// TODO Auto-generated method stub
	}
	
}

public class Execution 
{
	public static void main(String[] args)
	{
		ExecutorService service = Executors.newFixedThreadPool(4);
		for(int counter =0; counter<10;counter++)
		{
			service.submit(new Task(counter));
		}
	}
	

}
