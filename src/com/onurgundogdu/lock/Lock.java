package com.onurgundogdu.lock;

public class Lock {
    public static void main(String[] args) throws InterruptedException {
        ListWorker worker=new ListWorker();
        worker.runThread();

    }
}
