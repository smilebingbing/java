package com.atguigu.java2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import org.junit.Test;

//TCP编程例一：   ------客户端给服务端发送信息。服务端输出信息到控制台上
//网络编程就是Socket编程
public class TestTCP1 {

	//客户端
	@Test
	public void client(){
		Socket socket=null;
		OutputStream os=null;
		try {
			//1. 创建一个Socket的对象，通过构造器指明服务端的IP地址，以及其接收程序的端口号
			socket = new Socket(InetAddress.getByName("127.0.0.1"), 9091);
			//2. getOutputStream():发送数据，方法返回OutputStream的对象
			os = socket.getOutputStream();
			//3.具体的输出过程
			os.write("我是客户端，请多关照".getBytes());
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//关闭相应的流和Socket对象
			if(os!=null){
				try {
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(socket!=null){
				try {
					socket.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		
		
	}
	
	//服务端
	@Test
	public void server(){
		ServerSocket ss=null;
		Socket s=null;
		InputStream is=null;
		try {
			//创建一个ServerSocket对象，通过构造器指明自身的端口号
			ss = new ServerSocket(9091);
			//调用其accept()方法，返回一个Socket对象
			s = ss.accept();;
			//3. 调用Socket对象的getInputStream()获取一个从客户端发送过来的输入流
			is = s.getInputStream();
			//4. 对获取的输入流进行的操作
			byte[] b=new byte[20];
			int len;
			while((len=is.read(b))!=-1){
				String str=new String(b,0,len);
				System.out.println(str);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//5. 关闭相应的流以及Socket、ServerSocket的对象
			if(is!=null){
				try {
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(s!=null){
				try {
					s.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}if(ss!=null){
				try {
					ss.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		
	}
	
}
