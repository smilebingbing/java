import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		while(sc.hasNext()){
			System.out.println(getResult(sc.nextLong()));
			
		}
		
		
	}

	private static String getResult(long datainput){
		int i=2;
		StringBuffer strbuf =new StringBuffer();
		while(datainput!=1){
			while(datainput%i==0){
				strbuf.append(i+" ");
				datainput=datainput/i;
			}
			i++;
		}
		return strbuf.toString();
		
	}
}
