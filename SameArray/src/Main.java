import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		while(sc.hasNext()){
		    int N =sc.nextInt();
		    if(N<=0){
		    	System.out.println(-1);
		    }else{
		    
			System.out.println(N*2+(N*(N-1)*3)/2);

		    }
		}
		
	}

}
