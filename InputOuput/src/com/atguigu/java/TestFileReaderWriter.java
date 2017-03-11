package com.atguigu.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

public class TestFileReaderWriter {
/*
 * 对于非文本文件（视频文件、音频文件，图片），只能使用字节流
 */
	//使用FileReader FileWriter可以实现文本文件的复制
	@Test
	public void testFileReaderWriter(){
		//1.输入流对应的文件一定要存在，否则抛异常
		FileReader fr=null;
		FileWriter fw=null;
		try{
			File src=new File("hello.txt");
			File dest=new File("hello4.txt");
			//2.
			fr=new FileReader(src);
			fw=new FileWriter(dest);
			//3.
			char[] c=new char[25];
			int len;
			while((len=fr.read(c))!=-1){
				fw.write(c, 0, len);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(fw!=null){
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(fr!=null){
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
				
	}
	@Test
	public void testFileReader(){
		FileReader fr=null;
		try {
			File file=new File("hello.txt");
			fr = new FileReader(file);
			char[] c=new char[30];
			int len;
			while((len=fr.read(c))!=-1){
				String str=new String(c, 0, len);
				System.out.print(str);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(fr!=null){
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
