package com.ibm.thread;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

// renamed class
class CatchTask implements Runnable 
{

    int count;
    CatchTask(int count) 
    {
        this.count = count;
    }

    @Override
    public void run() 
    {
        System.out.println(Thread.currentThread() + " --> " + count);
    }
}

public class CatchThread 
{

    public static void main(String[] args) 
    {
        int vCPUS = Runtime.getRuntime().availableProcessors();
        
        System.out.println("Available CPUs: " + vCPUS);
        
        ScheduledExecutorService service = Executors.newScheduledThreadPool(vCPUS);
        
        System.out.println("Current time: " + new Date());

        //service.schedule(new ScheduledTask(2), 10, TimeUnit.SECONDS);
        //service.scheduleAtFixedRate(new ScheduledTask(2), 10, 5,TimeUnit.SECONDS); // 10--> inital thread  && 5-->  repeat next threads
        service.scheduleWithFixedDelay(new CatchTask(3),10,5,TimeUnit.SECONDS);
        System.out.println("The End");
    }
}
