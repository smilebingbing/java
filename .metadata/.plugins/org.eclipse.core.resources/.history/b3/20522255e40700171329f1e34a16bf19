package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import pojo.BusDataByTime;

public class GetBusData {
	private static int offset = 0;
	
	public static void main(String[] args) {
		List<BusDataByTime> list = GetBusData.getData();
		for(int i = 0;i < list.size();i ++) {
			System.out.println(list.get(i));
		}
	}
	public static List<BusDataByTime> getData( ) {
	    Connection conn = GetConn.getConn();
	    String sql = "select * from taxi5 where LINENO = '139' limit 10 offset ?;";
	    PreparedStatement pstmt;
	    BusDataByTime bd;
	    List<BusDataByTime> list = new ArrayList<>();
	    try {
	        pstmt = (PreparedStatement)conn.prepareStatement(sql);
	        pstmt.setInt(1, offset);
	        ResultSet rs = pstmt.executeQuery();
	        offset += 10;
	        //System.out.println("============================");
	        
	        while (rs.next()) {
	        	bd = new BusDataByTime();
	        	bd.setLatitude(rs.getInt(1));
	        	String[] strs = rs.getString(2).split("-"); //date
	        	String[] strs2 = rs.getString(3).split(":");   //time
//	        	System.out.println(rs.getString(2));
//	        	System.out.println(rs.getString(3));
	        	Calendar gc = new GregorianCalendar();
	        	gc.set(Calendar.YEAR, Integer.parseInt(strs[0]));
	        	gc.set(Calendar.MONTH, Integer.parseInt(strs[1]));
	        	gc.set(Calendar.DAY_OF_MONTH, Integer.parseInt(strs[2]));
	        	gc.set(Calendar.HOUR, Integer.parseInt(strs2[0]));
	        	gc.set(Calendar.MINUTE, Integer.parseInt(strs2[1]));
	        	gc.set(Calendar.SECOND, Integer.parseInt(strs2[2]));
	        	Date date = gc.getTime();
	        	//SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
	        	//System.out.println(format.format(date));

	        	bd.setTime(date);
	        	bd.setLongitude(rs.getDouble(4));
	        	bd.setLatitude(rs.getDouble(5));
	        	bd.setSpeed(rs.getLong(6));
	        	list.add(bd);
	        }
	        
	        
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return list;
	}
}
