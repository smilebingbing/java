package recursive;
/*
 * 矩阵M * N
 * 时间复杂度 O (M * N)
 * 空间复杂度O (M * N)
 */
public class MatrixPathSum {

	public int minPathSum(int [][] m){
		if(m == null || m.length == 0 || m[0] == null || m[0].length == 0){
			return 0;
		}
		int [][] dp = new int[m.length][m[0].length];
		int row = m.length;
		int col = m[0].length;
		dp[0][0] = m[0][0];
		for(int i = 1;i < col;i ++){
			dp[0][i] = dp[0][i - 1] + m[0][i];
		}
		for(int i = 1;i < row;i ++){
			dp[i][0] = dp[i - 1][0] + m[i][0];
		}
		for(int i = 1;i < col; i ++){
			for(int j = 1;j < row; j ++){
				dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1]) + m[i][j];
			}
		}
		return dp[row - 1][col - 1];
	}
}