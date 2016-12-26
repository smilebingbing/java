import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String str=sc.nextLine();
			char word;
			String digit="";
			for(int i=0;i<str.length();i++){
				word=str.charAt(str.length()-1-i);
				if(!(digit.contains(String.valueOf(word)))){
					digit+=word;
				}
			}
			System.out.println(digit);
		    
		    
		}
	}

}
