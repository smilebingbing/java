import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int a =sc.nextInt();
			System.out.println(getheight(a));
			System.out.println(getFiveheight(a));
		}
	}
	
	public static double getheight(int a){
		double heightSum=0;
		double high1=a;
		for(int i=1;i<=5;i++){
			heightSum+=high1+high1/2;
			high1=high1/2;
		}
		heightSum-=high1;
		return heightSum;
		
		
	}
	
	public static double getFiveheight(int a){
		double high1=a;
		for(int i=1;i<=5;i++){
			high1=high1/2;
		}
		return high1;
	}
}
