
public class TestSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a []={1,3,6,8,9,10,12,18,20,34};
		int i=12;
		System.out.println(binarySearch(a,i));

	}
   public static int search(int[] a,int num){
	   for(int i=0;i<a.length;i++){
		   if(a[i]==num) return i;
	   }
	   return -1;
   }
   
   public static int binarySearch(int[] a,int num){
	   if(a.length==0){
		   return -1;
	   }
	   int start=0;
	   int end=a.length-1;
	   int m=(start+end)/2;
	   while(start<end){
	   if(num==a[m]) return m;
	   if(num>a[m]){
		   start=m+1;
	   }
	   if(num<a[m]){
		   end=m-1;
	   }
	   m=(start+end)/2;
   }
	   return m;
   }
   
}
