package com.atguigu.java;

//创建多线程的方式二: 通过实现的方式

class PrintNum implements Runnable{
	public void run(){
		for(int i=0;i<=100;i++){
			if(i%2==0){
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
		}
	}
}

public class TestThread2 {

	public static void main(String[] args) {
		PrintNum p=new PrintNum();
	//	p.run();
		//要想启动一个多线程，必须调用start()方法
		Thread t1=new Thread(p);
		t1.start();
		
		Thread t2=new Thread(p);
		t2.start();
		
	}
}
