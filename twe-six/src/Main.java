import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;


public class Main {

	public static void main(String[] args) {
		  int count=0;
          Scanner s=new Scanner(System.in);
          int N=s.nextInt();
          int L=s.nextInt();
          int H=s.nextInt();
          student stu=null;
          Vector v=new Vector();
          Vector v1=new Vector();
          Vector v2=new Vector();
          Vector v3=new Vector();
          Vector v4=new Vector();
                   
          if(N>100000||L<60||H>100){
        	  System.out.println("data error");
          }
          for(int i=0;i<N;i++){
        	  stu=new student();
        	  stu.setId(s.next());
        	  stu.setDe(s.nextInt());
        	  stu.setCai(s.nextInt());
        	  if(stu.getDe()>=L&&stu.getCai()>=L){
        		  v.add(stu);
        		  count++;
        	  }
          }
          for(int i=0;i<v.size();i++){
        	  if(((student) v.get(i)).getDe()>=H&&((student) v.get(i)).getCai()>=H){
        		  v1.add(v.get(i));
        	  }
        	  else if(((student) v.get(i)).getDe()>=H&&((student) v.get(i)).getCai()<H){
        		  v2.add(v.get(i));
        	  }
        	  else if(((student) v.get(i)).getDe()<H&&((student) v.get(i)).getCai()<H&&((student) v.get(i)).getDe()>((student) v.get(i)).getCai()){
        		  v3.add(v.get(i));
        	  }
        	  else{
        		  v4.add(v.get(i));
        	  }
          }
          Comparator cm=new MyComparator1();
          Collections.sort(v1,cm);
          Collections.sort(v2,cm);
          Collections.sort(v3,cm);
          Collections.sort(v4,cm);
          System.out.println(count);
          for(int i=0;i<v1.size();i++){
        	  System.out.println(((student) v1.get(i)).getId()+" "+((student)v1.get(i)).getDe()+" "+((student)v1.get(i)).getCai());
          }
          for(int i=0;i<v2.size();i++){
        	  System.out.println(((student) v2.get(i)).getId()+" "+((student)v2.get(i)).getDe()+" "+((student)v2.get(i)).getCai());
          }
          for(int i=0;i<v3.size();i++){
        	  System.out.println(((student) v3.get(i)).getId()+" "+((student)v3.get(i)).getDe()+" "+((student)v3.get(i)).getCai());
          }
          for(int i=0;i<v4.size();i++){
        	  System.out.println(((student) v4.get(i)).getId()+" "+((student)v4.get(i)).getDe()+" "+((student)v4.get(i)).getCai());
          }
          
          
          
          
          
          
          
          
          
	}

}
