
public class TestThread {
       public static void main(String args[]){
    	   Runner1 r=new Runner1();
    	   //r.run();  //调用方法
    	   Thread t=new Thread(r);  //新线程
    	   t.start();
    	   
    	   
    	   for(int i=0;i<100;i++){
    		   System.out.println("Thread:-----"+i);
    	   }
       }
}


class Runner1 implements Runnable{
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println("Runner1:"+i);
		}
	}
}
//创建和启动线程的方法一，实现Runnable接口
//方法二，继承Thread,这时直接执行r.start();

