package com.java.offer;
//数组中出现次数超过一半的数，时间复杂度是O(N),最低
public class Gift {
    public int getValue(int[] gifts, int n) {
    	int resu = gifts[0];
    	int flag = 1;
        for(int i = 1;i < gifts.length;i ++) {
        	if(resu == gifts[i]) {
        		flag ++;
        	} else {
        		flag --;
        	}
        	if(flag == 0) {
        		flag = 1;
        		resu = gifts[i];
        	}
        }
        flag = 0;
        for(int i = 0;i < gifts.length;i ++) {
        	if(gifts[i] == resu) {
        		flag ++;
        	}
        }
        if(flag >= gifts.length/2) {
        	return resu;
        } else {
        	return 0;
        }
    }
}

