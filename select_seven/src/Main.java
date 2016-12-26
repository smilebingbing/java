import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		while(sc.hasNext()){
			Integer N=sc.nextInt();
			int count=0;
			for(Integer i=1;i<=N;i++){
				if(i%7==0)
					count++;
				else if(i.toString().contains("7"))
					count++;
			}
			System.out.println(count);
		}
	}

}
