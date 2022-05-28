package com.onurgundogdu.pool;

import com.onurgundogdu.create.Main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PoolMain {
    public static void main(String[] args) {
        {
            ExecutorService executorService = Executors.newFixedThreadPool(2);
            for (int i = 1; i <=5 ; i++) {
                executorService.submit(new Worker(String.valueOf(i),i));
            }
            executorService.shutdown();
            System.out.println("Submit to Tasks");
            try {
                executorService.awaitTermination(1, TimeUnit.DAYS); // wait at the most one day
            } catch (InterruptedException e) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,e);
            }
            System.out.println("Successfully completed.");
        }

    }
}
