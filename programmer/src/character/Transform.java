package character;
//像素翻转
/*
 * 有一副由NxN矩阵表示的图像，这里每个像素用一个int表示，请编写一个算法，
 * 在不占用额外内存空间的情况下(即不使用缓存矩阵)，将图像顺时针旋转90度。
 * 
 * 顺时针旋转90度，先按主对角线翻转，然后用垂直轴左右翻转
 */
import java.util.*;

public class Transform {
    public int[][] transformImage(int[][] mat, int n) {
        // write code here
    	for(int i = 0; i < n ;i ++){
    		for(int j = i + 1; j < n;j ++){
    			int temp = mat[j][i];
    			mat[j][i] = mat[i][j];
    			mat[i][j] = temp;
    		}
    	}
    	for(int i = 0; i < n/2;i ++){
    		for(int j = 0; j < n;j ++){
    			int temp = mat[j][n-i-1];
    			mat[j][n-i-1] = mat[j][i];
    			mat[j][i] = temp;
    		}
    	}
    	return mat;
    }
}
