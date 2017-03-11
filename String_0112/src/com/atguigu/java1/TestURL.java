package com.atguigu.java1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

//URL:统一资源定位符，一个URL对象，对应着互联网上一个资源
//我们可以通过URL的对象调用其相应的方法，将此资源读取（“下载”）
public class TestURL {
	public static void main(String[] args) throws Exception {
		//1.创建一个URL对象
		URL url=new URL("http://www.baidu.com");//File file =new File("文件的路径")
		
		System.out.println(url.getProtocol());
		
		System.out.println(url.getHost());
		
		System.out.println(url.getPort());
		
		System.out.println(url.getFile());
		
		System.out.println(url.getRef());
		
		System.out.println(url.getQuery());
	
		//如何将服务端的资源读取进来
		InputStream is=url.openStream();
		byte[] b=new byte[20];
		int len;
		while((len=is.read(b))!=-1){
			String str=new String(b,0,len);
			System.out.print(str);
		}
		is.close();
		
		//如果既有数据的输入，又有数据的输出，则考虑使用URLConnection
		URLConnection urlConn=url.openConnection();
		InputStream is1=urlConn.getInputStream();
		FileOutputStream fos=new FileOutputStream(new File("abc.txt"));
		byte[] b1=new byte[20];
		int len1;
		while((len1=is.read(b1))!=-1){
			fos.write(b1,0,len1);
		}
		
		fos.close();
		is1.close();
		
		
		
		
	}

}
