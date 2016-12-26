import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		while(sc.hasNext()){
			String word=sc.nextLine();
			String [] str=word.trim().split("\\s+|[^a-zA-Z]");
			StringBuffer result=new StringBuffer();
			for(int i=str.length-1;i>=0;i--){
				result.append(str[i]+" ");
			}
			System.out.println(result.toString().trim());
		}
	}

}
