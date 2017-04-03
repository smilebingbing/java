package pojo;

/** 保存路网的每一个路口   */
public class RouteHop {

	private int latitude;
	private int longtitude;
	private long index;
	
	public RouteHop(int latitude, int longtitude) {
		this.latitude = latitude;
		this.longtitude = longtitude;
	}
	
	
	public int getLatitude() {
		return latitude;
	}


	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}


	public long getIndex() {
		return index;
	}


	public void setIndex(long index) {
		this.index = index;
	}


	public void setLongtitude(int longtitude) {
		this.longtitude = longtitude;
	}


	public int getLongtitude() {
		return longtitude;
	}


	
	
}
