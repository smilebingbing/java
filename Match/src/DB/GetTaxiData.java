package DB;

import java.sql.Connection;

import pojo.MapMatrix;

public class GetTaxiData {

	public double averageSpeed(int gridX,int gridY) {
		Connection conn = GetConn.getTaxiConn();
		
		gridX * 45 + MapMatrix.Start_Latitude = T_Latitude;
		gridY * 45 + MapMatrix.Start_Longtitude = T_Longtitude;
		String date = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new java.util.Date(T_UTCTime * 1000));
		
		
		String sql = "SELECT T_Speed FROM data1 WHERE data > " ;
		//data 的范围 和 矩阵的范围
		
		//(date between(时间一) and (时间二)) and (矩阵的范围)
		
		//短日期类型默认为Time为00:00:00,当使用between作限制条件时,想实现功能，使用连接字串的形式，在短日期后面把时间补全
		// date between ' "+类.Value.ToShortDateString()+"00:00:00 ' and ' " +类.Value.ToShortDateString()+"23:59:59'
	}
}
