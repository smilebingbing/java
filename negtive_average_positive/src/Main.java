import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int count=sc.nextInt();
			int [] nums=new int[count];
			int m=0;
			int n=0;
			int x=0;
			for(int i=0;i<count;i++){
				int num=sc.nextInt();
				if(num>0){
					nums[n]=num;
					n++;
				}else if(num<0){
					m++;
				}else{
					x++;
				}
			}
			
			int sum=0;
			for(int i=0;i<count-m;i++){
				sum+=nums[i];
			}
			double average=(double)sum/(count-m-x);
			System.out.println(m+" "+String.format("%.1f",average));
		}
	}

}
