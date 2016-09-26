public class Numsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a=new int[args.length];
        for(int i=0;i<args.length;i++){
        	a[i]=Integer.parseInt(args[i]);
        	
        }
        print(a);
        selectionSort(a);
        print(a);
       
	}
/*
	private static void Selection(int[] a){
		for(int i=0;i<a.length;i++){
			int k=i;
			for(int j=k+1;j<a.length;j++){
			if(a[j]<a[k]){
			k=j
		}
	}
	
	if(k!=i){
	int temp=a[i];
	a[i]=a[k];
	a[k]=temp;
	*/
	private static void selectionSort(int[] a){
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[j]<a[i]){
					int tmp=a[i];
					a[i]=a[j];
					a[j]=tmp;
				}
			}
		}
	}
	
	
	 private static void print(int[] a){
     	 for(int i=0;i<a.length;i++){
     		 System.out.print(a[i]+" ");
     		 
     	 }
     	System.out.println();
     }
}
