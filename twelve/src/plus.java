import java.util.Scanner;


public class plus {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
          System.out.println("�������������:");
          Scanner s=new Scanner(System.in);
          int a=s.nextInt();
          System.out.println("���������ֵĳ���:");
          int b=s.nextInt();
          int sum=0;
          int temp=0;
          for(int i=0;i<b;i++){
        	  temp=temp*10+a;
        	  System.out.println(temp);
        	  sum=sum+temp;
        	  
          }
          System.out.println("���Ϊ:"+sum);
	}

}
