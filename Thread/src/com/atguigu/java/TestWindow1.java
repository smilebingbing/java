package com.atguigu.java;

//模拟火车站三个窗口售票，开启三个窗口售票，总票数为100张
//第二种线程同步的方法
//同步方法
// 将操作共享数据的方法声明为synchronized。即此方法为同步方法，
//能够保证当其中一个线程执行此方法时，其它线程在外等待直至此线程执行完此方法。
// 同步方法的锁: this(默认当前对象)
class Window extends Thread{
	static int ticket =100;
	
	public void run(){
		while(true){
			show();
		}
	}
	
	public synchronized void show(){//写法错误,同步方法中的锁为当前对象this,而在该程序中，this:w1,w2,w3
		
			if(ticket>0){
				System.out.println(Thread.currentThread().getName()+"售票，票号为:"+ticket--);
			}
		}
	
 }

public class TestWindow1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Window w1=new Window();
		Window w2=new Window();
		Window w3=new Window();
		
		w1.setName("窗口1");
		w2.setName("窗口2");
		w3.setName("窗口3");
		
		w1.start();
		w2.start();
		w3.start();
	}

}



/*
 * class Window2 extends Thread{
 * static int ticket=100;
 *         static Object obj=new Object();
 * public void run(){
 * while(true){
 *          synchronized(obj){
 * if(ticket>0){
 * 		System.out.println(Thread.currentThread().getName()+":"+ticket--);
 * }
 * }
 * }
 * 
 * 
*/