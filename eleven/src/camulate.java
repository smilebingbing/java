import java.util.Scanner;


public class camulate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            System.out.println("请输入一个字符串:");
            Scanner s=new Scanner(System.in);
            String x=s.next();
            int letter=0;
            int space=0;
            int digit=0;
            int other=0;
            for(int i=0;i<x.length();i++){
            	char c=x.charAt(i);
            	if((c>='a'&&c<='z')||(c>='A'&&c<='Z')){
            		letter++;
            	}
            	else if(c>='0'&&(int)c<='9'){
            		digit++;
            	}
            	else if(c==' '){
            		space++;
            	}
            	else{
            		other++;
            	}
            	
            }
            System.out.println("字母个数为:"+letter);
            System.out.println("数字个数为:"+digit);
            System.out.println("空格个数为:"+space);
            System.out.println("其他个数为:"+other);
	}

}
