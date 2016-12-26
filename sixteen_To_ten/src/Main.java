import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		while(sc.hasNext()){
			String s =sc.nextLine();
			int i=Integer.parseInt(s.substring(2),16);
			System.out.println(i);
		}
	}

}
