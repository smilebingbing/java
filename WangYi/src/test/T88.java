package test;

import java.util.Scanner;

public class T88 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char [] ch = str.toCharArray();
		int len = ch.length;
		int res = Integer.parseInt(String.valueOf(ch[0]));
		for(int i = 1;i < len;i ++){
			if(ch[i] == '+'){
				res += Integer.parseInt(String.valueOf(ch[i+1]));
			}
			if(ch[i] == '-'){
				res -= Integer.parseInt(String.valueOf(ch[i+1]));
			}
			if(ch[i] == '*'){
				res *= Integer.parseInt(String.valueOf(ch[i+1]));
			}
		}
		System.out.println(res);
	}

}