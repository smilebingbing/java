package character;
/*
 * 给定两个字符串，请编写程序，确定其中一个字符串的字符重新排列后，
 * 能否变成另一个字符串。这里规定大小写为不同字符，且考虑字符串重点空格。
 */
import java.util.*;
/*
 * ASCII编码使用八位二进制可表示256个，通过计算每个字符出现的次数是否一致来判断是否同构
 */
public class Same {
    public boolean checkSam(String stringA, String stringB) {
        // write code here
    	int len_A = stringA.length();
    	int len_B = stringB.length();
    	if(len_A != len_B){
    		return false;
    	}
    	int [] A = new int[256];
    	for(int i = 0; i < len_A; i ++){
    		A[stringA.charAt(i)] ++;
    		A[stringB.charAt(i)] --;
    	}
    	for(int i = 0;i < A.length;i ++){
    		if(A[i] != 0){
    			return false;
    		}
    	}
    	return true;
    	
    }
}