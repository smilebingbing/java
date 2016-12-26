import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		while(sc.hasNext()){
			Integer number=sc.nextInt();
			int count=0;
			for(int i=0;i<=number;i++){
				if(self_num(i))
					count++;
				
			}
			System.out.println(count);
		}
	}
		static boolean self_num(Integer num){
			Integer num2=num*num;
			int len=num.toString().length();
			String result=num2.toString().substring(num2.toString().length()-len);
			if(result.equals(num.toString())) 
				return true;
			else 
				return false;
				
		}
	

}
