import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int x=1;
        while(n!=0){
       	        long A=s.nextLong();
                long B=s.nextLong();
                long C=s.nextLong();
        	            
        if((A+B)>C){
            System.out.println("Case #"+x+": true");
        }
        else{
                System.out.println("Case #"+x+": false");
        }
        n--;
        x++;	
      }
	}

}
