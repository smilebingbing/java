package com.atguigu.java;
//创建两个子线程，其中一个输出1-100之间的奇数，另一个输出1-100之间的偶数

class subThread1 extends Thread{
	public void run(){
		for(int i=1;i<=100;i++){
			if(i%2==0){
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
		}
	}
}

class subThread2 extends Thread{
	public void run(){
		for(int i=1;i<=100;i++){
			if(i%2!=0){
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
		}
	}
}

public class TestThread1 {

	public static void main(String[] args) {
		subThread1 sd1=new subThread1();
		subThread2 sd2=new subThread2();
		sd1.start();
		sd2.start();
	}
}
