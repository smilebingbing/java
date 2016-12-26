import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			int m=sc.nextInt();
			System.out.println(count(n,m));
			
		}
	}
	private static int count(int n,int m){
		if(n==0||m==0){
			return 1;
		}
		else{
			return count(n-1,m)+count(n,m-1);
		}
	}

}
