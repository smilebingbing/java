import java.util.Scanner;


public class plus {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
          System.out.println("请输入基本数字:");
          Scanner s=new Scanner(System.in);
          int a=s.nextInt();
          System.out.println("请输入数字的长度:");
          int b=s.nextInt();
          int sum=0;
          int temp=0;
          for(int i=0;i<b;i++){
        	  temp=temp*10+a;
        	  System.out.println(temp);
        	  sum=sum+temp;
        	  
          }
          System.out.println("结果为:"+sum);
	}

}
