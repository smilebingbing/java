
public class heapsort {

	
	public static void main(String[] args) {

	}
    public void Creatheap(int A[],int n,int h){
    	int i=h;
    	int j=2*h+1;
    	int temp=A[i];
    	while(j<n){
    		if(j<n-1&&A[j]<A[j+1])
    		j++;
    		if(temp>A[j])
    			break;
    		
    	}
    }
}
