package test;

import java.util.Scanner;

public class T2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int taxinum = sc.nextInt();
			int [] X = new int[1000];
			int [] Y = new int[1000];
			for(int i = 0;i < taxinum; i++){
				X[i] = sc.nextInt();
			}
			for(int i = 0;i < taxinum; i++){
				Y[i] = sc.nextInt();
			}
			int gx = sc.nextInt();
			int gy = sc.nextInt();
			int walktime = sc.nextInt();
			int taxitime = sc.nextInt();
			int mintime;
			mintime =(Math.abs(gx) + Math.abs(gy)) * walktime;
			for(int i = 0;i < taxinum;i++){
				int walkt = (Math.abs(X[i]) + Math.abs(Y[i])) * walktime;
				int taxit = (Math.abs(gx - X[i]) + Math.abs(gy - Y[i])) * taxitime;
				if(walkt + taxit < mintime){
					mintime = walkt + taxit;
				}
			}
			System.out.println(mintime); 
		}
	}

}