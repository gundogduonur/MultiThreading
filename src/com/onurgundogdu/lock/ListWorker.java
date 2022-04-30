package com.onurgundogdu.lock;

import java.util.ArrayList;
import java.util.Random;

public class ListWorker {
    Random random=new Random();
    ArrayList<Integer> list1=new ArrayList<Integer>();
    ArrayList<Integer> list2=new ArrayList<Integer>();

    public synchronized void  addList() throws InterruptedException {
            Thread.sleep(1);
            list1.add(random.nextInt(100));
    }
    public synchronized void addList2() throws InterruptedException {
        Thread.sleep(1);
        list2.add(random.nextInt(100));
    }
    public void addValue() throws InterruptedException {
        for (int i = 0; i < 1000; i++) {
            addList();
            addList2();
        }
    }
    public void runThread()
    {
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    addValue();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    addValue();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        long start=System.currentTimeMillis();
        thread1.start();
        thread2.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("List1 : "+list1.size()+" List2: "+list2.size());
        long finish=System.currentTimeMillis();
        System.out.println("Elapsed time: "+(finish-start));

    }


}
