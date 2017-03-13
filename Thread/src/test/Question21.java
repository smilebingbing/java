package test;

import java.util.Scanner;

public class Question21 {

	public static String pinjie(int[] map) {
		StringBuffer sb = new StringBuffer();
		for(int i = 1;i < 10;i ++) {
			for(int j = 0;j < map[i];j ++) {
				sb.append(i);
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] map = new int[10];
		
		while(sc.hasNextLine()) {
			String s = sc.nextLine();
			if(s.length() >= 15 || (s.length() - 2) % 3 != 0) {
				System.out.println("no");
				continue;
			}
			for(int i = 0;i < 10;i ++) {
				map[i] = 0;
			}
			for(int i = 0;i < s.length();i ++) {          //统计个花色数量
				map[Integer.valueOf(s.charAt(i))-48] ++;
			}
			
			for(int i = 1;i < 10;i ++) {
				if(map[i] >= 2) {
					map[i] -= 2;
					if(isjhuopai(pinjie(map))) {
						System.out.println("yes");
						return ;
					} else {
						map[i] += 2;
					}
				}
			}
			System.out.println("no");
		}
	}
	
	
	public static boolean isjhuopai(String s) {
		//System.out.println(s);
		boolean flag = true;
		int[] map = new int[10];
		for(int i = 0;i < 10;i ++) {
			map[i] = 0;
		}
		for(int i = 0;i < s.length();i ++) {          //统计个花色数量
			map[Integer.valueOf(s.charAt(i))-48] ++;
		}
		
		for(int i = 1;i < 10;i ++) {       //去掉3个
			if(map[i] >= 3) {
				map[i] -= 3;
				//System.out.println("去掉3个" + i);
			}
		}
		for(int i = 1;i < 8;i ++) {
			if(map[i] > 0 && map[i+1] > 0 && map[i+2] > 0) {
				map[i]--;
				map[i+1]--;
				map[i+2]--;
				i--;
			}
		}
		for(int i = 1;i < 10;i ++) {
			if(map[i] != 0) {
				flag = false;
			}
		}
		return flag;
	}
}
