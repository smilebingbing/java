
public class prim {
	public static void main(String[] args) {
		boolean f=false;
         for(int i=101;i<200;i++){
        	 
        	 for(int j=2;j<i+1;j++){
        		 if(i%j==0){
        			 f=false;
        			 break;
        		 }
        		 else{
        			 f=true;
        		 }
         	 }
        	 if(f==true){
        		 System.out.println(i);
        	 }
        	 
         }
	}

}
