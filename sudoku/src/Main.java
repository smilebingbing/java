import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int [][] A=new int [9][9];
			for(int i=0;i<9;i++){
				for(int j=0;j<9;j++){
					A[i][j]=sc.nextInt();
				}
			}
			sudoku(A,0);
			for(int i=0;i<9;i++){
				for(int j=0;j<9;j++){
					if(j!=8){
						System.out.print(A[i][j]+" ");
					}else{
						System.out.print(A[i][j]);
					}
				}
				if(i!=8){
					System.out.println();
				}
			}
			
		}
		private static boolean sudoku(int [][] sd,int index){
			if(index==81)
				return true;
			int x=index/9;
			int y=index%9;
			if(sd[x][y]==0){
				for(int n=1;n<=9;n++){
					sd[x][y]=n;
					if(Checkrow(sd,x,y,n)&&CheckGrid(sd,x,y,n))
						if(sudoku(sd,index+1))
							return true;
					sd[x][y]=0;
				}
			}else
				return sudoku(sd,index+1);
			return false;
			
			
		}
		
		 public static boolean Checkrow(int [][] sd,int x,int y,int n){
			for(int i=0;i<9;i++){
				if(i!=x&&sd[i][y]==n)
					return false;
			}
			for(int j=0;j<9;j++){
				if(j!=y&&sd[x][j]==n)
					return false;
			}
			return true;
		}
		 public static boolean CheckGrid(int [][] sd,int x,int y,int n){
			 for(int i=(x/3)*3;i<(x/3+1)*3;i++){
				 for(int j=(y/3)*3;j<(y/3+1)*3;j++){
					 if(i!=x&&j!=y&&sd[i][j]==n)
						 return false;
				 }
			 }
			 return true;
		 }
	}

}