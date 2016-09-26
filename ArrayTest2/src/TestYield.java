
public class TestYield {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Mythread t1=new Mythread("t1");
        Mythread t2=new Mythread("t2");
        t1.start();
        t2.start();
        
	}

}


class Mythread extends Thread{
	Mythread(String s) {
		super(s);
	}
	public void run(){
	for(int i=0;i<=100;i++){
    	System.out.println(getName()+":"+i);
    	if(i%10==0){
    		yield();
    	}
    }
}
}