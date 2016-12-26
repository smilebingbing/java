import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			String sentence =sc.nextLine();
			String word[]=sentence.split("\\s+");
			int len=word.length;
			StringBuffer strbuf=new StringBuffer(word[len-1]);
			for(int i=len-2;i>=0;i--){
				strbuf.append(" "+word[i]);
			}
			System.out.println(strbuf);
		}
	}

}
