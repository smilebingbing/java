package streamdata;

import java.util.concurrent.BlockingQueue;

import Main.Judge;
import pojo.BusDataByTime;
 
/**
 * 消费者线程
 */
public class Server implements Runnable {
	static int i = 0;
    public Server(BlockingQueue<BusDataByTime> queue) {
        this.queue = queue;
    }
 
    public void run() {
        System.out.println("启动！");
        Judge judge = new Judge();
//        Random r = new Random();
//        boolean isRunning = true;
        try {
            while (true) {
                BusDataByTime data = queue.poll();
                if (null != data) {
                    //System.out.println("拿到数据：" + data);
                	judge.addBusDataByTime(data);
                	System.out.println("第" + i ++ +"个");
                } 
            }
        } catch (Exception e) {
            e.printStackTrace();
           // Thread.currentThread().interrupt();
        } finally {
            //System.out.println("退出消费者线程！");
        }
    }
 
    private BlockingQueue<BusDataByTime> queue;
}