package aaa1;
public class RtException extends Exception{
	public static void throwit(){
		System.out.print("throwit ");
	throw new RuntimeException();
}


	public static void main(String[] aa) {
		// TODO Auto-generated method stub
        try{
        	System.out.print("hello ");
        	throwit();
        	        	
        }catch(Exception re){
        	System.out.print("caught ");
        }finally{
        	System.out.print("finally ");
        	System.out.print("after ");
        }
	}


}

