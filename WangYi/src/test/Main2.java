package test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<String> set = new HashSet<String>();
			int n = sc.nextInt();
			for(int i = 0; i < n;i++){
				String a= sc.nextLine();
				set.add(a);
				String [] str = new String[n];
				str[i] = a;
				if(n == 1){
					System.out.println(a.length());
				}
			}
			
		}	
	public static int getSum(int n){
		if(n == 1 || n == 0){
			return 1;
		}else{
			return getSum(n-1)*n;
		}
		
	}
}
