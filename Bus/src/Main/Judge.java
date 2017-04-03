package Main;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

import javax.sound.sampled.Port;

import DB.GetTaxiData;
import pojo.BusDataByTime;
import pojo.BusPort;
import pojo.PortList327;
import pojo.TrafficException;

public class Judge {
	
	static Queue<BusDataByTime> que = new LinkedList<BusDataByTime>();     //每次添加一次数据，就计算一次
	public BusDataByTime IsTrafficJam() {
		Iterator<BusDataByTime> iter = que.iterator();
		double averageSpeed = 0;
		BusDataByTime data = null;
		while(iter.hasNext()) {
			data = iter.next();
			averageSpeed += data.getSpeed();
		}
		util.Collections.Print(que);
		averageSpeed /= que.size();
		
		System.out.printf("%.4f",averageSpeed);          //////////////////////////////////////////
		System.out.println();
		if(averageSpeed >= 3) {
			return null;
		}
		return data;
	}
	
	
	public boolean addBusDataByTime(BusDataByTime data) {     //加入队列  ，是返回true or  return false
		if(data instanceof BusDataByTime) {
			pull();
			que.offer(data);
			BusDataByTime data1 = IsTrafficJam();
			if(data1 != null) {
				ResuTrafficException(data1,1);//////////////////这里需要改              没有计算flag          //执行另一个线程
				System.out.println("拥堵");
			}
			System.out.println(data.getTime());
			return true;
		} else {
			return false;
		}
	}
	
	
	public TrafficException ResuTrafficException(BusDataByTime data,int flag) {     //flag 为+1或-1             //没有计算到头的事情，也没有计算flag
		TrafficException te = new TrafficException();
		te.addBusPort(PortList327.list.get(data.getNextPort()-1));
		double averageTaxi = 10;
		int[] resu;
		int nextport = data.getNextPort() + flag;
		while(averageTaxi < 5) {
			resu = PortList327.getLonglongitudelatitudeGridByIndex(nextport);
			averageTaxi = GetTaxiData.averageSpeed(resu[0], resu[1], data.getTime());
			nextport += flag;
			te.addBusPort(PortList327.list.get(nextport-1));
		}
		
		return te;
	}
	
	
	
	public void pull() {
		if(que.size() >= 700) {
			System.out.println("取出了数据");
			que.remove();
		} 
	}
}
