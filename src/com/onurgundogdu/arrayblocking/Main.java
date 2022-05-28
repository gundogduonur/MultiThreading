package com.onurgundogdu.arrayblocking;

public class Main {
    public static void main(String[] args) {
     ProducerConsumer producerConsumer=new ProducerConsumer();
     Thread producer=new Thread(new Runnable() {
         @Override
         public void run() {
             producerConsumer.produce();
         }
     });
     Thread consumer=new Thread(new Runnable() {
         @Override
         public void run() {
             producerConsumer.consume();
         }
     });
    }
}
