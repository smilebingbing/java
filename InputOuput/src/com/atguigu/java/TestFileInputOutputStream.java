package com.atguigu.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

/* 1. 流的分类
 * 按照流向的不同：输入流 输出流
 * 按照处理数据的单位的不同：字节流   字符流（处理的文本文件）
 * 按照角色的不同：节点流（直接作用于文件）    处理流
 * 2. IO流的体系
 * 抽象基类			节点流（文件流）
 * InputStream		FileInputStream
 * OutputStream		FileOutputStream
 * Reader			FileReader
 * Writer			FileWriter
 */
public class TestFileInputOutputStream {
	@Test
	public void testcopyFile(){
		long start=System.currentTimeMillis();
		
		String src="";
		String dest="";
		copyFile(src,dest);
		long end=System.currentTimeMillis();
		System.out.println(end-start);
	}
	//实现文件复制的方法
	public static void copyFile(String src,String dest){
				
				//1.提供读入、写出的文件
				File file1=new File(src);
				File file2=new File(dest);
				//2. 提供相应的流
				FileInputStream fis=null;
				FileOutputStream fos=null;
				try{
					fis=new FileInputStream(file1);
					fos=new FileOutputStream(file2);
					//3.实现文件的复制
					byte[] b=new byte[20];
					int len;
					while((len=fis.read(b))!=-1){
						fos.write(b, 0, len);
					}
					
				}catch(Exception e){
					e.printStackTrace();
				}finally{
					if(fos!=null){
						try {
							fos.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					if(fis!=null){
						try {
							fis.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
	}
	//从硬盘读取一个文件，并写入到另一个位置，（相当于文件的复制）
	@Test
	public void testFileInputOutputStream(){
		//1.提供读入、写出的文件
		File file1=new File("hello.txt");
		File file2=new File("hello3.txt");
		//2. 提供相应的流
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try{
			fis=new FileInputStream(file1);
			fos=new FileOutputStream(file2);
			//3.实现文件的复制
			byte[] b=new byte[20];
			int len;
			while((len=fis.read(b))!=-1){
				fos.write(b, 0, len);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(fos!=null){
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(fis!=null){
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	@Test
	public void testFileOutputStream(){
		//创建一个File对象，表明要写入的文件位置
		File file=new File("hello2.txt");
		//创建一个FileOutputStream的对象，将file的对象作为形参传递给FileOutputStream的构造器中
		FileOutputStream fos=null;
		try{
			fos=new FileOutputStream(file);
			fos.write(new String("I love China").getBytes());
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(fos!=null){
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	

	@Test
	public void testFileInputStream2(){
		FileInputStream fis=null;
		try {
			File file=new File("hello.txt");
			fis = new FileInputStream(file);
			byte [] b=new byte[5];//读取到的数据要写入的数组
			int len;//每次读入到byte中字节的长度
			while((len=fis.read(b))!=-1){
//				for(int i=0;i<len;i++){
//					System.out.println((char)b[i]);
//				}
				String str=new String(b,0,len);
				System.out.println(str);
			}
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(fis!=null){
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	//从硬盘存在的一个文件中，读取其内容到程序中，使用FileInputStream
	//要读取的文件一定要存在，否则抛FileNotFoundException
	//使用try-catch的方式处理如下异常更合理
	@Test
	public void testFileInputStream1() throws Exception{
		//1.创建一个File类的对象
		File file=new File("hello.txt");
		//2. 创建一个FileInputStream类的对象
		FileInputStream fis=new FileInputStream(file);
		//3. 调用FileInputStream的方法，实现file文件的读取
		/*
		 * read():读取文件的一个字节。当执行到文件结尾时，返回-1
		 */
//		int b=fis.read();
//		while(b!=-1){
//			System.out.println((char)b);
//			b=fis.read();
//		}
		int b;
		while((b=fis.read())!=-1){
			System.out.println(b);
		}
		//4.关闭相应的流
		fis.close();
	}
}
