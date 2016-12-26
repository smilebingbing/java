import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			
			String word=sc.nextLine();
			String [] reword=word.split("[^A-Za-z]+");
			for(int i=reword.length-1;i>=2;i--){

				System.out.print(reword[i]+' ');
				
			}
			if(reword[0].length()==0)
				System.out.println(reword[1]);
			else
				System.out.println(reword[1]+' '+reword[0]);
		}
	}

}
