import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String str=sc.nextLine();
			System.out.println(SixteenToTen(str.substring(2)));
		}
	}
	
	public static int SixteenToTen(String s){
		int result=0;
		int temp=0;
		int count=0;
		char ch;
		while(count<s.length()){
			ch=s.charAt(s.length()-count-1);
			if(ch>='0'&&ch<='9'){
				temp=ch-'0';
			}else if(ch>='A'&&ch<='F'){
				temp=ch-'A'+10;
			}else if(ch>='a'&&ch<='f'){
				temp=ch='a'+10;
			}else{
				break;
			}
			result+=temp*Math.pow(16, count);
			count++;
			
			
		}
		return result;
		
	}

}
