package operation;

import java.io.Console;
import java.util.Scanner;

public class Operation {
	
	 static void Main(String args[]){
		try {
			System.out.println("请输入数字A:");
			System.out.println("请选择运算符号（+、—、*、/");
			
			Scanner sc = new Scanner(System.in);
			double numberA=sc.nextDouble();
			double numberB=sc.nextDouble();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static double GetResult(double numberA,double numberB,String operate){
		double result =0d;
		switch(operate){
		case "+":
			result =numberA+numberB;
			break;
		case "-":
			result =numberA-numberB;
			break;
		case "*":
			result = numberA*numberB;
			break;
		case "/":
			result = numberA/numberB;
			break;
		}
		return result;

	}

}
