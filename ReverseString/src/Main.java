import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		while(sc.hasNext()){
			//next()是遇到空格；nextLine()是遇到回车
		String a=sc.nextLine();
		StringBuilder sb=new StringBuilder(a);
		System.out.println(sb.reverse().toString());
	}
	}
}
