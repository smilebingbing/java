import java.util.*;
public class BasicContainer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Collection c=new HashSet();
        c.add("hello");
        c.add(new Name("f1","l1"));
        c.add(new Integer(100));
        c.remove("hello");
        c.remove(new Integer(100));
        System.out.println(c.remove(new Name("f1","l1")));
        System.out.println(c);
	}

}
class Name{
	private String firstname,lastname;
	public Name(String firstname,String lastname){
		this.firstname=firstname;
		this.lastname=lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	@Override
	public String toString() {
		return firstname+" "+lastname;
	}
	public boolean equals(Object obj){
		if(obj instanceof Name){
			Name name=(Name) obj;
			return(firstname.equals(name.firstname))&&(lastname.equals(name.lastname));
		}
		return super.equals(obj);
		}
	public int hashCode(){
		return firstname.hashCode();
	}
}