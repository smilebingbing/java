package com.atguigu.java;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class TestBuffered {

	@Test
	public void testBufferedReader(){
		BufferedReader br=null;
		try {
			File file=new File("hello.txt");
			FileReader fr=new FileReader(file);
			br = new BufferedReader(fr);
			
//			char[] c=new char[1024];
//			int len;
//			while((len=br.read(c))!=-1){
//				String str=new String(c,0,len);
//				System.out.println(str);
//				
//			}
			String str;
			while((str=br.readLine())!=null){
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(br!=null){
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	//使用BufferedInputStream和BufferedOutputStream实现非文本文件的复制
	@Test
	public void testBufferedInputOutputStream(){
		
		BufferedInputStream bis=null;
		BufferedOutputStream bos=null;
		try {
			//1.提供读入、写出的文件
			File file1=new File("1.jpg");
			File file2=new File("2.jpg");
			//2. 先创建相应的节点流:FileInputStream,FileOutputStream
			FileInputStream fis=new FileInputStream(file1);
			FileOutputStream fos=new FileOutputStream(file2);
			//3. 将创建的节点流的对象作为形参传递给缓冲流的构造器中
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			//4. 具体的实现文本文件复制的操作
			byte[] b=new byte[1024];
			int len;
			while((len=bis.read(b))!=-1){
				bos.write(b,0,len);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//5. 关闭相应的流
			if(bos!=null){
				try {
					bos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(bis!=null){
				try {
					bis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		}
		
		
	}
}
