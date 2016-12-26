import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		while(sc.hasNext()){
			String a=sc.nextLine();
			if(a.length()>20){
				continue;
			}
			System.out.println(deleteLeastCharacter(a));
		}
	}
	
	public static String deleteLeastCharacter(String a){
		
		int [] max=new int[26];
		char [] str=a.toCharArray();
		int min=Integer.MAX_VALUE;
		for(int i=0;i<str.length;i++){
			max[str[i]-'a']++;
			min=min>max[str[i]-'a']?max[str[i]-'a']:min;
		}
		
		for(int i=0;i<max.length;i++){
			if(max[i]==min){
				a=a.replaceAll(String.valueOf((char)(i+97)), "");
			}
		}
		return a;
		
	}

}
