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
	
	public List<Integer> ShortestPath(int start1,int start2,int end1,int end2,TrafficException te) {     //璐熻矗璋冪敤鏈�煭璺緞绠楁硶   骞朵笖鍋氬嚭鐩稿簲鐨勭被鍨嬭浆鎹�
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
			System.out.println("FindPath.ShortestPath()娌℃壘鍒拌捣濮嬬偣");
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
				System.out.println("FindPath.ShortestPath() 娌℃壘鍒板紓甯稿搴旂偣");
			}
			
			
			for(int i = 0;i < MapMatrix.TOTAL_ROADHOPS;i ++) {
				roadnet[i][name] = Double.MAX_VALUE;
				roadnet[name][i] = Double.MAX_VALUE;
			}
		}
		return Dijkstra(start,end);
	}
	
	
	
	public List<Integer> Dijkstra(int start,int end) {
		List<Integer> caled = new ArrayList<Integer>();
		List<Integer> doingcal = new LinkedList<Integer>();
		for(int i = 0;i < MapMatrix.TOTAL_ROADHOPS;i ++) {
			doingcal.add(i);
		}
		double[][] cache = new double[MapMatrix.TOTAL_ROADHOPS][2];     //0鍙蜂綅瀛樺綋鍓嶆渶鐭殑璺緞锛�鍙蜂綅瀛樼殑鏄笂涓�釜浠庡摢閲岃繃鏉ョ殑
		Arrays.fill(cache, new int[]{Integer.MAX_VALUE,0});
		List<Integer> curr;
		Queue<Integer> que = new LinkedList<Integer>();
		que.add(start);
		while(que != null) {
			int temp = que.poll();
			curr = new ArrayList<Integer>();
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
		List<Integer> resu = new ArrayList<Integer>();
		int flag = end;
		while(true) {
			flag = (int)cache[flag][1];
			resu.add(flag);
			if(flag == start) {
				break;
			}
		}
		System.out.println("褰撳墠鎺ㄦ柇鍑烘渶鐭矾寰勪负" + resu);
		return resu;
	}
}
