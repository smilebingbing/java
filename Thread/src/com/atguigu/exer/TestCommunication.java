package com.atguigu.exer;

/*
 * 线程通信问题
 * wait(): 释放资源，处于等待状态，一旦一个线程执行到wait()，就释放当前的锁
 * notify(): 唤醒wait()线程
 * notifyAll(): 唤醒所有线程
 * 
 * 三个关键字都要在同步代码块或同步方法中
 * 交替打印1-100
 */

class PrintNum implements Runnable{
	int num=1;
	public void run(){
		while(true){
			synchronized (this) {
				notify();
			if(num<=100){
				try {
					Thread.currentThread().sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+":"+num);
				num++;
			}else{
				break;
			}
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	  }
	}
}




public class TestCommunication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintNum p =new PrintNum();
		Thread t1=new Thread(p);
		Thread t2 = new Thread(p);
		
		t1.setName("甲");
		t2.setName("乙");
		
		t1.start();
		t2.start();
	}

}
