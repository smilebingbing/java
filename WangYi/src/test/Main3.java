package test;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dcdnum = sc.nextInt();
		int x[] = new int[10000];
		int y[] = new int[10000];
		int gx,gy,walkTime,taxiTime,mintime;
		for (int i = 0; i < dcdnum; i++) {
			x[i] = sc.nextInt();
		}
		for (int i = 0; i < dcdnum; i++) {
			y[i] = sc.nextInt();
		}
		gx = sc.nextInt();gy = sc.nextInt();
		walkTime=sc.nextInt();taxiTime=sc.nextInt();
		
		//walk
		mintime=(Math.abs(gx)+Math.abs(gy))*walkTime;
		//taxi
		for(int i = 0 ;i<dcdnum;i++){
			int walkt,taxit;
			walkt=(Math.abs(x[i])+Math.abs(y[i]))*walkTime;
			taxit=(Math.abs(gx-x[i])+Math.abs(gy-y[i]))*taxiTime;
			if((walkt+taxit)<mintime){
				mintime=walkt+taxit;
			}
		}
		System.out.println(mintime);
		
	}

}
