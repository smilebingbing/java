package pojo;

import java.util.Date;



/**公交车数据帧，每一帧代表一个GPS数据*/
public class BusDataByTime {   

	private int lineNO;
	private double longitude;
	private double latitude;
	private double speed;
	private Date time;
	private int nextPort;
	
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
	public int getNextPort() {
		return nextPort;
	}
	public void setNextPort(int nextPort) {
		this.nextPort = nextPort;
	}


}
