package com.atguigu.mvcapp.test;

import java.sql.SQLException;

import org.junit.Test;

import com.atguigu.mvcapp.db.JdbcUtils;
import java.sql.Connection;

public class JdbcUtilsTest {

	@Test
	public void testGetConnection() throws SQLException{

		Connection connection =JdbcUtils.getConnection() ;
		System.out.println(connection);
	
	}

}
