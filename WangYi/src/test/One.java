package test;
//斐波那契数列  ——————递归方式
import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int sum = 0;
			for(int i = 1;i <= n;i++){
				sum += fabnacci(i);
			}
			System.out.println(sum);
					
	}
	public static int fabnacci(int n){
		if(n <=2){
			return 1;
		}else{
			return fabnacci(n-1) + fabnacci(n-2);
		}
	}
//递推方法
	public static int fabbonacci(int n){
		if(n <= 2){
			return 1;
		}
		int n1 = 1;
		int n2 = 1;
		int res = 0;
		for(int i = 0;i < n-2 ;i++){
			res = n1 + n2;
			n1 = n2;
			n2 = res;
		}
		return res;
		
		
	}
}
