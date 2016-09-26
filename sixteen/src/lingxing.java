
public class lingxing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         for(int i=1;i<5;i++){
        	 for(int j=0;j<4-i;j++){
        		 System.out.print(" ");
        		
        	 }
        	 for(int k=1;k<=2*i-1;k++){
        		 System.out.print("*");
        	 }
        	 System.out.println(" ");
         }
         for(int x=5;x<8;x++){
        	 for(int y=0;y<x-4;y++){
        		 System.out.print(" ");
        	 }
        	 for(int z=1;z<=15-2*x;z++){
        		 System.out.print("*");
        	 }
        	 System.out.println(" ");
         }
	}

}
