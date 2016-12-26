import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		while(sc.hasNext()){
			String str=sc.nextLine();
			String [] word=str.split("\\s+");
			int len=word.length;
			StringBuffer strbuf=new StringBuffer(word[len-1]);
			int num=0;
			for(int i=0;i<strbuf.length();i++){
				num++;
			}
			System.out.println(num);
			
		}
	}

}
