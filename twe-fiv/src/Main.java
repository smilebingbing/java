import java.util.Scanner;
public class Main {
		public static void main(String[] args) {
          Scanner s=new Scanner(System.in);
          String[] week={"MON","TUE","WED","THU","FRI","SAT","SUN"};
          char ch[]=new char[2];
          int minu=0;
          int flag1=0,flag2=0;
          String s1=s.nextLine();
          String s2=s.nextLine();
          String s3=s.nextLine();
          String s4=s.nextLine();
          int minlength1=s1.length()<s2.length()?s1.length():s2.length();
          int minlength2=s3.length()<s4.length()?s3.length():s4.length();
          for(int i=0;i<minlength1;i++){
        	  if(s1.charAt(i)==s2.charAt(i)&&s1.charAt(i)>='A'&&s1.charAt(i)<='G'&&flag1==0){
        		  ch[0]=s1.charAt(i);
        		  flag1=1;
        		  continue;
        	  }
        	  if((s1.charAt(i)==s2.charAt(i))&&((s1.charAt(i)>='A'&&s1.charAt(i)<='N')||(s1.charAt(i)>='0'&&s1.charAt(i)<='9')&&flag1==1&&flag2==0)){
        		  ch[1]=s1.charAt(i);
        		  flag2=1;
        		  break;
        	  }
          }
          for(int i=0;i<minlength2;i++){
        	  if(s3.charAt(i)==s4.charAt(i)&&((s3.charAt(i)>='A'&&s3.charAt(i)<='Z')||(s3.charAt(i)>='a'&&s3.charAt(i)<='z'))){
        		  minu=i;
        		  break;
        	  }
          }
          if(minu>=0&&minu<=9){
        	  if(ch[1]>='0'&&ch[1]<='9'){
        		  System.out.print(week[ch[0]-'A']+" "+"0"+ch[1]+":0"+minu);
        	  }
        	  if(ch[1]>='A'&&ch[1]<='N'){
        		  System.out.print(week[ch[0]-'A']+" "+(ch[1]-'A'+10)+":0"+minu);
        	  }
          }
          else{
        	  if(ch[1]>='0'&&ch[1]<='9'){
        		  System.out.print(week[ch[0]-'A']+" "+"0"+ch[1]+":"+minu);
        	  }
        	  if(ch[1]>='A'&&ch[1]<='N'){
        		  System.out.print(week[ch[0]-'A']+" "+(ch[1]-'A'+10)+":"+minu);
        	  }
          }
          

}
}