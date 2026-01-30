package com.ibm.thread;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
class Task1 implements Runnable{
	int count;
	Task1(int count){
		this.count=count;
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread()+"-->"+count);
		// TODO Auto-generated method stub
	}
	
}
public class Schedulerexecution {
	public static void main(String[] args) {
		int vCPUs=Runtime.getRuntime().availableProcessors();
		System.out.println(vCPUs);
		ScheduledExecutorService service=Executors.newScheduledThreadPool(vCPUs);
		System.out.println(new Date());
//		service.scheduleAtFixedRate( new Task1(2), 10, 5, TimeUnit.SECONDS);
		service.scheduleWithFixedDelay((new Task1(4)), 10, 5, TimeUnit.SECONDS);
		System.out.println("The End");
	}
}
