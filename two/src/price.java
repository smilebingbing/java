import java.util.Scanner;


public class price {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the profit:");
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		int sum;
		if(i<=100000){
			sum=(int) (i*0.1);
		}
		else if(i<=200000&&i>100000){
			sum=(int) ((int)(i-100000)*0.075+10000);
		}
		else if(i<=400000){
			sum=(int)((int)(i-200000)*0.05+17500);
		}
		else if(i<=600000){
			sum=(int)((int)(i-400000)*0.03+27500);
		}
		else if(i<1000000){
			sum=(int)((int)(i-600000)*0.015+33500);
		}
		else{
			sum=(int)((int)(i-1000000)*0.01+39500);
		}
		
		System.out.println("本月利润为："+i+"本月奖金为："+sum);

	}

}
