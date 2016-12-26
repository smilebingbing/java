import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String word=sc.nextLine();
			char [] reword=word.toCharArray();
			for(int i=0;i<word.length();i++){
				char ch=reword[i];
				if(!(ch>='a'&&ch<='z')&&!(ch>='A'&&ch<='Z')){
					reword[i]=' ';
				}
			}
			String str=String.valueOf(reword);
			String [] strs=str.split(" ");
			for(int i=strs.length-1;i>=0;i--){
				if(strs[i].equals("")){
					System.out.print(strs[i]+" ");
				}else{
					System.out.print(strs[i]);
				}
			}
		}
	}

}
