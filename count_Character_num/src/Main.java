import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		while(sc.hasNext()){
			String str=sc.nextLine();
			String ch=sc.nextLine();
			int count=0;
			for(int i=0;i<str.length();i++){
				if(ch.equalsIgnoreCase(String.valueOf(str.charAt(i)))){
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
