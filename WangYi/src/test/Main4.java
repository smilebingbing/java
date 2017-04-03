package test;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int len1 = sc.nextInt();
	        int arr1[]=new int[1000];
	        int arr2[]=new int[1000];
	        int len2=0;
	        for(int i = 0; i < len1; i++){
	        	arr1[i]=sc.nextInt();
	        } 
	        for(int i=len1-1;i>=0;i--){
	        	if(!findx(arr2,arr1[i],len2)){
	        		arr2[len2]=arr1[i];
	        		len2++;
	        	}
	        }
	        for(int i =len2-1;i>=0;i--){
	        	System.out.print(arr2[i]);
	        	if(i>0)
	        	System.out.print(" ");
	        }

	}
	private static boolean findx(int[] arr,int x,int len){
		boolean b = false;
		for(int i = 0;i<len;i++){
			if(arr[i]==x){
				b = true;
				break;
			}
		}
		return b;
	}
	

}

