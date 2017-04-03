package recursive;

public class MatrixMul {

	public static void main(String[] args) {

		
	}
	
	public int[][] mulMatrix(int [][] m1 ,int [][] m2){
		int [][] res = new int [m1.length][m2[0].length];
		for(int i = 0;i < m2[0].length;i ++){
			for(int j = 0;j < m1.length;j ++){
				for(int k = 0;k < m2.length; k ++){
					res[i][j] += m1[i][k] * m2[k][j];
				}
			}
		}
		return res;
	}

}
