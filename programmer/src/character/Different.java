package character;

import java.util.*;

public class Different {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(checkDifferent(str));
	}
	
    /*public static boolean checkDifferent(String iniString) {
        // write code here
    	char [] ch = iniString.toCharArray();
    	if(ch == null){
    		return true;
    	}
    	boolean [] bool = new boolean[256];
    	for(int i = 0; i < ch.length; i ++){
    		if(bool[ch[i]]){
    			return false;
    		}
    		bool[ch[i]] = true;
    	}
    	return true;
    }*/
	public static boolean checkDifferent(String iniString){
		if(iniString.length() > 256){
			return false;
		}
		for(int i = 0; i < iniString.length(); i ++){
			for(int j = i + 1; j < iniString.length(); j ++){
				if(iniString.charAt(i) == iniString.charAt(j)){
					return false;
				}
			}
		}
		return true;
	}
}