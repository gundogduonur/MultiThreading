package com.onurgundogdu;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread running");
        Printer printer1=new Printer("Printer1");
        Printer printer2=new Printer("Printer2");
        printer1.start();
        printer2.start();
    }
}
