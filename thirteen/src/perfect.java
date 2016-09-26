import java.util.Scanner;


public class perfect {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           for(int i=1;i<1001;i++){
        	   int sum=0;
        	   for(int j=1;j<i;j++){
        		   if(i%j==0)
        			   sum=sum+j;
        		   
        		   
        	   }
        	   if(sum==i)
    			   System.out.println("ÍêÊýÎª"+i);
    		   
           }
	}

}
