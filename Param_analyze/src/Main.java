import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		LinkedList<String> link=new LinkedList<String>();
		while(sc.hasNext()){
			link.add(sc.nextLine());
		}
		int index=0;
		while(index<link.size()){
			String s=link.get(index);
			if(s.charAt(0)!='\"'){
				index++;
			}else{
				if(s.charAt(0)=='\"'&&s.charAt(s.length()-1)=='\"'){
					link.set(index,s.substring(1, s.length()-1));
					index++;
				}else{
					link.set(index, s+" "+link.get(index+1));
					link.remove(index+1);
				}
			}
		}
		
	System.out.println(link.size());
	for(String li:link){
		System.out.println(li);
	}
	}
}
