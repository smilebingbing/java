package character;
/*
 * 空格替换
 * 请编写一个方法，将字符串中的空格全部替换为“%20”。假定该字符串有足够的空间存放新增的字符，
 * 并且知道字符串的真实长度(小于等于1000)，同时保证字符串由大小写的英文字母组成。
给定一个string iniString 为原始的串，以及串的长度 int len, 返回替换后的string。
 */
import java.util.*;

public class Replacement {
    public String replaceSpace(String iniString, int length) {
        // write code here
    	//方法一：使用StringBuffer
    	StringBuffer sb = new StringBuffer();
    	for(int i = 0 ;i < iniString.length(); i ++){
    		if(iniString.charAt(i) == ' '){
    			sb.append("%20");
    		}else{
    			sb.append(String.valueOf(iniString.charAt(i)));
    		}
    	}
    	return sb.toString();
    	//方法二：使用字符串的replace方法，从前往后替换
//    	String str = iniString.replace(" ", "%20");
//    	return str;
    }
}
