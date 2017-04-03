package character;

import java.util.*;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(reverseString(str));
	}
    public static String reverseString(String iniString) {
        // write code here
    	char [] ch = iniString.toCharArray();
    	char temp;
    	for(int i = 0,j = ch.length - 1; i < j;i ++, j --){
    		temp = ch[i];
    		ch[i] = ch[j];
    		ch[j] = temp;
    	}
    	return String.valueOf(ch);
    }
}