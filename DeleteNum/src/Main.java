import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int N=sc.nextInt();
			if(N>1000){
				N=999;
			}
			ArrayList<Integer> list=new ArrayList<Integer>();
			for(int i=0;i<N;i++){
				list.add(i);
			}
			int i=0;
			while(list.size()>1){
				i=(i+2)%list.size();
				list.remove(i);
			}
			System.out.println(list.get(0));
			
		}
		
	}

}