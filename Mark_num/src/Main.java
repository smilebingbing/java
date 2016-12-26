import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		while(sc.hasNext()){
			String str=sc.nextLine();
			StringBuffer strbuf=new StringBuffer();
			str="a"+str+"a";
			for(int i=0;i<str.length()-1;i++){
				if((!isNum(str.charAt(i))&&isNum(str.charAt(i+1)))||(isNum(str.charAt(i)))&&(!isNum(str.charAt(i+1)))){
					strbuf.append(str.charAt(i)).append("*");
				}else{
					strbuf.append(str.charAt(i));
				}
			}
			System.out.println(strbuf.substring(1));
			
		}
	}
	private static boolean isNum(char i){
		if(i>='0'&&i<='9'){
			return true;
		}else{
			return false;
		}
	}

}
