package model;

import java.util.ArrayList;

public class Solution6 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
    	ArrayList<Integer> list=new ArrayList<Integer>();
    	int len=input.length;
    	if(k>len){
    		return list;
    	}
    	quickSort(input,0,len-1);
    	for(int i=0;i<k;i++){
    		list.add(input[i]);
    	}
    	return list;
    	
    	
    }
    
    public static int [] quickSort(int [] input ,int low,int high){
    	if(low>high){
    		return null;
    	}
    	int i=low+1;
    	int j=high;
    	int temp;
    	int pivot=input[low];
    	while(i<j){
    		while(i<j&& input[i]<=pivot){
    			i++;
    		}
    		while(i<=j && input[j]>=pivot){
    			j--;
    		}
    		if(i<j){
    			temp=input[i];
    			input[i]=input[j];
    			input[j]=temp;
    			
    		}
    	}
    	if(low<j){
    		temp=input[low];
    		input[low]=input[j];
    		input[j]=temp;
    	}
    	quickSort(input,low,j-1);
    	quickSort(input,j+1,high);
    	return input;
    }
}