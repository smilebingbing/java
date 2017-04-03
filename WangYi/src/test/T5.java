package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i = 0;i < n;i++){
			arr[i] = sc.nextInt();
		}
		sc.close();
		List<Integer> list = new ArrayList<>();
		for(int i = n-1;i >= 0;i --) {
			if(!list.contains(arr[i])) {
				list.add(arr[i]);
			}
		}
		for(int i = list.size()-1;i > 0;i --) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println(list.get(0));
	}
}