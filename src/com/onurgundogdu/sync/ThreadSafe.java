package com.onurgundogdu.sync;

public class ThreadSafe {

    private int count=0;
    public synchronized void counter()
    {
        count++;
    }
    public void runThread() throws InterruptedException {
         Thread thread1=new Thread(new Runnable() {
             @Override
             public void run() {
                 for (int i = 0; i <5000 ; i++) {
                     counter();
                 }
             }
         });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <5000 ; i++) {
                    counter();
                }
            }
        });
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Counter : "+count);
    }
    public static void main(String[] args) throws InterruptedException {
       ThreadSafe threadSafe=new ThreadSafe();
       threadSafe.runThread();
    }
}
