package com.atguigu.mvcapp.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import com.atguigu.mvcapp.dao.factory.CustomerDAOFactory;

import jdk.internal.org.objectweb.asm.commons.SerialVersionUIDAdder;



public class InitServlet extends HttpServlet {
	
	private static final long serialVersionUID=1L;
	
	@Override
	public void init() throws ServletException {
		CustomerDAOFactory.getInstance().setType("jdbc");
		
		//读取类路径下的switch.properties文件
		InputStream in =getServletContext().getResourceAsStream("/WEB-INF/classes/switch.properties");
		Properties properties = new Properties();
		try {
			properties.load(in);
			//获取switch.properties 的type 属性值
			String type=properties.getProperty("type");
			//赋给了CustomerDAOFactory 的type 属性值
			CustomerDAOFactory.getInstance().setType(type);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
