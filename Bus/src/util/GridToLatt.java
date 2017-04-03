package util;

import pojo.MapMatrix;

public class GridToLatt {

	public static int[] getGrid(double longt,double latit) {
		int[] resu = new int[2];
		longt *= 1000000;
		latit *= 1000000;
		longt = (long)longt - MapMatrix.Start_Longtitude;
		latit = (long)latit - MapMatrix.Start_Latitude;
		resu[0] = (int)(longt / 45);
		resu[1] = (int)(latit / 45);
		
		return resu;
	}
}
