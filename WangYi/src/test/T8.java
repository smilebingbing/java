package test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class T8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		Set set = new HashSet();
		for(float p = w;p <= x;p ++){
			for(float q = y;q <= z;q++){
				float temp = p/q;
				set.add(Float.toString(temp));
			}
		}
		System.out.println(set.size());
	}
}
