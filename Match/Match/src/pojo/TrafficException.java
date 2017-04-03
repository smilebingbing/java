package pojo;

import java.util.ArrayList;
import java.util.List;


/**公交车异常      表示为一个站牌的List    */
public class TrafficException {

	private List<BusPort> exceptionList;
	
	public TrafficException() {
		exceptionList = new ArrayList<>();
	}

	public void addBusPort(BusPort bp) {
		exceptionList.add(bp);
	}

	public List<BusPort> getExceptionList() {
		return exceptionList;
	}
		
}
