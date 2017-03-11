package com.huawei.oj;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] m=new int[200];
		m['a']=m['b']=m['c']=2;
		m['d']=m['e']=m['f']=3;
		m['g']=m['h']=m['i']=4;
		m['j']=m['k']=m['l']=5;
		m['m']=m['n']=m['o']=6;
		m['p']=m['q']=m['r']=m['s']=7;
		m['t']=m['u']=m['v']=8;
		m['w']=m['x']=m['y']=m['z']=9;
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			String ss=sc.nextLine();
			analyze(ss,m);
		}
	}
	
	public static void analyze(String s,int [] m){
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)>=97&&s.charAt(i)<=122){
				System.out.print(m[s.charAt(i)]);
			}
			else if(s.charAt(i)>=65&&s.charAt(i)<=90){
				if(s.charAt(i)==90){
					System.out.print('a');
				}else{
					System.out.print((char)(s.charAt(i)+33));
				}
			}
			else{
				System.out.print(s.charAt(i)+"");
			}
		}
	}

}
