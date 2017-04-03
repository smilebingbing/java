package com.java.offer;
//数值的整数次方
/*
 * 
 */
public class Solution9 {

	public double Power(double base, int exponent){
		if(equal(base, 0.0) && exponent < 0){
			return 0.0;
		}
		int abs_exponent = Math.abs(exponent);
		double result = PowerExponent(base, abs_exponent);
		if(exponent < 0){
			result = 1.0 / result;
		}
		return result;
	}
	
	public double PowerExponent(double base , int exponent){
		double result = 1.0;
		for(int i = 1; i <= exponent; i++){
			result *= base;
		}
		return result;
	}
	
	boolean equal(double num1 , double num2){
		if((num1 - num2 > -0.0000001) && (num1 - num2 < 0.0000001)){
			return true;
		}else{
			return false;
		}
	}
}
