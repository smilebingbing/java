package com.atguigu.java;
//使用实现Runnable接口的方式   售票
//该方法线程不安全，会出现重票，错票
//线程同步的第一种方法
//同步代码块
//synchronized(共享监视器){
//需要被同步的代码块(即为操作共享数据的代码)
//}
//1.共享数据：多个线程共同操作的同一个数据
//2.同步监视器：由一个类的对象来充当，哪个线程获取此监视器，谁就执行大括号里被同步的代码，俗称：锁
//注：所有线程共用同一把锁

//第二种方法：同步方法






class Window3 implements Runnable{
	int ticket=100;
	Object obj=new Object();

	public void run(){
		while(true){
			synchronized (obj) {
			if(ticket>0){
				System.out.println(Thread.currentThread().getName()+":"+ticket--);
			}else{
				break;
			}
		}
	  }
	}
}




public class TestWindow2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Window3 w=new Window3();
		Thread t1=new Thread(w);
		Thread t2=new Thread(w);
		Thread t3=new Thread(w);
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
