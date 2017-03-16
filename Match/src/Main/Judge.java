package Main;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

import pojo.BusDataByTime;

public class Judge {
	
	Queue<BusDataByTime> que = new LinkedList<BusDataByTime>();     //每次添加一次数据，就计算一次
	public boolean IsTrafficJam() {
		Iterator<BusDataByTime> iter = que.iterator();
		double averageSpeed = 0;
		while(iter.hasNext()) {
			BusDataByTime data = iter.next();
			averageSpeed += data.getSpeed();
		}
		averageSpeed /= que.size();
		System.out.println(averageSpeed);          //////////////////////////////////////////
		if(averageSpeed >= 3) {
			return false;
		}
		return true;
	}
	
	public boolean addBusDataByTime(BusDataByTime data) {     //加入队列  ，是返回true or  return false
		if(data instanceof BusDataByTime) {
			pull();
			que.offer(data);
			if(IsTrafficJam()) {
				/////计算拥堵范围
			}
			System.out.println(data.getTime());
			return true;
		} else {
			return false;
		}
	}
	
	public void pull() {
		if(que.size() >= 700) {
			que.remove();
		} 
	}
}
