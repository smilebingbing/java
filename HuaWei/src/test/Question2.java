package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		while (s.hasNextLine()){
			list.add(s.nextLine());
		}
		s.close();
		
		for(String sss : list) {
			System.out.println(sss);
		}
	}
}
