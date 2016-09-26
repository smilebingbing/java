import java.util.Comparator;


public class MyComparator1 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		student stu1=(student)o1;
		student stu2=(student)o2;
		if(stu1.getSum()!=stu2.getSum()){
			return stu2.getSum()-stu1.getSum();
		}
		else if(stu1.getDe()!=stu2.getDe()){
			return stu2.getDe()-stu1.getDe();
		}
		else{
			return stu1.getId().compareTo(stu2.getId());
		}
		
	}

}
