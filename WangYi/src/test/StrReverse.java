package test;
//�ַ�������
import java.util.Scanner;

public class StrReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char [] ch = str.toCharArray();
		int len = str.length();
		for(int i = 0, j = len - 1;i < j;i++,j--){
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
		}
		System.out.println(ch);
	}
}