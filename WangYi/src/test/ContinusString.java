package test;

import java.util.Scanner;

public class ContinusString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int count = 0;
			int n = sc.nextInt();
			int [] a = new int[n];
			for(int i = 0;i < n;i++){
				a[i] = sc.nextInt();
			}
			int begin = 0;
			int end = n-1;
			while(begin < end){
				if(a[begin] == a[end]){
					begin ++;
					end --;
				}else if(a[begin] < a[end]){
					a[++ begin] += a[begin - 1];
					count ++;
				}else{
					a[-- end] += a[end + 1];
					count ++;
				}
			}
			System.out.println(count);
		}
	}

}