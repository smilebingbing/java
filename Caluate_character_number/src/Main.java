import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String str=sc.nextLine();
			String ch=sc.nextLine();
			char character=0;
			for(int i=0;i<ch.length();i++){
				if(ch.charAt(i)!=' '){
					character=ch.charAt(i);
					break;
				}
			}
			character=toUppercase(character);
			int count=0;
			for(int i=0;i<str.length();i++){
				if(toUppercase(str.charAt(i))==character){
					count++;
				}
			}
			System.out.println(count);
			
		}
	}
	
	private static char toUppercase(char ch){
		if(ch>'a'&&ch<'z'){
			return (char) ('A'+(ch-'a'));
		}
		return ch;
	}

}

//该方法有问题，？？？当字符输入小写字母时，不知道为什么输出答案中只包含小写字母的个数

