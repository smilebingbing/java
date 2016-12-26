import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String str =sc.nextLine();
			int [] a =new int[128];
			CountChar(a,str);
			System.out.println(CountCharNum(a));
			
		}
	}

	private static void CountChar(int [] arr,String str){
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(c<127){
				arr[c]++;
			}
		}
		
	}
	
	private static int CountCharNum(int [] arr){
		int result=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0){
				result++;
			}
		}
		return result;
	}
}
