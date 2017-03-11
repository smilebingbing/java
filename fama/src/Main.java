import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			int [] m=new int[n];
			int [] x=new int[n];
			for(int i=0;i<n;i++){
				m[i]=sc.nextInt();
			}
			for(int j=0;j<n;j++){
				x[j]=sc.nextInt();
			}
			System.out.println(fama(n,m,x));
		}
		
		
	}
	public static int fama(int n,int[] m,int [] x){
		Set<Integer> set=new HashSet<Integer>();
		for(int i=0;i<=x[0];i++){
			set.add(i*m[0]);
		}
		for(int i=1;i<n;i++){
			List<Integer> list= new ArrayList<Integer>(set);
			for(int j=1;j<=x[i];j++){
				for(int k=0;k<list.size();k++){
					set.add(list.get(k)+j*m[i]);
				}
			}
		}
		return(set.size());
	}

}
