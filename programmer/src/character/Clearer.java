package character;
import java.util.*;
//清除行列
/*
 * 请编写一个算法，若N阶方阵中某个元素为0，则将其所在的行与列清零。
 */
public class Clearer {
    public int[][] clearZero(int[][] mat, int n) {
        // write code here
    	if(mat == null){
    		return mat;
    	}
    	boolean [] rows = new boolean[n];
    	boolean [] cols = new boolean[n];
    	for(int i = 0; i < n; i ++){
    		for(int j = 0; j < n; j ++){
    			if(mat[i][j] == 0){
    				rows[i] = true;
    				cols[j] = true;
    			}
    		}
    	}
    	for(int i = 0; i < n; i ++){
    		for(int j = 0; j < n; j ++){
    			if(rows[i] || cols[j]){
    				mat[i][j] = 0;
    			}
    		}
    	}
    	return mat;
    }
}