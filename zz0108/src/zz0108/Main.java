package zz0108;

import java.util.Scanner;

public class Main {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String str=sc.nextLine();
			System.out.println(getFirstCharacter(str));
			
		}
	}
	
	public static char getFirstCharacter(String str){
		int index=-1;
		char [] ch=str.toCharArray();
		int[] count=new int [ch.length];
		for(int i=0;i<count.length;i++){
			count[i]=1;
		}
		
		for(int i=0;i<ch.length;i++){
			for(int j=i+1;j<ch.length;j++){
				if(ch[i]==ch[j]){
					count[i]++;
					count[j]++;
					continue;
				}
			}
		}
		for(int i=0;i<count.length;i++){
			if(count[i]==1){
				index=i;
				break;
			}
			return ch[index];
		}
		return (char) -1;
			
		
	}
}
//错错错      java.lang.ArrayIndexOutOfBoundsException: -1

