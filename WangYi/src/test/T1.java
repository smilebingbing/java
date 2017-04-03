package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class T1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list1 = new LinkedList<>();
		for(int i = 0;i < n;i ++) {
			list1.add(sc.nextInt() / 1024);
		}
		sc.close();
		Collections.sort(list1);
		List<Integer> list2 = new ArrayList<>();
		list2.add(list1.get(list1.size()-1));
		list1.remove(list1.size()-1);
		List<Integer> list3 = new ArrayList<>();
		while(!list1.isEmpty()) {
			System.out.println("sum = " + sum(list2) + " " +  sum(list3));
			if(sum(list2) >= sum(list3)) {
				System.out.println("list3 +    " + list1.get(list1.size()-1));
				list3.add(list1.get(list1.size()-1));
				list1.remove(list1.size()-1);
			} else {
				System.out.println("list2 +    " + list1.get(list1.size()-1));
				list2.add(list1.get(list1.size()-1));
				list1.remove(list1.size()-1);
			}
		}
		long resu = sum(list2) > sum(list3) ? sum(list2) : sum(list3);
		System.out.println(resu*1024);
		
	}
	
	
	public static long sum(List<Integer> list) {
		long resu = 0;
		for(Integer i : list) {
			resu += i;
		}
		return resu;
	}
}
