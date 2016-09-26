
public class sushu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         for(int i=101;i<201;i++){
        	 boolean flag=true;
        	 int k=(int)(Math.sqrt(i));
        	 for(int j=2;j<k+1;j++){
        		 if(i%j==0){
        			 flag=false;
        			 break;
        		 }
        		 
        	 }
        	 if(flag==true){
    			 System.out.println(i+" ");
    			
    		 }
        	 
        	 
         }
	}

}
