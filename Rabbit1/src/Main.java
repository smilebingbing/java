import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			System.out.println(count(n));
		}
	}
	public static int count(int n){
		    if(n<=0){return 0;}
			int [] a=new int[2];
            a[0]=1;
            for(int i=2;i<=n;i++){
            	int temp=a[1];
            	a[1]=a[0]+temp;
            	a[0]=temp;
            }
         return a[0]+a[1];
		}
	

}
