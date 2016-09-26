import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int M=s.nextInt();
        int N=s.nextInt();
        if(M>10000||N>10000){
        	System.out.println("data error");
        }
        if(M>N){
        	int temp;
        	temp=M;
        	M=N;
        	N=temp;
        }
        int [] array=new int[N];
        int sum=0;
        int i=2;
        while(sum<N){
        	if(isprime(i)){
        		array[sum]=i;
        		sum++;
        	}
        	i++;
        }
        int index=0;
        for(int j=(M-1);j<N;j++){
        	System.out.print(array[j]);
        	index++;
        	if(index%10==0){
        		System.out.println();
        		continue;
        	}
        	if(j!=N-1){
        		System.out.print(" ");
        	}
        }
	}

	private static boolean isprime(int n) {
		// TODO Auto-generated method stub
		if(n==1){
			return false;
		}
		else if(n==2){
			return true;
		}
		else if(n%2==0){
			return false;
		}
		else{
			for(int i=3;i<=(int)Math.sqrt(n);i+=2){
				if(n%i==0){
					return false;
				}
					}
		return true;
	}
}
}
