import java.util.Scanner;


public class sortmaxmin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
       System.out.println("请输入三个整数：");
       Scanner s=new Scanner(System.in);
       int x=s.nextInt();
       int y=s.nextInt();
       int z=s.nextInt();
       if(compare(x,y)){
    	   if(compare(y,z)){
    		   System.out.println("the result is:"+z+" "+y+" "+x);
      	   }
    	   else{
    		   System.out.println("the result is:"+y+" "+z+" "+x);
    	   }
       }
       else{
    	   if(compare(y,z)){
    		   if(compare(x,z)){
    			   System.out.println("the result is:"+z+" "+x+" "+y);
    		   }
    		   else{
    			   System.out.println("the result is:"+x+" "+z+" "+y);
    		   }
    	   }
    	   else{
    		   System.out.println("the result is:"+x+" "+y+" "+z);
    		   
    	   }
       }
       
	}

	private static boolean compare(int x, int y) {
		// TODO Auto-generated method stub
		boolean flag=true;
		flag=x>=y?true:false;
		return flag;
	}

}
