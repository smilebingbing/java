import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		int m=0;
		int n=0;
		double avg=0;
		while(sc.hasNext()){
			int i=sc.nextInt();
			if(i<0){
				m++;
			}else if(i>0){
				avg+=i;
				n++;
			}
		}
		sc.close();
		System.out.printf("%d\n%g",m,(n==0?0:avg/n));
	}

}
