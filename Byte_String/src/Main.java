import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String str =sc.next();
			int n=sc.nextInt();
			int count=0;
			char [] ch =str.toCharArray();
			String res="";
			for(int i=0;i<ch.length;i++){
				if(ch[i]<='z'){
					count++;
				}else{
					count+=2;
				}
				if(count>n){
					break;
				}
				res+=ch[i];
			}
			System.out.println(res);
			
		}
	}

}
//提示是否存在数组非法越界情况，问题所在竟然是nextLine()____改成next()
