
public class TestSync implements Runnable{
   Timer timer=new Timer();
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TestSync test=new TestSync();
        Thread t1=new Thread(test);
        Thread t2=new Thread(test);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
	}
    public void run(){
    	timer.add(Thread.currentThread().getName());
    	
    }
}


class Timer{
    private static int num=0;
	public void add(String name) {
		// TODO Auto-generated method stub
		synchronized (this){
		num++;
		try{
			Thread.sleep(1);
		}catch(InterruptedException e){
			System.out.println(name+",你是第"+num+"个使用timer的线程");
		}
           
	}
	
}
}