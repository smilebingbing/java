package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class TestScanner { 
	public static void main(String[] args) { 
		Scanner s = new Scanner(System.in); 
		System.out.println("请输入字符串："); 
		while (true) { 
			String line = s.nextLine(); 
			if (line.equals("exit")) break; 
			System.out.println(">>>" + line); 
		} 
	} 
}
