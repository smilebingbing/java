package day_nums;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int year =sc.nextInt();
			int month =sc.nextInt();
			int day = sc.nextInt();
			
			int [] a={31,28,31,30,31,30,31,31,30,31,30,31};
			int [] b={31,29,31,30,31,30,31,31,30,31,30,31};
			if(month<0||month>12||day<=0||day>a[month-1]){
				System.out.println(-1);
				break;
			}
			if(year%4==0 && year%100!=0 ||year%400==0){
				iConverDateToDay(b, month, day);
			}else{
				iConverDateToDay(a, month, day);
			}
			
		}
	}
	
	public static void iConverDateToDay(int [] arr,int month,int day){
		int sum=0;
		for(int i=0;i<month-1;i++){
			sum+=arr[i];
		}
		sum+=day;
		System.out.println(sum);
	}

}
