package com.onurgundogdu.pool;

public class PoolMain {
    public static void main(String[] args) {
        Thread thread1=new Thread(new Worker("1",1));
        Thread thread2=new Thread(new Worker("2",2));
        Thread thread3=new Thread(new Worker("3",3));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread3.start();

        try {
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Successfully Completed..");

    }
}
