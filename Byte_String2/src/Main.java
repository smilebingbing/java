import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String str =sc.next();
			int n=sc.nextInt();
			char [] ch=str.toCharArray();
			StringBuffer strbuf=new StringBuffer();
			for(int i=0;i<n;i++){
				if(ch[i]>='A'&&ch[i]<='Z'){
					strbuf.append(ch[i]);
				}else if(ch[i]>='a'&&ch[i]<='z'){
					strbuf.append(ch[i]);
				}else{
					strbuf.append(ch[i]);
					i++;
				}
			}
			System.out.println(strbuf);
		}
	}

}
