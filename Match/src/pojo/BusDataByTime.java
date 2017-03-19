package pojo;

import java.util.Date;

public class BusDataByTime {   //公交车数据帧

	private int lineNO;
	private double longitude;
	private double latitude;
	private double speed;
	private Date time;
	
	public int getLineNO() {
		return lineNO;
	}
	public void setLineNO(int lineNO) {
		this.lineNO = lineNO;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return speed + "";
	}


}
