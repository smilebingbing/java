package sort;

import java.util.*;

public class quicksort {
    public int[] quickSort(int[] A, int n) {
        // write code here
        sort(A,0,n-1);
        return A;
            
        
    }
    public void sort(int A[],int left,int right){
    	int dp;
    	if(left<right){
    		dp=partition(A,left,right);
    		sort(A,left,dp-1);
    		sort(A,dp+1,right);
    		
    	}
    }
	private static int partition(int[] A, int left, int right) {
		int pivot=A[left];
		while(left<right){
			while(left<right&&A[right]>=pivot)
				right--;
			if(left<right)
				A[left++]=A[right];
			while(left<right && A[left]<=pivot)
				left++;
			if(left<right)
				A[right--]=A[left];
			
		}
		A[left]=pivot;
		return left;
	}

}