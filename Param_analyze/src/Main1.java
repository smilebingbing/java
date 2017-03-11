import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String str=sc.nextLine();
			StringBuffer sb=new StringBuffer();
			int len=0;
			int quote=0;
			for(int i=0;i<str.length();i++){
				if(str.charAt(i)=='\"'){
					quote++;
					continue;
				}
				if(str.charAt(i)!=' '){
					sb.append(str.charAt(i));
				}else if(quote%2==0){
					sb.append('\n');
					len++;
				}else{
					sb.append(' ');
				}
			}
			System.out.println(len+1);
			System.out.println(sb.toString());
		}
		
	}

}
