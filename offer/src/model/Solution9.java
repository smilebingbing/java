package model;

public class Solution9 {

	public static void main(String[] args) {
		int array []={1,2,3,4,5,6};
		reOrderArray(array);
		System.out.println(array);
	}
	
	public static void reOrderArray(int [] array){
		int len = array.length;
		int [] a = new int[len];
		int count = 0;
		for(int i = 0;i < len; i ++){
			if(array[i] % 2 != 0) {
				count++;
				a[i] = array[i];
			}
		}
		System.out.println("jjjjfsadsadsadajlll");
		System.out.println(a);
		for(int i = 0;i < len;i ++){
			if(array[i] % 2 == 0) {
				a[count++] = array[i];
			}
		}

		for(int i=0;i<len;i++){
			array[i]=a[i];
		}
		
	}
}