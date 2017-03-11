package model;

public class Solution2 {
	public String replaceSpace(StringBuffer str) {
    	char [] ch=str.toString().toCharArray();
    	StringBuffer sb=new StringBuffer();
    	for(int i=0;i<ch.length;i++){
    		if(ch[i]==' '){
    			sb.append("%20");
    		}else{
    			sb.append(ch[i]);
    		}
    	}
    	return sb.toString();
    }
}
