package streamdata;

import java.util.List;
import java.util.Random;
import java.util.concurrent.BlockingQueue;

import DB.GetBusData;
import pojo.BusDataByTime;
 
/**
 * 生产者线程
 * 
 */
public class Client implements Runnable {

    public Client(BlockingQueue<BusDataByTime> queue) {
        this.queue = queue;
    }

    
    public void run() {
        while (true) {
            List<BusDataByTime> list = GetBusData.getData();
            long time = 0;
            for(int i = 0;i < list.size() -1;i ++) {
            	//time =  (list.get(i).getTime().getTime()-list.get(i+1).getTime().getTime());
            	queue.offer(list.get(i));
            	
            	Random r = new Random();
            	time = r.nextInt(5) * 1000;///////要修改
	            try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println(e);
				}
            } 
            
            
        }
    } 

    private BlockingQueue<BusDataByTime> queue;

}