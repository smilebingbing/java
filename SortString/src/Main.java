import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		while(sc.hasNext()){
			String str=sc.nextLine();
			StringBuffer strbuf=new StringBuffer();
			for(int i=0;i<26;i++){
				for(int j=0;j<str.length();j++){
					if(str.charAt(j)==(i+'a')||str.charAt(j)==(i+'A')){
						strbuf.append(str.charAt(j));
					}
				}
			}
			StringBuffer result =new StringBuffer();
			int k=0;
			for(int i=0;i<str.length();i++){
				if(!isLetter(str.charAt(i))){
					result.append(str.charAt(i));
				}else{
					result.append(strbuf.charAt(k));
					k++;
				}
			}
			System.out.println(result);
		}
	}
	private static boolean isLetter(char i){
		return (i>='a'&&i<='z')||(i>='A'&&i<='Z');
			
		
	}

}
