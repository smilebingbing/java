import java.util.Scanner;


public class zhengshu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("请输入一个正整数:");
         Scanner s =new Scanner(System.in);
         int x=s.nextInt();
         while(x!=1){
        	 for(int i=2;i<=x;i++){
        		 if(x%i==0){
        			 x=x/i;
        			 if(x==1){
        				 System.out.print(i);
        			 }
        			 else{
        				 System.out.print(i+"*");
        			 }
        		 }
        	 }
         }
	}

}
