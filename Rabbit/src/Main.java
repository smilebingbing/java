import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			System.out.println(count(n));
		
	   }

  }
	public static int count(int n){
		int sum=0;
		if(n==1||n==2){
			return 1;
		}else{
			return count(n-1)+count(n-2);
		}
	}
}