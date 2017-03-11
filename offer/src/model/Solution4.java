package model;

public class Solution4 {
	public int GetUglyNumber_Solution(int index) {
		int i;
		int  count=0;
		for(i=1;count<=index;i++){
			if(isUgly(i)){
				count++;
			}
		}
        return i;
   }
	
	public boolean isUgly(int i){
		while(i%2==0){
			i=i/2;
		}
		while(i%3==0){
			i=i/3;
		}
		while(i%5==0){
			i=i/5;
		}
		if(i==1){
			return true;
		}else{
			return false;
		}
	}
}
