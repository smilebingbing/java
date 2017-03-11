package com.atguigu.fileupload.servlet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;



public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String fileName;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//1.获取请求信息：
		//InputStream in =request.getInputStream();
		
		//Reader reader = new InputStreamReader(in);
		//BufferedReader bufferedReader =new BufferedReader(reader);
		
		//String str=null;
		//while((str=bufferedReader.readLine())!=null){
			//System.out.println(str);
		//}
		
		//1. 得到FileItem的集合
		
		// Create a factory for disk-based file items
		DiskFileItemFactory factory = new DiskFileItemFactory();

		// Set factory constraints
		factory.setSizeThreshold(1024*500);
		File tempDirectory = new File("d:\\tempDirectory");
		factory.setRepository(tempDirectory);

		// Create a new file upload handler
		ServletFileUpload upload = new ServletFileUpload(factory);

		// Set overall request size constraint
		upload.setSizeMax(1024*1024*5);

		// Parse the request
		List<FileItem> items;
		try {
			items = upload.parseRequest(request);
			for(FileItem item:items){
				if(item.isFormField()){
					String name=item.getFieldName();
					String value=item.getString();
					
					System.out.println(name+":"+value);
				}else{
					String fieldName = item.getFieldName();
				    String fileName = item.getName();
				    String contentType = item.getContentType();
				    long sizeInBytes = item.getSize();
				   	
				    
				    InputStream in =item.getInputStream();
					byte [] buffer = new byte[1024];
					int len =0;
					
					fileName = "d:\\files\\"+fileName;
					System.out.println(fileName);
					
					OutputStream out= new FileOutputStream(fileName);
					while((len=in.read(buffer))!=-1){
						out.write(buffer, 0, len);
					}
					
					out.close();
					in.close();
				} 
				}
				
		}catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//2. 遍历items: 若是一个一般的表单域，打印信息
		
			
			
		}
		//若是文件域，则把文件保存到d:\\files目录下 
		
	}


