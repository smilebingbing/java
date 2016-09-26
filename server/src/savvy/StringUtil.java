package savvy;

public class StringUtil {
   public String reverse(String str){
	   if (str==null)
		   return null;
	   else{
		   char[] result=str.toCharArray();
		   for(int i=0;i*2<result.length;i++){
			   char temp=result[i];
			   result[i]=result[result.length-i];
			   result[result.length-i]=temp;
		   }
		   return new String(result);
	   }
   }
}
