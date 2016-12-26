import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		int N =sc.nextInt();
		int [] weight=new int[N];
		int [] nums=new int[N];
		for(int i=0;i<N;i++){
			weight[i]=sc.nextInt();
		}
		for(int i=0;i<N;i++){
			nums[i]=sc.nextInt();
		}
		System.out.println(fama(N,weight,nums));
	}
	
	public static int fama(int n,int [] weight,int[]nums){
		
		
	}

}
