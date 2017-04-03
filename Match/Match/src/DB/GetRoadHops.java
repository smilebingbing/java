package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

import findpath.FindPath;
import pojo.MapMatrix;


/** 本类从数据库得到路网消息，并返回一个邻接数组*/
public class GetRoadHops {

	
	private static double[][] roadnet = new double[MapMatrix.TOTAL_ROADHOPS][MapMatrix.TOTAL_ROADHOPS];
	
	public static double[][] getRoadNet() {
		Arrays.fill(roadnet, Double.MAX_EXPONENT);
		Connection conn = GetConn.getRoadHopConn();
		String sql = "select * from road;";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			int count = 0;
			while(rs.next()) {
				MapMatrix.roadhopnames[count][0] = rs.getInt(1);
				MapMatrix.roadhopnames[count][1] = rs.getInt(2);
				count ++;
				MapMatrix.roadhopnames[count][0] = rs.getInt(3);
				MapMatrix.roadhopnames[count][1] = rs.getInt(4);
				count ++;
				roadnet[count-2][count-1] = rs.getDouble(5);
				roadnet[count-1][count-2] = rs.getDouble(5);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return roadnet;
	}
}
