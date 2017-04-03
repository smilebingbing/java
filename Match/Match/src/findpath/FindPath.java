package findpath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import DB.GetRoadHops;
import pojo.BusPort;
import pojo.MapMatrix;
import pojo.TrafficException;
import util.GridToLatt;

public class FindPath {

	double[][] roadnet = GetRoadHops.getRoadNet();
	
	public List<Integer> ShortestPath(int start1,int start2,int end1,int end2,TrafficException te) {     //负责调用最短路径算法   并且做出相应的类型转换
		int start = -1;
		int end = -1;
		
		for(int i = 0;i < MapMatrix.roadhopnames.length;i ++) {
			if(MapMatrix.roadhopnames[i][0] == start1 && MapMatrix.roadhopnames[i][1] == start2) {
				start = i;
			} else if(MapMatrix.roadhopnames[i][0] == end1 && MapMatrix.roadhopnames[i][1] == end2){
				end = i;
			}
		}
		if(start == -1 || end == -1) {
			System.out.println("FindPath.ShortestPath()没找到起始点");
		}
		
		List<BusPort> errList = te.getExceptionList();
		for(BusPort bs : errList) {
			int[] resu = GridToLatt.getGrid(bs.getLongtitude(), bs.getLatitude());
			int name = -1;
			for(int i = 0;i < MapMatrix.roadhopnames.length;i ++) {
				if(MapMatrix.roadhopnames[i][0] == resu[0] && MapMatrix.roadhopnames[i][1] == resu[1]) {
					name = i;
				} 
			}
			if(name == -1) {
				System.out.println("FindPath.ShortestPath() 没找到异常对应点");
			}
			
			
			for(int i = 0;i < MapMatrix.TOTAL_ROADHOPS;i ++) {
				roadnet[i][name] = Double.MAX_VALUE;
				roadnet[name][i] = Double.MAX_VALUE;
			}
		}
		return Dijkstra(start,end);
	}
	
	
	
	public List<Integer> Dijkstra(int start,int end) {
		List<Integer> caled = new ArrayList<>();
		List<Integer> doingcal = new LinkedList<>();
		for(int i = 0;i < MapMatrix.TOTAL_ROADHOPS;i ++) {
			doingcal.add(i);
		}
		double[][] cache = new double[MapMatrix.TOTAL_ROADHOPS][2];     //0号位存当前最短的路径，1号位存的是上一个从哪里过来的
		Arrays.fill(cache, new int[]{Integer.MAX_VALUE,0});
		List<Integer> curr;
		Queue<Integer> que = new LinkedList<>();
		que.add(start);
		while(que != null) {
			int temp = que.poll();
			curr = new ArrayList<>();
			for(int i = 0;i < MapMatrix.TOTAL_ROADHOPS;i ++) {
				if(roadnet[temp][i] != Double.MAX_EXPONENT && !caled.contains(i)) {
					curr.add(i);
				}
			}
			for(int i = 0;i < curr.size();i ++) {
				que.add(curr.get(i));
				if(cache[curr.get(i)][0] < roadnet[temp][curr.get(i)]) {
					cache[curr.get(i)][0] = roadnet[temp][curr.get(i)];
					cache[curr.get(i)][1] = curr.get(i);
				}
			}
			caled.add(temp);
		}
		List<Integer> resu = new ArrayList<>();
		int flag = end;
		while(true) {
			flag = (int)cache[flag][1];
			resu.add(flag);
			if(flag == start) {
				break;
			}
		}
		System.out.println("当前推断出最短路径为" + resu);
		return resu;
	}
}
