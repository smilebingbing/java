package recursive;
//压缩空间的方法
public class MatrixPathSum2 {

	public int minPathSum(int [][] m){
		if(m == null || m.length == 0 || m[0] == null || m[0].length == 0){
			return 0;
		}
		int more = Math.max(m.length, m[0].length);
		int less = Math.min(m.length, m[0].length);
		boolean rowmore = more == m.length;//行数是不是大于列数
		int [] arr = new int[less];
		for(int i = 1;i < less;i ++){
			arr[i] =( rowmore ? m[0][i] : m[i][0] ) + arr[i - 1];
		}
		for(int i = 1;i < more; i ++){
			arr[0] = arr[0] + (rowmore ? m[i][0] : m[0][i]);
			for(int j = 1;j < less; j ++){
				arr[j] = Math.min(arr[j-1], arr[j]) + (rowmore ? m[i][j] : m[j][i]);
			}
		}
		return arr[less - 1];
	}
}