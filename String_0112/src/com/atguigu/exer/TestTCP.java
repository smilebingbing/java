package com.atguigu.exer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import org.junit.Test;

//客户端给服务器发送文本，服务端会将文本转成大写再返回给客户端

public class TestTCP {

	//客户端
	@Test
	public void client(){
		
		Socket socket=null;
		OutputStream os=null;
		Scanner scanner=null;
		//4.接收来自于服务端的数据
		InputStream is=null;
		try {
			socket = new Socket(InetAddress.getByName("127.0.0.1"),9090);
			
			os = socket.getOutputStream();
			//3.向服务端发送数据
			//os.write("abc".getBytes());
			System.out.println("请输入多个字符");
			scanner = new Scanner(System.in);
			String str=scanner.nextLine();
			os.write(str.getBytes());
			socket.shutdownOutput();
			
			is = socket.getInputStream();
			byte[] b=new byte[10];
			int len;
			while((len=is.read(b))!=-1){
				String str1=new String(b,0,len);
				System.out.println(str1);
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(is!=null){
				try {
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(scanner!=null){
				scanner.close();
			}
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
		//1.
		ServerSocket ss=null;
		//2.
		Socket s=null;
		//3.接收来自客户端的信息
		InputStream is=null;
		OutputStream os=null;
		try {
			ss = new ServerSocket(9090);
			s = ss.accept();
			is = s.getInputStream();
			//
			byte[] b=new byte[10];
			int len;
			String str=new String();
			while((len=is.read(b))!=-1){
				String str1=new String(b,0,len);
				str+=str1;
			}
			String strUpperCase=str.toUpperCase();
			//4.返回给客户端
			
			os = s.getOutputStream();
			os.write(strUpperCase.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(os!=null){
				try {
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
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
			}
			if(ss!=null){
				try {
					ss.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		//5.
		
		
		
		
	}
}
