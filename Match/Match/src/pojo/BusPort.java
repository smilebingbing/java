package pojo;




/**公交车站数据     ，代表每一个公交车站    ，信息包括经纬度，序号以及名称（主键为Index） */
public class BusPort {

	private double latitude;
	private double longtitude;
	private int index;
	private String portName;

	
	public BusPort(double latitude, double longtitude, int index, String portName) {
		super();
		this.latitude = latitude;
		this.longtitude = longtitude;
		this.index = index;
		this.portName = portName;
	}

	

	public double getLatitude() {
		return latitude;
	}



	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}



	public double getLongtitude() {
		return longtitude;
	}



	public void setLongtitude(double longtitude) {
		this.longtitude = longtitude;
	}



	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getPortName() {
		return portName;
	}

	public void setPortName(String portName) {
		this.portName = portName;
	}
	
	
	
}