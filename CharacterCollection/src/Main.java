import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			String str=sc.nextLine();
			int [] A =new int[256];
			for(int i=0;i<str.length();i++){
				char ch=str.charAt(i);
				A[ch]++;
			}
			
			String res="";
			for(int i=0;i<str.length();i++){
				char ch=str.charAt(i);
				if(A[ch]!=0){
					res+=ch;
					A[ch]=0;
				}
			}
			System.out.println(res);
		}
				
	}

}
