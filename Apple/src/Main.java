import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		while(sc.hasNext()){
		int M=sc.nextInt();
		int N=sc.nextInt();
		System.out.println(count(M,N));
	}
}
public static int count(int m,int n){
	if(m<0){
		return 0;
	}
	if(n==1||m==1){
		return 1;
	}
	if(m<n){
	   return count(m,m);
	}else if(m>n){
	//放苹果有两种情况，一种是有盘子为空，一种是每个盘子中都有苹果
	return count(m,n-1)+count(m-n,n);
	}
	else {
		return count(m,n-1)+1;
  }
}
}