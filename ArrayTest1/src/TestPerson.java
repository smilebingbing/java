class Person{
	private String name;
	private int age;
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
}

class Student extends Person{
	private String school;
	public String getSchool(){
		return school;
	}
	public void setSchool(String school){
		this.school=school;
	}
}

public class TestPerson{
	public static void main(String arg[]){
		Student stu=new Student();
		stu.setName("John");
		stu.setAge(18);
		stu.setSchool("SCH");
		System.out.println(stu.getAge());
	}
}


