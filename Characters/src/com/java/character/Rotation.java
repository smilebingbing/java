package com.java.character;
//判断两个字符串是否互为旋转词
public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean isRotation(String str1 , String str2){
		if(str1 == null || str2 == null || str1.length() != str2.length()){
			return false;
		}
		String str = str2 + str2;
		if(str.contains(str1)){
			return true;
		}else{
			return false;
		}
	}

}
