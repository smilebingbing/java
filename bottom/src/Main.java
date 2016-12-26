import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n;
		while(sc.hasNext()){
		    n=sc.nextInt();
			if(n==0){
				return ;
			}else{
                System.out.println(result(n));
			}
		}
	}

	private static int result(int n){
		int m=0;
		if(n<=1){
			return 0;
		}else if(n==2){
			return 1;
		}else if(n==3){
			return 1;
		}else{
			m=n/3;
			return m+result(n-m*3+m);
			
		}
	}
}
