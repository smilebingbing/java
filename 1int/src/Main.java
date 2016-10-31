import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int num=0;
		String s=Integer.toBinaryString(a);
		for(int i=s.length()-1;i>=0;i--){
			if(s.charAt(i)==49){
		
				num++;
			}
		}
		System.out.println(num);
	}

}
