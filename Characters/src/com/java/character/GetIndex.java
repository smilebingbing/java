package com.java.character;

import java.util.Scanner;

public class GetIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String strs = sc.next();
		}
		
	}
	
	/*public static int getIndex(String [] strs, String str){
		if(str == null || strs.length == 0 || strs == null){
			return -1;
		}
		for(int i = 0; i < strs.length; i ++){
			if(strs[i] == str){
				break;
			}
			return i;

		}
	}*/
	public static int getIndex(String [] strs, String str){
		if(strs == null || strs.length == 0 || str == null){
			return -1;
		}
		int left = 0;
		int right = strs.length - 1;
		int mid = 0;
		int res = 0;
		int i = 0;
		while(left < right){
			mid = (left + right) / 2;
			if(strs[mid] != null && strs[mid].equals(str)){
				res = mid;
				right = mid - 1;
			}else if(strs[mid] != null ){
				if(strs[mid].compareTo(str) < 0){
					left = mid + 1;
				}else{
					right = mid - 1;
				}
			}else{
				i = mid;
				while(strs[mid] == null || -- i >= left)
					;
				if(i < left || strs[mid].compareTo(str) < 0){
					left = mid + 1;
				}else{
					res = strs[i].equals(str) ? i : res;
					right = i - 1;
				}
			}
		}
		return res;
	}
}