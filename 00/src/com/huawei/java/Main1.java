package com.huawei.java;

import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j,k,x,tmp,flag=0;
        i=0;
        tmp=0;
        int[] a =new int[11]; 
        while (sc.hasNextInt()) {
           a[i] = sc.nextInt();
           i++;
        }
        for(i=0;i<10;i++){
            if(a[i]==a[i+1]){
                tmp = a[i];
                a[10] = a[i];
            }else{
                a[i] = tmp;
            }
            for(i=0;i<11;i++)
                for(j=0;j<11;j++)
                    for(k=0;k<11;k++){
                        if(i==j||j==k||i==k) 
                        	continue;
                        if(a[i]+1==a[j] && a[j]+1==a[k] && a[i]!=0||a[i]==a[j] && a[k]==a[j]){
                            a[i]=0;
                            a[j]=0;
                            a[k]=0;
                        }
                    }
            int s=0;
            for(i=0;i<11;i++){
                s=s+a[i];
            }
            if(s==0){
                System.out.println("yes");
            }else{
                 System.out.println("no");
            }
        }
    }
}