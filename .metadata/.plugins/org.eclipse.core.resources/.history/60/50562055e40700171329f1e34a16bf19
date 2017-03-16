package producer;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import DB.GetBusData;
import pojo.BusDataByTime;
 
/**
 * 生产者线程
 * 
 */
public class Producer implements Runnable {
 
    public Producer(BlockingQueue<BusDataByTime> queue) {
        this.queue = queue;
    }
 
    public void run() {
        new Random();
        while (true) {
            //System.out.println("正在读取数据...");
            List<BusDataByTime> list = GetBusData.getData();
            long time = 0;
            for(int i = 0;i < list.size() -1;i ++) {
            	//time =  (list.get(i).getTime().getTime()-list.get(i+1).getTime().getTime());
            	queue.offer(list.get(i));
            	//System.out.println("放入数据：" + list.get(i));
            	Random r = new Random();
            	time = r.nextInt(5) * 1000;///////要修改
            	//System.out.println(time/1000);
	            try {
					Thread.sleep(time);
				} catch (InterruptedException e) {
					System.out.println(e);
				}
            } 
            
            
        }
    } 
 
 
    public void stop() {
        isRunning = false;
    }
 
    private volatile boolean      isRunning               = true;
    private BlockingQueue<BusDataByTime> queue;
    private static AtomicInteger  count                   = new AtomicInteger();
    private static final int      DEFAULT_RANGE_FOR_SLEEP = 1000;
 
}