import java.util.Scanner;


public class camulate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            System.out.println("������һ���ַ���:");
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
            System.out.println("��ĸ����Ϊ:"+letter);
            System.out.println("���ָ���Ϊ:"+digit);
            System.out.println("�ո����Ϊ:"+space);
            System.out.println("��������Ϊ:"+other);
	}

}
