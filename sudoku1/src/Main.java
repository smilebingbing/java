import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int [][] A=new int[9][9];
			for(int i=0;i<9;i++){
				for(int j=0;j<9;j++){
					A[i][j]=sc.nextInt();
				}
			}
			System.out.println(solveSudoku(A));
			
		}
	}
	private static String solveSudoku(int [][] sudoku){
		
	}

}
