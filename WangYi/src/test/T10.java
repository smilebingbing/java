package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		List<String> list = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		int res = 0;
		for(int i = 0;i < n;i ++){
			String s = sc.next();
			if(!list.contains(s)){
				list.add(s);
			}
		}
		for(int i = 0;i < m;i ++){
			String str = sc.next();
			list2.add(str);
		}
		for(int i = 0;i < list.size();i ++){
			if(list2.contains(list.get(i))){
				int x = (int)Math.pow(list.get(i).length(), 2);
				res += x;
			}
		}
		System.out.println(res);
	}

}