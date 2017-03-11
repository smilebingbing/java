package model;

import java.util.ArrayList;
import java.util.List;

public class Solution3 {
	/*public int FirstNotRepeatingChar(String str) {
	 * if(str.length()==0){
	 * 		return -1;
	 * }
		for(int i=0;i<str.length();i++){
			Character c=str.charAt(i);
			if(str.lastIndexOf(c)==str.indexOf(c)){
				return i;
			}
		}
		
		return -1;
    }*/
	
	public int FirstNotRepeatingChar(String str){
		if(str == null ||str.length()==0){
			return -1;
		}
		List<Character> list=new ArrayList<>();
		for(int i=0;i<str.length();i++){
			if(!list.contains(str.charAt(i))){
				list.add(Character.valueOf(str.charAt(i)));
			}else{
				list.remove(Character.valueOf(str.charAt(i)));
			}
		}
		if(list.size()==0){
			return -1;
		}else{
			return str.indexOf(list.get(0));
		}
	}
}
