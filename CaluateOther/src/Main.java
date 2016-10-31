import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		while(sc.hasNext()){
			String a =sc.nextLine();
			int english=0,digit=0,space=0,other=0;
			for(int i=0;i<a.length();i++){
				
				if((a.charAt(i)>='a'&&a.charAt(i)<='z')||(a.charAt(i)>='A'&&a.charAt(i)<='Z')){
					english++;
				}else if(a.charAt(i)==' '){
					space++;
				}else if(a.charAt(i)>='0'&&a.charAt(i)<='9'){
					digit++;
				}else{
					other++;
				}
				
				
			}
			System.out.println(english);
			System.out.println(space);
			System.out.println(digit);
			System.out.println(other);
			
			
		}
		
	}

}
