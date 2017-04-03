package test;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class T4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int [] array = new int[n];
			int [] arr2 = new int[n];
			for(int i = 0;i < n;i++){
				array[i] = sc.nextInt();
			}
			int len = 0;
			for(int i = n - 1;i >= 0;i--){
				if(!same(arr2,array[i],len)){
					arr2[len] = array[i];
					len ++;
				}
			}
		}
	}

	public static boolean same(int [] array, int x,int des){
		boolean b = false;
		for(int i = 0;i < array.length;i++){
			if(array[i] == x){
				b = true;
				break;
			}
		}
		return b;
	}
}