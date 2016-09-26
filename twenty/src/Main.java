import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int A1=0;
    	int A3=0;
    	double A4=0;
    	double sum=0;
    	int A5=0;
    	int A2=0;
    	int temp=1;
    	int temp1=0;
    	int flag1=0,flag2=0,flag3=0,flag4=0,flag5=0;
        DecimalFormat df=new DecimalFormat("#.0");
        while(a!=0){
        	int b=s.nextInt();
        	a--;
        	
        	if(b%5==0&&b%2==0){
        		flag1=1;
            	A1=A1+b;
            }
        	if(b%5==1){
        		flag2=1;
        		A2=A2+((temp%2!=0?b:(-b)));
        		temp++;
        	}
        	if(b%5==2){
        		flag3=1;
        		A3++;
        	}
        	if(b%5==3){
        		flag4=1;
        		sum=sum+b;
        		temp1++;
        		
        	}
        	if(b%5==4){
        		flag5=1;
        		if(b>A5){
        			A5=b;
        		}
        	}
        	
        }
      if(flag1==1){
    	  System.out.print(A1+" ");
        }
      else{
    	  System.out.print("N"+" ");
      }
      if(flag2==1){
    	  System.out.print(A2+" ");
        }
      else{
    	  System.out.print("N"+" ");
      }
      if(flag3==1){
    	  System.out.print(A3+" ");
        }
      else{
    	  System.out.print("N"+" ");
      }
      if(flag4==1){
    	  System.out.print(df.format(sum/temp1)+" ");
        }
      else{
    	  System.out.print("N"+" ");
      }
      if(flag5==1){
    	  System.out.print(A5);
        }
      else{
    	  System.out.print("N");
      }
      
	}

  
}
