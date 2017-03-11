package model;
public class Solution {
    /*public int JumpFloor(int target) {

    	if(target==1){
    		return 1;

    	}
    	else if(target==2){
    		return 2;
    	}
    	else{
    		return  JumpFloor(target-1) + JumpFloor(target-2);
    	}
    	
    }*/
    /*public int JumpFloor(int target){
    	if(target == 1){
    		return 1;
    	}
    	if(target == 2){
    		return 2;
    	}
    	int a=1,b=2,c=3;
    	for(int i=3;i <= target;i++){
    		c=a+b;
    		a=b;
    		b=c;
    		
    	}
    	return c;
    }*/
	public int JumpFloorII(int target) {
        return (int) Math.pow(2, target-1);
    }
}