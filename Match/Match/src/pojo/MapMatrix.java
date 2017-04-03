package pojo;
/**  本类定义了沈阳市的路网     ，以矩阵表示         其中每个格子代表距离是5米，沈阳市包括5173*5173个网格 */
public class MapMatrix {         //路网的矩阵
	
	public static final long End_Latitude = 41866897;
	public static final long Start_Longtitude = 123308823;
	public static final long Start_Latitude = 41723817;
	public static final long End_Longtitude = 123541596;
	public static final int Degree = 45;
	
	
	public final static int TOTAL_ROADHOPS = 10000;       //定义了跳数，最多的路口
	public static int[][] roadhopnames = new int[TOTAL_ROADHOPS][2];
	
	
	static long[][] Map = new long[5173][5173];
	
	
}
