import java.util.Scanner;


public class flower {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         for(int i=100;i<1000;i++){
        	 int a=i%10;
        	 int b=(int)(i/100);
        	 int c=((int)(i/10))%10;
        	 if(a*a*a+b*b*b+c*c*c==i){
        		 System.out.println("水仙花数是:"+i);
        	 }
        			 
         }
         
	}

}
