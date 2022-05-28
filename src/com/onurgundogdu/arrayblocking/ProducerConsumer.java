package com.onurgundogdu.arrayblocking;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProducerConsumer {

    Random random= new Random();
    BlockingQueue<Integer> queue=new ArrayBlockingQueue<>(10);

    public void produce()
    {
        while(true)
        {
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException exception)
            {
                Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE,null,exception);
            }
            try {
                Integer value = random.nextInt(100);
                System.out.println("Produces..."+value);
                queue.put(value);
            } catch (InterruptedException e) {
                Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE,null,e);
            }
        }
    }

}
