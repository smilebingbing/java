import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			int [] res=new int[10000];
			for(int i=0;i<n;i++){
				int key=sc.nextInt();
				res[key]+=sc.nextInt();
			}
			for(int i=0;i<10000;i++){
				if(res[i]!=0){
					System.out.println(i+" "+res[i]);
				}
			}
		}
	}

}
