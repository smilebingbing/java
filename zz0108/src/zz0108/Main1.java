package zz0108;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			String str = sc.nextLine();
			boolean flag=true;
			for(int i=0;i<str.length();i++){
				Character ch=str.charAt(i);
				if(str.lastIndexOf(ch.toString())==str.indexOf(ch.toString())&&flag){
					System.out.println(ch.toString());
					flag=false;
				}
				
			}
			if(flag){
				System.out.println(-1);
			}
		}
	}

}
