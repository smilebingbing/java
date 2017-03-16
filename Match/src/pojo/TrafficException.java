package pojo;

import java.util.ArrayList;
import java.util.List;

public class TrafficException {   //公交车异常

	private List<BusPort> exceptionList;
	
	public TrafficException() {
		exceptionList = new ArrayList<>();
	}

	public void addBusPort(BusPort bp) {
		exceptionList.add(bp);
	}
	
}
