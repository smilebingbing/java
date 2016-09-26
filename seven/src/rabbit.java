
public class rabbit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         long a=1;
         long b=1;
         int i=1;
         for(i=1;i<21;i++){
        	 System.out.print(a+" "+b+" ");
        	 if(i%2==0)
        		System.out.println(" "); 
        	 a=a+b;
        	 b=b+a;
         }
         
	}

}
