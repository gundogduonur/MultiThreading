package com.onurgundogdu.pool;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Worker implements Runnable{
    private String name;
    private int taskId;

    public Worker(String name, int taskId) {
        this.name = name;
        this.taskId = taskId;
    }

    @Override
    public void run() {
        try {
            System.out.println("Worker "+name+" TaskID: "+taskId+" started.");
             Thread.sleep(5000);
        }catch (InterruptedException interruptedException)
        {
            Logger.getLogger(Worker.class.getName()).log(Level.SEVERE,null,interruptedException);
        }
        System.out.println("Worker "+name+" TaskID: "+taskId+" finished.");

    }
}
