package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import pojo.MapMatrix;

public class GetTaxiData {

	private final static int AREA = 200;
	public static void main(String[] args) {
		GetTaxiData gtd = new GetTaxiData();
		Date d = new Date();
		System.out.println(d);
		
	}
	public static double averageSpeed(int gridX,int gridY,Date date) {    //平均速度
		double speed = 0.0;
		Connection conn = GetConn.getTaxiConn();
		long startlongtitude = (gridX - AREA / 10) * 45 + MapMatrix.Start_Longtitude;
		long startaltitude = (gridY - AREA / 10) * 45 + MapMatrix.Start_Latitude;
		long endlongtitude = (gridX + AREA / 10) * 45 + MapMatrix.Start_Longtitude;
		long endaltitude = (gridY + AREA / 10) * 45 + MapMatrix.Start_Latitude;
		String sql = "SELECT T_SPEED FROM data1 WHERE ;";;
		

		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
//			pstmt.setLong(, x);           //////////////////////////需要写
//			pstmt.setLong(, x);
//			pstmt.setLong(, x);
//			pstmt.setLong(, x);
			ResultSet rs = pstmt.executeQuery();
			
			int flag = 0;
			while(rs.next()) {
				speed += rs.getDouble(1);
				flag ++;
			}
			speed /= flag;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return speed;
			
		
	}
}
