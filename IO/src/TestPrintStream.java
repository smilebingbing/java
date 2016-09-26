import java.io.*;
public class TestPrintStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String filename=(args[0]);
         if(filename!=null){
        	 list(filename,System.out);
         }
         
	}
         public static void list(String f,PrintStream fs){
        	 try{
        		 BufferedReader br=new BufferedReader(new FileReader(f));
        		 String s=null;
        		 while((s=br.readLine())!=null){
        			 fs.println(s);
        		 }
        		 br.close();
        			
        	 }catch(IOException e){
        		 fs.println("无法读取文件");
        	 }
        	 
         }
	

}
