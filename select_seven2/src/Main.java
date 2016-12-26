import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int N=sc.nextInt();
			int count=0;
			for(int i=1;i<=N;i++){
				int number=i;
				if(number%7==0){
					count++;
				}
				else{
					while(number>0){
						if(number%10==7){
							count++;
							number/=10;
							break;
						}else{
							number/=10;
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}
