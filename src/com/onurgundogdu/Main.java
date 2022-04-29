package com.onurgundogdu;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        // -----Anonymous Class-------
        // Thread printer1=new Thread(new Runnable() {
        //  @Override
        // public void run() {
        //     System.out.println("Thread running");
        //  for (int i = 1; i <5 ; i++) {
        //     try
        //   {
        //      System.out.println("Printing: "+i);
        //     Thread.sleep(1000);
        //   }
        //    catch (InterruptedException interruptedException)
        //     {
        //       Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,interruptedException);
        //     }
        //     }
        //     }
        //     });
        //     printer1.start();

        // -----Only once running thread----
        new Thread(new Runnable() {
            //  @Override
             public void run() {
                 System.out.println("Thread running");
              for (int i = 1; i <5 ; i++) {
                 try
               {
                  System.out.println("Printing: "+i);
                 Thread.sleep(1000);
               }
                catch (InterruptedException interruptedException)
                 {
                   Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,interruptedException);
                 }
              }
                 }
                 })
                 .start();
        // ------Using implement Runnable------
        // System.out.println("Main thread running");
        // Thread printer1=new Thread(new Printer("Printer1"));
        // Thread printer2=new Thread(new Printer("Printer2"));
        // printer1.start();
        // printer2.start();

        // ------Using extends Thread-----
        // Printer printer1=new Printer("Printer1");
        // Printer printer2=new Printer("Printer2");
        // printer1.start();
        // printer2.start();
    }
}
