class Point1{
	private double x;
	private double y;
	Point1(double x1,double y1){
		x=x1;
		y=y1;
	}
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	
	public void setX(double i){
		x=i;
	}
	
	public void setY(double i){
		y=i;
	}
}

class Circle{
	private Point1 o;
	private double radius;
	Circle(Point1 p,double r){
		o=p;
		radius=r;
	}
	Circle(double r){
		o=new Point1(0.0,0.0);
		radius=r;
	}


boolean contains(Point1 p){
	double x=p.getX()-o.getX();
	double y=p.getY()-o.getY();
	if(x*x+y*y>radius*radius) return false;
	else return true;
}
public class TestCircle {

}
}