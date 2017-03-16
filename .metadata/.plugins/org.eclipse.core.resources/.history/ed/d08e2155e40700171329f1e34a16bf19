package Main;


import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

import consumer.Consumer;
import pojo.BusDataByTime;
import producer.Producer;


public class Exec {
	public static void main(String[] args) throws InterruptedException {
		
		
        BlockingQueue<BusDataByTime> queue = new LinkedBlockingQueue<>();
 
        Producer producer1 = new Producer(queue);  //new多个线程

        Consumer consumer = new Consumer(queue);
 
        // 借助Executors
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(producer1);   //启动多个线程
        service.execute(consumer);
 
//        Thread.sleep(10 * 1000);
//        producer1.stop();
 
//        Thread.sleep(2000);
        service.shutdown();
    }
}
