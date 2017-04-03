package character;
//基本字符串压缩
/*
 * 利用字符重复出现的次数，编写一个方法，实现基本的字符串压缩功能。
 * 比如，字符串“aabcccccaaa”经压缩会变成“a2b1c5a3”。
 * 若压缩后的字符串没有变短，则返回原先的字符串。
 */
import java.util.*;

public class Zipper {
    public String zipString(String iniString) {
        // write code here
    	if(iniString == null){
    		return iniString;
    	}
    	char [] ch = iniString.toCharArray();
    	String res = String.valueOf(ch[0]);
    	int num = 1;
    	for(int i = 1; i < ch.length; i ++){
    		if(ch[i] == ch[i - 1]){
    			num ++;
    		}else{
    			res = res + num + ch[i];
    			num = 1;
    		}
    	}
    	res = res + num;
    	if(res.length() > iniString.length()){
    		return iniString;
    	}else{
    		return res;
    	}
    	
    }
}
