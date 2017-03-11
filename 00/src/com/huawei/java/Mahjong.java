package com.huawei.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Mahjong{
public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while(sc.hasNextLine()){
			count++;
			if(count % 5 == 0){
				String[] ips = new String[5];
				ArrayList<String> listA = new ArrayList<String>();
				ArrayList<String> listB = new ArrayList<String>();
				ArrayList<String> listC = new ArrayList<String>();
				ArrayList<String> listD = new ArrayList<String>();
				ArrayList<String> listE = new ArrayList<String>();
				for(int i = 0; i < 5; i++){
					ips[i] = sc.nextLine();
				}
				for(int i = 0; i < 5; i++){
					String str = ips[i];
					String[] strs = str.split(".");
					int type = 0;
					for(int j = 0; j < strs.length; j++){
						if(j == 0){
							int classes = Integer.parseInt(strs[j]);
							if(0 <= classes && classes <= 127){
								type = 1;
							}else if(128 <= classes && classes <= 191){
								type = 2;
							}else if(192 <= classes && classes <= 223){
								type = 3;
							}else if(224 <= classes && classes <= 239){
								type = 4;
							}else if(240 <= classes && classes <= 255){
								type = 5;
							}
						}else{
							int num = Integer.parseInt(strs[j]);
							if(num > 255){
								type = 0; 
								break;
							}
						}
					}
					switch(type){
						case 1: listA.add(str); break;
						case 2: listB.add(str); break;
						case 3: listC.add(str); break;
						case 4: listD.add(str); break;
						case 5: listE.add(str); break;
						default: break;
					}
						
				}
				if(!listA.isEmpty()){
					String[] A = new String[listA.size()];
					for(int i = 0; i < listA.size(); i++){
						A[i] = listA.get(i);
					}
					Arrays.sort(A);
					String str = "[";
					for(int i = 0; i < A.length; i++){
						str += A[i] + "， ";
					}
					str.substring(0, str.length() - 2);
					str += "]";
					System.out.println("A： " + str);
				}
				
				if(!listB.isEmpty()){
					String[] B = new String[listB.size()];
					for(int i = 0; i < listB.size(); i++){
						B[i] = listB.get(i);
					}
					Arrays.sort(B);
					String str = "[";
					for(int i = 0; i < B.length; i++){
						str += B[i] + "， ";
					}
					str.substring(0, str.length() - 3);
					str += "]";
					System.out.println("A： " + str);
				}
				if(!listC.isEmpty()){
					String[] C = new String[listC.size()];
					for(int i = 0; i < listC.size(); i++){
						C[i] = listC.get(i);
					}
					Arrays.sort(C);
					String str = "[";
					for(int i = 0; i < C.length; i++){
						str += C[i] + ",，";
					}
					str.substring(0, str.length() - 2);
					str += "]";
					System.out.println("A： " + str);
				}
				if(!listD.isEmpty()){
					String[] D = new String[listD.size()];
					for(int i = 0; i < listD.size(); i++){
						D[i] = listD.get(i);
					}
					Arrays.sort(D);
					String str = "[";
					for(int i = 0; i < D.length; i++){
						str += D[i] + "， ";
					}
					str.substring(0, str.length() - 2);
					str += "]";
					System.out.println("A：" + str);
				}
				if(!listE.isEmpty()){
					String[] E = new String[listE.size()];
					for(int i = 0; i < listE.size(); i++){
						E[i] = listE.get(i);
					}
					Arrays.sort(E);
					String str = "[";
					for(int i = 0; i < E.length; i++){
						str += E[i] + "， ";
					}
					str.substring(0, str.length() - 2);
					str += "]";
					System.out.println("A " + str);
				}
			}
			
		}
	}
}