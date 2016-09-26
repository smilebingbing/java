import java.io.*;
import java.sql.Date;
public class TestPrintStream2 {
   public static void main(String args[]){
	   String s=null;
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	   try{
		   FileWriter fw=new FileWriter("D:\\WorkSpace\\logfile.log",true);
		   PrintWriter log=new PrintWriter(fw);
		   while((s=br.readLine())!=null){
			   if(s.equalsIgnoreCase("exit")) break;
			   System.out.println(s.toUpperCase());
			   log.println("-----");
			   log.println(s.toUpperCase());
			   log.flush();
		   }
		   
		   log.println("==="+new Date(0)+"===");
		   log.flush();
		   log.close();
		 
	   }catch(IOException e){
		   e.printStackTrace();
	   }
	   
	   
   }
}
