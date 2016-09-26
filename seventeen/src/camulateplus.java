
public class camulateplus {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        float u=2;
        float d=1;
        float s=0;
        for(int i=0;i<20;i++){
        	s=(s+u)/d;
        	u=u+d;
        	d=u-d;
        	
        }
        System.out.println("它的和为:"+s);
	}

}
