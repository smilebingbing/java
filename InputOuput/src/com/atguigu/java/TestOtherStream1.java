package com.atguigu.java;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.Test;

public class TestOtherStream1 {
	@Test
	public void testOtherStream(){
		DataInputStream dis=null;
		try{
			dis=new DataInputStream(new FileInputStream(new File("hello.txt")));
//			byte[] b=new byte[20];
//			int len;
//			while((len=dis.read(b))!=-1){
//				System.out.println(new String (b,0,len));
//			}
			
			String str=dis.readUTF();
			System.out.println(str);
			boolean b=dis.readBoolean();
			System.out.println(b);
			long l=dis.readLong();
			System.out.println(l);
			
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(dis!=null){
				try {
					dis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch bl ock
					e.printStackTrace();
				}
			}
		}
	}
	//数据流:用来处理基本数据类型、String 字节数组的数据
	//DataInputStream DataOutputStream
	@Test
	public void testData(){
		DataOutputStream dos=null;
		try {
			FileOutputStream fos=new FileOutputStream("data.txt");
			dos=new DataOutputStream(fos);
			
			dos.writeUTF("我我我我");
			dos.writeBoolean(true);
			dos.writeLong(143566772);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(dos!=null){
				try {
					dos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
	

	//打印流：  字节流：PrintStream   字符流   ：PrintWriter
	@Test
	public void printStreamWriter(){
		
		//创建打印输出流，设置为自动刷新模式（写入换行符或字节'\n'时都会刷新输出缓冲区）
		PrintStream ps=null;
		try {
			FileOutputStream fos=new FileOutputStream(new File("print.txt"));
			ps = new PrintStream(fos,true);
			if(ps!=null){//把标准输出流改成文件
				System.setOut(ps);
			}
			for(int i=0;i<=255;i++){
				System.out.println((char)i);
				if(i%50==0){
					System.out.println();
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(ps!=null){
				ps.close();
			}
		}
		
	}
}
