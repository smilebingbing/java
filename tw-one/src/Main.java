import java.util.Scanner;
import java.util.Vector;


public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=0;
		int a=s.nextInt();
		int b=s.nextInt();
		int M,N;
		if(a>b){
			M=b;
			N=a;
		}
		else{
			M=a;
			N=b;
		}
		Vector v=new Vector();
		for(int i=M;i<=N;i++){
			boolean f=true;
			for(int j=2;j<i+1;j++){
				if(i%j==0){
					f=false;
					break;
				}
				
			}
			if(f==true){
				v.add(i);
				x++;
			}
			
			System.out.print(v);
		}
		
	}

}
