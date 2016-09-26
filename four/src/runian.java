import java.util.Scanner;


public class runian {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
       System.out.println("请输入年，月，日：");
       Scanner s=new Scanner(System.in);
       int year=s.nextInt();
       int month=s.nextInt();
       int day=s.nextInt();
       int leap;
       int sum=0;
	if((year%4==0&&year%100!=0)||(year%400==0))
    	   leap=1;
       else
    	   leap=0;
	switch(month){
	       case 1:sum=0;break;
	       case 2:sum=31;break;
	       case 3:sum=59;break;
	       case 4:sum=90;break;
	       case 5:sum=120;break;
	       case 6:sum=151;break;
	       case 7:sum=181;break;
	       case 8:sum=212;break;
	       case 9:sum=243;break;
	       case 10:sum=273;break;
	       case 11:sum=304;break;
	       case 12:sum=334;break;
	       default:System.out.println("data error");break;
	}
	sum=sum+day;
	if(leap==1&&month>=3){
		sum++;
	}
	System.out.println("该日期是一年中的第"+sum+"天");
	
		
       
	}

}
