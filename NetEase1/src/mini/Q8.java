package mini;

import java.util.Scanner;
public class Q8{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int apple = sc.nextInt();
		int resu = new Q8().minBag(apple);;
		if(resu < 1000) {
			System.out.println(resu);
		} else {
			System.out.println("-1");
		}
		sc.close();
	}
	
	public int minBag(int apple) {
		if(apple == 8 || apple == 6) {
			return 1;
		}
		else if(apple < 8 && apple != 6) {
			return 100000;
		}
		else {
			int apple6 =  minBag(apple - 6) + 1;
			int apple8 = minBag(apple - 8) + 1;
			return apple6 >= apple8 ? apple8 : apple6;
		}
	}
	
}