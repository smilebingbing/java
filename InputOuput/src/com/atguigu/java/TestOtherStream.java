package com.atguigu.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

import org.junit.Test;

public class TestOtherStream {

	/*
	 * 转换流：InputStreamReader OutputStreamWriter
	 * 编码：字符串----->字节数组
	 * 解码：字节数组---->字符串
	 */
	@Test
	public void test1(){
		BufferedReader br=null;
		BufferedWriter bw=null;
		try {
			//解码
			File file=new File("hello.txt");
			FileInputStream fis=new FileInputStream(file);
			InputStreamReader isr=new InputStreamReader(fis,"GBK");
			br = new BufferedReader(isr);
			//编码
			File file1=new File("hello2.txt");
			FileOutputStream fos=new FileOutputStream(file1);
			OutputStreamWriter osw=new OutputStreamWriter(fos, "GBK");
			bw = new BufferedWriter(osw);
			
			String str;
			while((str=br.readLine())!=null){
				bw.write(str);
				bw.newLine();
				bw.flush();
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(bw!=null){
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
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
}
