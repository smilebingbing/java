
public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
/*
		String s="AsssABBBBcc&^%adfsfdCCOOKK99876 _haHA";
      int lowercount=0;
      int upcount=0;
      int other=0;
      /*
      for(int i=0;i<s.length();i++){
    	  char c=s.charAt(i);
    	  if(c>='a'&c<='z'){
    		  lowercount++;
    	  }else if(c>='A'&c<='Z'){
    		  upcount++;
    	  }else{
    		  other++;
    	  }
      }
      */
      
      
      /*
      String sL="abcdefghijklmnopqrstuvwxyz";
      String sU="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      for(int i=0;i<s.length();i++){
    	  char c=s.charAt(i);
    	  if(sL.indexOf(c)!=-1){
    		  lowercount++;
    	  }else if(sU.indexOf(c)!=-1){
    		  upcount++;
    	  }else{
    		  other++;
    	  }
      }
      	
      	
      	*/
/*
      for(int i=0;i<s.length();i++){
    	  char c=s.charAt(i);
    	  if(Character.isLowerCase(c)){
    		  lowercount++;
    	  }else if(Character.isUpperCase(c)){
    		  upcount++;
    	  }else{
    		  other++;
    	  }
      }
      
      System.out.println(lowercount+" "+upcount+" "+other);
	
*/
		
	/*
		String s="sunjavahpjavaokjavajjavahahajavajavagoodjava";
		String sToFind="java";
		int count=0;
		int index=s.indexOf(sToFind);
		if(index!=-1){
			count++;
		}
		s=s.substring(index+sToFind.length());
		while(s.indexOf(sToFind)!=-1){
			index=s.indexOf(sToFind);
			s=s.substring(index+sToFind.length());
			count++;
		}
		
		System.out.println(count);	
	
	*/
		

		String s="sunjavahpjavaokjavajjavahahajavajavagoodjava";
		String sToFind="java";
		int count=0;
		int index=-1;
		
		while((index=s.indexOf(sToFind))!=-1){
			s=s.substring(index+sToFind.length());
			count++;
		}
		System.out.println(count);
	}

}
