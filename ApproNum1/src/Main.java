import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		while(sc.hasNext()){
			double a=sc.nextDouble();
            int b=(int)a;
            if(a-b>=0.5){
            	System.out.println(b+1);
            }else{
            	System.out.println(b);
            }
		
		}
	}

}
