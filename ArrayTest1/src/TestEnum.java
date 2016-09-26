
public class TestEnum {
    
	public enum MyColor{red,green,blue};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyColor m=MyColor.red;
        switch(m){
        case red:
        	System.out.println("red");
        	break;
        case green:
        	System.out.println("green");
        	break;
        default:
        	System.out.println("default");
        }
        System.out.println(m);
	}

}
