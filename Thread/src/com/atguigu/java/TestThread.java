package com.atguigu.java;

/*
 * Thread的常用方法
 * 1.start():启动线程并执行相应的run()方法
 * 2. run(): 子线程要执行的代码放入run()方法中
 * 3. currentThread():静态的，调取当前的线程
 * 4. getName():获取此线程的名字
 * 5. setName():设置此线程的名字
 * 6. yield(): 调用此方法的线程释放当前CPU的执行权
 * 7. join(): 在A线程中调用B线程的join()方法，表示：
 * 当执行到此方法，A线程停止执行，直至B线程执行完毕，A线程再接着join()之后的代码执行
 * 8. isAlive(): 判断当前线程是否还存活
 * 9. sleep(long l):显示的让当前线程睡眠l毫秒
 * 10: 线程通信：wait() notify() notifyAll()
 * 
 * 设置线程的优先级
 */



/*
 * 创建一个子线程，完成1-100之间自然数的输出
 * 主线程执行同样的操作
 * 创建多线程的第一种方式：继承java.lang.Thread类
 */
//1. 创建一个继承于Thread的子类
class SubThread extends Thread{
	//2.重写Thread类的run()方法。方法内实现此子线程要完成的功能
	public void run(){
		for(int i=1;i<=100;i++){
			System.out.println(i);
		}
	}
}


public class TestThread {

	public static void main(String[] args) {
		//创建一个子类的对象
		SubThread st=new SubThread();
		//调用线程的start(),启动此线程，调用run()方法
		//一个线程只能执行一次start
		st.start();
		for(int i=1;i<=100;i++){
			System.out.println(i);
		}
	}
}
