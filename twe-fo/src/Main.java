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
        
        int sum=0;
        for(int j=M;j<=N;j++){
        	boolean f=true;
        	for(int i=2;i<=(int)Math.sqrt(j);i++){
        		
        		if(j%i==0){
        			f=false;
        			break;
        		}
               else{
        			f=true;
        		}
       }
        if(f==true){
        		System.out.print(j+" ");
        		sum++;
        	}	
        if(sum%10==0){
            System.out.print("\n");
            
         }
      
        }
	}

}
