import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		while(sc.hasNext()){
		int A =sc.nextInt();
		int B =sc.nextInt();
		if(A<B){
			int t;
			t=A;
			A=B;
			B=t;
			
		}
		for(int i=B;i<=A*B;i++){
			if(i%A==0&&i%B==0){
                System.out.println(i);
				break;
			}
		}
		}	
	}

}
