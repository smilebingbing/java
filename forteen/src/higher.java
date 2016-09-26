
public class higher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double s=100;
        double h=50.0;
        for(int i=2;i<11;i++){
        	s+=h;
        	h=h/2;
        }
        System.out.println("总共高度为："+s);
        System.out.println("第十次反弹高度为:"+h);
	}

}
