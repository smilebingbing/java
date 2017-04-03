package Main;


import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

import pojo.BusDataByTime;
import streamdata.Server;
import streamdata.Client;


public class Exec {
	public static void main(String[] args) throws InterruptedException {
		
		
        BlockingQueue<BusDataByTime> queue = new LinkedBlockingQueue<>();
 
        Client producer1 = new Client(queue);  //new多个线程

        Server consumer = new Server(queue);
 
        // 借助Executors
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(producer1);   //启动多个线程
        service.execute(consumer);

      
        
        
        service.shutdown();
    }
}
