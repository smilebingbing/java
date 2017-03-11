package com.atguigu.mvcapp.db;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.*;
import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * JDBC操作的工具类
 * @author Bing
 *
 */
public class JdbcUtils {

	/**
	 * 释放Connection连接
	 * @param connection
	 */
	public static void releaseConnection(Connection connection){
		
		try{
			if(connection !=null){
				connection.close();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	private static DataSource dataSource =null;
	
	
	static{
		//数据源只能被创建一次
		dataSource = new ComboPooledDataSource("mvcapp");
	}
	
	/**
	 * 返回数据源的一个Connection 对象
	 * @return
	 * @throws SQLException
	 */
	public static Connection getConnection() throws SQLException{
		return dataSource.getConnection();
	}
}
