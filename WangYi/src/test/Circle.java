package test;
//错的 ————
import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			double r = Math.sqrt(n);
			int count = 0;
			for(int x = 0;x < r;x++){
				double y = Math.sqrt(n - x*x);
				if((int)y == y){
					count++;
				}
				
			}
			System.out.println(count *4 );
		}
	}
}
