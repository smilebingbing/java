import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		while(sc.hasNext()){
			int n =sc.nextInt();
			int count=0;
			for(int i=2;i<=n;i++){
				int factor=0;
				for(int j=1;j<i;j++){
					if(i%j==0){
						factor=factor+j;
					}
				}
				if(factor==i){
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
