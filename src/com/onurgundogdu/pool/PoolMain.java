package com.onurgundogdu.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PoolMain {
    public static void main(String[] args) {
        {
            ExecutorService executorService = Executors.newFixedThreadPool(3);
            for (int i = 1; i <=5 ; i++) {
                executorService.submit(new Worker(String.valueOf(i),i));
            }
            executorService.shutdown();
        }

    }
}
