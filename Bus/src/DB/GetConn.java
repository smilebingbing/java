package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConn {

	private static String BusUrl = "jdbc:mysql://219.216.78.15:3306/a";
	private static String TaxiUrl = "jdbc:mysql://219.216.78.247:3306/taxi";
	private static String RoadHopUrl = "jdbc:mysql://219.216.78.247:3306/road"; 
	
	public static Connection getBusConn() {
	    String driver = "com.mysql.jdbc.Driver";
	    String username = "root";
	    String password = "root";
	    Connection conn = null;
	    try {
	        Class.forName(driver); //classLoader,加载对应驱动
	        conn = (Connection) DriverManager.getConnection(BusUrl, username, password);
	    } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return conn;
	}

	
	public static Connection getTaxiConn() {
	    String driver = "com.mysql.jdbc.Driver";
	    String username = "root";
	    String password = "root";
	    Connection conn = null;
	    try {
	        Class.forName(driver); //classLoader,加载对应驱动
	        conn = (Connection) DriverManager.getConnection(TaxiUrl, username, password);
	    } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return conn;
	}
	
	public static Connection getRoadHopConn() {
	    String driver = "com.mysql.jdbc.Driver";
	    String username = "root";
	    String password = "root";
	    Connection conn = null;
	    try {
	        Class.forName(driver); //classLoader,加载对应驱动
	        conn = (Connection) DriverManager.getConnection(RoadHopUrl, username, password);
	    } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return conn;
	}
}
