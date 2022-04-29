package com.onurgundogdu;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread running");
       Thread printer1=new Thread(new Printer("Printer1"));
       Thread printer2=new Thread(new Printer("Printer2"));
        printer1.start();
        printer2.start();
        // ------Using extends Thread-----
        // Printer printer1=new Printer("Printer1");
        // Printer printer2=new Printer("Printer2");
        // printer1.start();
        // printer2.start();
    }
}
