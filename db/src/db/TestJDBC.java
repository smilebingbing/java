package db;
import java.sql.*;
public class TestJDBC {

	static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
	static final String DB_URL="jdbc:mysql://localhost/a";
	
	static final String USER="root";
	static final String PASS="root";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conn=null;
		Statement stmt=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connecting to database");;
			conn=DriverManager.getConnection(DB_URL,USER,PASS);
			
			System.out.println("Creating statment...");
			stmt=conn.createStatement();
			String sql="select LINENO,DATE,TIME,LONGITUDE,LATITUDE,SPEED from taxi5";
			ResultSet rs=stmt.executeQuery(sql);
			
			while(rs.next()){
				String lineno=rs.getString("lineno");
				String date=rs.getString("date");
				String time=rs.getString("time");
				String longitude=rs.getString("longitude");
				String latitude=rs.getString("latitude");
				String speed=rs.getString("speed");
				
				System.out.print("lineno: "+lineno);
				
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			
		}
		
	}

}