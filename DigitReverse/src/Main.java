import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);

		while(sc.hasNext()){
			
			String a=sc.nextLine();
			for(int i=a.length()-1;i>=0;i--){
				System.out.print(a.charAt(i));
			}
		}
		
		
	}

}
